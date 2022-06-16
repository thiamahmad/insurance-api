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
import com.iso4digit.insuranceapi.models.Id;
import com.iso4digit.insuranceapi.utils.DataLoader;

@Service
public class CedantRepository {

    private static Cedant[] cedants;
    static {
        cedants = DataLoader.loadData("src/main/resources/cedants.json", Cedant[].class);
    }

    public Cedant findCedantById(String id) {
        return Arrays.stream(cedants)
                .filter(c -> Objects.equals(c.get_id().getOid(), id))
                .findFirst()
                .orElse(null);
    }

    public String getCedantId(Id cedantId){
        return this.findCedantById(cedantId.getOid()).get_id().getOid();
    }

    public String getCedantRegionId(Id cedantId){
        return this.findCedantById(cedantId.getOid()).getRegion_id().getOid();
    }

    public String getCedantCountryId(Id cedantId){
        return this.findCedantById(cedantId.getOid()).getCountries_id().getOid();
    }

    public String getCedantGroupId(Id cedantId){
        return this.findCedantById(cedantId.getOid()).getGroups_cedants_id().getOid();
    }

    public String getCedantTypeId(Id cedantId){
        return this.findCedantById(cedantId.getOid()).getTypes_cedants_id().getOid();
    }

    
    
}
