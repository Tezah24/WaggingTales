//package com.webapp.WaggingTales.controller;
//
////import com.github.lbovolini.mapper.ObjectMapper;
//import com.fasterxml.jackson.databind.ObjectMapper;
////import org.springframework.asm.TypeReference;
//import com.fasterxml.jackson.core.type.TypeReference;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.List;
//
//public class RegisterReader {
//
//
//    public static List<Register> readRegisterJson(File file) throws IOException {
//        ObjectMapper objectMapper = new ObjectMapper();
//        TypeReference<List<Register>> typeRef = new TypeReference<List<Register>>() {
//        };
//        List<Register> registerList = objectMapper.readValue(file, typeRef);
//        return registerList;
//    }
//
//}