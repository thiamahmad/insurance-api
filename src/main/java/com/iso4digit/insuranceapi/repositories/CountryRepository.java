package com.iso4digit.insuranceapi.repositories;

import java.util.Arrays;
import java.util.Objects;

import org.springframework.stereotype.Service;

import com.iso4digit.insuranceapi.models.Branche;
import com.iso4digit.insuranceapi.models.Cedant;
import com.iso4digit.insuranceapi.models.Country;
import com.iso4digit.insuranceapi.utils.DataLoader;

@Service
public class CountryRepository {

    private static Country[] countries;
    static {
        countries = DataLoader.loadData("src/main/resources/countries.json", Country[].class);
    }

    public Country findCountryById(String id) {
        return Arrays.stream(countries)
                .filter(c -> Objects.equals(c.get_id().getOid(), id))
                .findFirst()
                .orElse(null);
    }

    public Country findCendantCountry(Cedant d) {
        return Arrays.stream(countries)
                .filter(c -> Objects.equals(c.get_id().getOid(), d.getCountries_id().getOid()))
                .findFirst()
                .orElse(null);
    }

}
