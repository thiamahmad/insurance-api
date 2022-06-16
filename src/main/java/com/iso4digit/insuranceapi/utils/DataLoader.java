package com.iso4digit.insuranceapi.utils;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataLoader {

    public static <T> T[] loadData(String fileName, Class<T[]> clazz) {
        Path path = new File(fileName).toPath();

        try (Reader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
            mapper.enable(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES);
            return mapper.readValue(reader, clazz);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
}
