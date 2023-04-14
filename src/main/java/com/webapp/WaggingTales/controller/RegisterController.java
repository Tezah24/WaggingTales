package com.webapp.WaggingTales.controller;

//import com.github.lbovolini.mapper.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.webapp.WaggingTales.model.Registers;
import com.webapp.WaggingTales.service.Registerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping ("register")


public class RegisterController {


    private final Registerservice Registerservice;

    @Autowired
    public RegisterController(Registerservice Registerservice) {
        this.Registerservice = Registerservice;
    }

    @GetMapping
    @CrossOrigin(origins ="*")
    public List<Registers> listregister() {
        return Registerservice.listregister();
    }


    @GetMapping(value = "/getregisterdata")
    @CrossOrigin(origins ="*")
    public ResponseEntity<String> getJsonData() throws IOException {
        ClassPathResource jsonResource = new ClassPathResource("json/registerpost.json");
        Path jsonFilePath = jsonResource.getFile().toPath();
        String jsonData = Files.readString(jsonFilePath);
        return ResponseEntity.ok(jsonData);
    }
    //       public String getData(@RequestBody Register register){
//      return "First name : "+register.getFirstname() + "Last name : "+register.getLastname() + "Email : "+register.getEmailname();
//    }
    @PostMapping(value = "/postregisterdata")
    @CrossOrigin(origins ="*")
    public String addRegister(@RequestBody Register register) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("src/main/resources/json/registerpost.json");
        List<Register> registerList;
        if (file.exists()) {
            //read existing json file
            registerList = RegisterReader.readRegisterJson(file);
        } else {
            //create new lists
            registerList = new ArrayList<>();
        }
        //add new register to list
        registerList.add(register);
        //write updated list to json file
        objectMapper.writeValue(file, registerList);
        System.out.println("Submitted data: " + objectMapper.writeValueAsString(register));
        return "Registered successfully";

    }
}

//    @GetMapping("/data")
//    public String getData(@RequestBody Register register){
//        return "First name : "+register.getFirstname() + "Last name : "+register.getLastname() + "Email : "+register.getEmailname();
//    }
//}
