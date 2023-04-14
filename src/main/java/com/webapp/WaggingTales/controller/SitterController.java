//package com.webapp.WaggingTales.controller;
//
////import com.github.lbovolini.mapper.ObjectMapper;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.webapp.WaggingTales.model.Registers;
//import com.webapp.WaggingTales.model.Sitters;
//import com.webapp.WaggingTales.service.Registerservice;
//import com.webapp.WaggingTales.service.Sitterservice;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//
//import java.io.File;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.util.ArrayList;
//import java.util.List;
//
//
//@RestController
//@RequestMapping ("sitter")
//
//
//public class SitterController {
//
//
//    private final Sitterservice Sitterservice;
//
//    @Autowired
//    public SitterController(Sitterservice Sitterservice) {
//        this.Sitterservice = Sitterservice;
//    }
//
//    @GetMapping
//    @CrossOrigin(origins ="*")
//    public List<Sitters> listsitter() {
//        return Sitterservice.listsitter();
//    }
//
//
//    @GetMapping(value = "/getsitterdata")
//    @CrossOrigin(origins ="*")
//    public ResponseEntity<String> getJsonData() throws IOException {
//        ClassPathResource jsonResource = new ClassPathResource("json/sitterpost.json");
//        Path jsonFilePath = jsonResource.getFile().toPath();
//        String jsonData = Files.readString(jsonFilePath);
//        return ResponseEntity.ok(jsonData);
//    }
//    //       public String getData(@RequestBody Register register){
////      return "First name : "+register.getFirstname() + "Last name : "+register.getLastname() + "Email : "+register.getEmailname();
////    }
//    @PostMapping(value = "/postsitterdata")
//    @CrossOrigin(origins ="*")
//    public String addRegister(@RequestBody Sitter sitter) throws IOException {
//        ObjectMapper objectMapper = new ObjectMapper();
//        File file = new File("src/main/resources/json/sitterpost.json");
//        List<Sitter> sitterList;
//        if (file.exists()) {
//            //read existing json file
//            sitterList = SitterReader.readSitterJson(file);
//        } else {
//            //create new lists
//            sitterList = new ArrayList<>();
//        }
//        //add new register to list
//        sitterList.add(sitter);
//        //write updated list to json file
//        objectMapper.writeValue(file, sitterList);
//        System.out.println("Submitted data: " + objectMapper.writeValueAsString(sitter));
//        return "Registered successfully";
//
//    }
//}
//
