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
import com.iso4digit.insuranceapi.models.GroupCedant;
import com.iso4digit.insuranceapi.utils.DataLoader;

@Service
public class GroupCedantRepository {

    private static GroupCedant[] groupCedants;
    static {
        groupCedants = DataLoader.loadData("src/main/resources/groups_cedants.json", GroupCedant[].class);
    }

    public GroupCedant findGroupCedantById(String id) {

        System.out.println(id);
        return Arrays.stream(groupCedants)
                .filter(c -> Objects.equals(c.get_id().getOid(), id))
                .findFirst()
                .orElse(null);
    }
}
