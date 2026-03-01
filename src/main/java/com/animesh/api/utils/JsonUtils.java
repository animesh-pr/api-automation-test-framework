package com.animesh.api.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

public class JsonUtils {

    public static List<Map<String, Object>> readJson(String fileName) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream inputStream = JsonUtils.class
                    .getClassLoader()
                    .getResourceAsStream("testdata/" + fileName);

            return mapper.readValue(inputStream,
                    new TypeReference<List<Map<String, Object>>>() {});
        } catch (Exception e) {
            throw new RuntimeException("Failed to read JSON file");
        }
    }
}