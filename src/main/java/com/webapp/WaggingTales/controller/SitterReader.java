package com.webapp.WaggingTales.controller;

//import com.github.lbovolini.mapper.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.asm.TypeReference;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class SitterReader {


    public static List<Sitter> readSitterJson(File file) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<Sitter>> typeRef = new TypeReference<List<Sitter>>() {
        };
        List<Sitter> sitterList = objectMapper.readValue(file, typeRef);
        return sitterList;
    }

}