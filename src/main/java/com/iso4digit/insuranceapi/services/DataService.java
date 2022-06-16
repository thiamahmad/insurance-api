package com.iso4digit.insuranceapi.services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

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

    /*public List<Data> getData(Map<String, String> qp) {
        Slip[] slips = slipRepository.getSlips();

        return Arrays.stream(slips)
                .filter(c -> Objects.equals(cedantRepository.getCedantRegionId(c.getCedants_id()), qp.get("region_id")))
                .filter(c -> Objects.equals(cedantRepository.getCedantCountryId(c.getCedants_id()), qp.get("country_id")))
                .filter(c -> Objects.equals(cedantRepository.getCedantGroupId(c.getCedants_id()), qp.get("group_id")))
                .filter(c -> Objects.equals(cedantRepository.getCedantTypeId(c.getCedants_id()),qp.get("cedant_type_id")))
                .filter(c -> Objects.equals(cedantRepository.getCedantId(c.getCedants_id()), qp.get("cedant_id")))
                .filter(c -> Objects.equals(c.getValidation_status(), qp.get("validation_status")))
                .filter(c -> Objects.equals(c.getConfirmation_status(), qp.get("confirmation_status")))
                .filter(c -> Objects.equals(this.formateDate(c.getPublished_date()),this.formateDate(qp.get("published_date"))))
                .filter(c -> Objects.equals(this.formateDate(c.getEdited_period()),this.formateDate(qp.get("edited_periode"))))
                .filter(c -> Objects.equals(cedantRepository.getCedantId(c.getCedants_id()), qp.get("cedant_id")))
                .map(c -> this.createNewDataInstance(c, qp.get("branche_id")))
                .collect(Collectors.toList());
    }*/

    public List<Data> getData(Map<String, String> qp) {
        CaseType[] cases = caseRepository.getCases();
        
        return Arrays.stream(cases)
                .filter(c -> Objects.equals(cedantRepository.getCedantRegionId(c.getCedants_id()), qp.get("region_id")))
                .filter(c -> Objects.equals(cedantRepository.getCedantCountryId(c.getCedants_id()), qp.get("country_id")))
                .filter(c -> Objects.equals(cedantRepository.getCedantGroupId(c.getCedants_id()), qp.get("group_id")))
                .filter(c -> Objects.equals(cedantRepository.getCedantTypeId(c.getCedants_id()),qp.get("cedant_type_id")))
                .filter(c -> Objects.equals(cedantRepository.getCedantId(c.getCedants_id()), qp.get("cedant_id")))
                .filter(c -> Objects.equals(slipRepository.getValidationStatus(c.getSlipes_prime_id()), qp.get("validation_status")))
                .filter(c -> Objects.equals(slipRepository.getConfirmationStatus(c.getSlipes_prime_id()), qp.get("confirmation_status")))
                .filter(c -> Objects.equals(this.getDate(slipRepository.getPublishedDate(c.getSlipes_prime_id())),qp.get("published_date")))
                .filter(c -> Objects.equals(slipRepository.getEditedPeriode(c.getSlipes_prime_id()),qp.get("edited_period")))
                .filter(c -> Objects.equals(c.getBranch(), qp.get("branche")))
                .map(c -> this.createNewDataInstance(slipRepository.findSlipeById(c.getSlipes_prime_id().getOid()), qp.get("branche")))
                .collect(Collectors.toList());
    }

    private Data createNewDataInstance(Slip s, String branche) {
        Data data = new Data();

        Cedant cedant = cedantRepository.findCedantById(s.getCedants_id().getOid());

        data.setReferences(s.getReference());
        data.setCountry(countryRepository.findCendantCountry(cedant).getName());
        data.setCedants(cedant.getName());
        data.setValidationStatus(s.getValidation_status());
        data.setConfirmationStatus(s.getConfirmation_status());
        data.setPublicationDate(s.getPublished_date());
        data.setBranche(brancheRepository.findBrancheByName(branche).getName());
        return data;

      
    }

    private String getDate(String date) {
        String[] split = date.split(" ");
        return split[0];
    }

    private LocalDate convertEditedDate(String ed){
       return LocalDate.parse(ed, DateTimeFormatter.ofPattern("MMMM yyyy"));
    }

}
