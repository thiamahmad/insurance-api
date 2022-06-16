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
import com.iso4digit.insuranceapi.models.Cedant;
import com.iso4digit.insuranceapi.utils.DataLoader;

@Service
public class BrancheRepository {

    private static Branche[] branches;
    static {
        branches = DataLoader.loadData("src/main/resources/branches.json", Branche[].class);
    }

    public Branche findBrancheById(String id) {
        return Arrays.stream(branches)
                .filter(branche -> Objects.equals(branche.get_id().getOid(), id))
                .findFirst()
                .orElse(null);
    }

    public Branche findBrancheByName(String name) {
        return Arrays.stream(branches)
                .filter(branche -> Objects.equals(branche.getName(), name))
                .findFirst()
                .orElse(null);
    }

    public Branche findCendantBranche(Cedant d) {
        return Arrays.stream(branches)
                .filter(c -> Objects.equals(c.get_id().getOid(), d.getCountries_id().getOid()))
                .findFirst()
                .orElse(null);
    }
}
