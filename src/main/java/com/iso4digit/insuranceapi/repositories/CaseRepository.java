package com.iso4digit.insuranceapi.repositories;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Objects;

import org.springframework.aop.aspectj.annotation.SingletonMetadataAwareAspectInstanceFactory;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.iso4digit.insuranceapi.models.Branche;
import com.iso4digit.insuranceapi.models.CaseType;
import com.iso4digit.insuranceapi.models.Id;
import com.iso4digit.insuranceapi.utils.DataLoader;

@Service
public class CaseRepository {

    private static CaseType[] cases;
    static {
        cases = DataLoader.loadData("src/main/resources/case_not_life_premium.json", CaseType[].class);
    }

    public CaseType findCaseById(String id) {
        return Arrays.stream(cases)
                .filter(c -> Objects.equals(c.get_id().getOid(), id))
                .findFirst()
                .orElse(null);
    }

    public CaseType findCaseByCedantId(String id) {
        return Arrays.stream(cases)
                .filter(c -> Objects.equals(c.getCedants_id().getOid(), id))
                .findFirst()
                .orElse(null);
    }

    

    public CaseType findCedant(Id id) {
        return Arrays.stream(cases)
                .filter(c -> Objects.equals(c.getSlipes_prime_id().getOid(), id.getOid()))
                .findFirst()
                .orElse(null);
    }

    public CaseType[] getCases() {
        return this.cases;
    }
}
