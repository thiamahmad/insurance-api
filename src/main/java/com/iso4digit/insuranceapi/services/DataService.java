package com.iso4digit.insuranceapi.services;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.management.loading.PrivateClassLoader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iso4digit.insuranceapi.models.CaseType;
import com.iso4digit.insuranceapi.models.Cedant;
import com.iso4digit.insuranceapi.models.Data;
import com.iso4digit.insuranceapi.models.Slip;
import com.iso4digit.insuranceapi.repositories.BrancheRepository;
import com.iso4digit.insuranceapi.repositories.CaseRepository;
import com.iso4digit.insuranceapi.repositories.CedantRepository;
import com.iso4digit.insuranceapi.repositories.CountryRepository;
import com.iso4digit.insuranceapi.repositories.SlipRepository;

@Service
public class DataService {

    @Autowired
    private SlipRepository slipRepository;
    @Autowired
    private CedantRepository cedantRepository;
    @Autowired
    private CountryRepository countryRepository;
    @Autowired
    private CaseRepository caseRepository;
    @Autowired
    private BrancheRepository brancheRepository;

    public List<Data> getData(Map<String, String> qp) {
        CaseType[] cases = caseRepository.getCases();

        Map<String, Data> datas = new HashMap<>();
        for (CaseType c : cases) {
            String key = c.getCedants_id().getOid() + c.getSlipes_prime_id().getOid() + c.getBranch();

            //if (this.match(c, qp)) {
                if (datas.get(key) == null) {
                    BigDecimal prime = BigDecimal.valueOf(c.getPremium_ht() * 0.36);
                    datas.put(key,
                            this.createNewDataInstance(
                                    slipRepository.findSlipeById(c.getSlipes_prime_id().getOid()),
                                    qp.get("branche"),
                                    prime));
                } else {
                    BigDecimal prime = datas.get(key).getCalculatedREC();
                    prime = BigDecimal.valueOf(c.getPremium_ht() * 0.36).add(prime);
                    datas.get(key).setCalculatedREC(prime);
                }
            //}

        }
        return new ArrayList<Data>(datas.values());

    }

    private boolean match(CaseType c, Map<String, String> qp) {
        return Objects.equals(cedantRepository.getCedantRegionId(c.getCedants_id()), qp.get("region_id"))
                && Objects.equals(cedantRepository.getCedantCountryId(c.getCedants_id()), qp.get("country_id"))
                && Objects.equals(cedantRepository.getCedantGroupId(c.getCedants_id()), qp.get("group_id"))
                && Objects.equals(cedantRepository.getCedantTypeId(c.getCedants_id()), qp.get("cedant_type_id"))
                && Objects.equals(cedantRepository.getCedantId(c.getCedants_id()), qp.get("cedant_id"))
                && Objects.equals(slipRepository.getValidationStatus(c.getSlipes_prime_id()),
                        qp.get("validation_status"))
                && Objects.equals(slipRepository.getConfirmationStatus(c.getSlipes_prime_id()),
                        qp.get("confirmation_status"))
                && Objects.equals(this.getDate(slipRepository.getPublishedDate(c.getSlipes_prime_id())),
                        qp.get("published_date"))
                && Objects.equals(slipRepository.getEditedPeriode(c.getSlipes_prime_id()), qp.get("edited_period"))
                && Objects.equals(c.getBranch(), qp.get("branche"));
    }

    private Data createNewDataInstance(Slip s, String branche, BigDecimal prime) {
        Data data = new Data();

        Cedant cedant = cedantRepository.findCedantById(s.getCedants_id().getOid());

        data.setReferences(s.getReference());
        data.setCountry(countryRepository.findCendantCountry(cedant).getName());
        data.setCedants(cedant.getName());
        data.setValidationStatus(s.getValidation_status());
        data.setConfirmationStatus(s.getConfirmation_status());
        data.setPublicationDate(s.getPublished_date());
        data.setBranche(brancheRepository.findBrancheByName(branche).getName());
        data.setCalculatedREC(prime);
        return data;

    }

    private String getDate(String date) {
        String[] split = date.split(" ");
        return split[0];
    }

    private LocalDate convertEditedDate(String ed) {
        return LocalDate.parse(ed, DateTimeFormatter.ofPattern("MMMM yyyy"));
    }

}
