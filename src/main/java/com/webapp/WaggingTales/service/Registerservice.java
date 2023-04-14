//package com.webapp.WaggingTales.service;
//import com.webapp.WaggingTales.model.Registers;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class Registerservice {
//    public List<Registers> listregister(){
//        return List.of(
//                new Registers(
//                        "Chethan",
//                        "Peter",
//                        "chetpetr@gmail.com"
//                ),
//
//                new Registers(
//                        "Cristiano",
//                        "Ronaldo",
//                        "cr7@gmail.com"
//                ),
//                new Registers(
//                        "Lionel",
//                        "Messi",
//                        "lm10@gmail.com"
//                ),
//                new Registers(
//                        "Eden",
//                        "Hazard",
//                        "eh10@gmail.com"
//                ),
//                new Registers(
//                        "Kai",
//                        "Havertz",
//                        "kh29@gmail.com"
//                ),
//                new Registers(
//                        "dhruv",
//                        "s",
//                        "dhruvs@gmail.com"
//                ),
//                new Registers(
//                        "anagha",
//                        "r",
//                        "anaghar@gmail.com"
//                ),
//                new Registers(
//                        "vismaya",
//                        "mohan",
//                        "vismayamohan@gmail.com"
//                ),
//                new Registers(
//                        "akhil",
//                        "bab",
//                        "akhib@gmail.com"
//                )
//        );
//    }
//
//}
//
//package com.webapp.WaggingTales.service;
//import com.webapp.WaggingTales.entity.RegisterEntity;
//import com.webapp.WaggingTales.repository.RegisterRepository;
//
//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;
////import jakarta.transaction.Transactional;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collector;
//import java.util.stream.Collectors;
//
//////vishnu code
//@Service
//public class Registerservice {
//    private final RegisterRepository registerRepository;
//
//    public Registerservice(RegisterRepository registerRepository){
//        this.registerRepository = registerRepository;
//    }
//    @Transactional
//    public void saveRegister(RegisterEntity register){
//        RegisterEntity.setfirst_name(register.getFirstName());
//        RegisterEntity.setlast_name(register.getLastName());
//        RegisterEntity.setuser_email(register.getUserEmail());
//    }
//
//    public List<RegisterEntity> listRegisters() throws IOException{
//        ObjectMapper mapper = new ObjectMapper();
//        List<RegisterEntity> registerEntities = RegisterRepository.findAll();
//        return registerEntities.stream().map(RegisterEntity -> mapper.convertValue(registerEntity, RegisterEntity.class))
//                .collect(Collectors.toList());
//    }
//    public List<JsonNode> getRegistersByfirst_name(String first_name) throws IOException{
//        List<RegisterEntity> registerEntities = registerRepository.findByfirst_name(String.parseInt(first_name));
//        ObjectMapper mapper = new ObjectMapper();
//        List<JsonNode> jsonNodes = new ArrayList<>();
//        for (RegisterEntity registerEntity : registerEntities){
//            JsonNode node = mapper.convertValue(RegisterEntity, JsonNode.class);
//            jsonNodes.add(node);
//        }
//        return jsonNodes;
//    }
//    public List<JsonNode> getRegistersBylast_name(String last_name) throws IOException{
//        List<RegisterEntity> registerEntities = registerRepository.findBylast_name(String.parseInt(last_name));
//        ObjectMapper mapper = new ObjectMapper();
//        List<JsonNode> jsonNodes = new ArrayList<>();
//        for (RegisterEntity registerEntity : registerEntities){
//            JsonNode node = mapper.convertValue(RegisterEntity, JsonNode.class);
//            jsonNodes.add(node);
//        }
//        return jsonNodes;
//    }
//    public List<JsonNode> getRegistersByuser_email(String user_email) throws IOException{
//        List<RegisterEntity> registerEntities = registerRepository.findByuser_email(String.parseInt(user_email));
//        ObjectMapper mapper = new ObjectMapper();
//        List<JsonNode> jsonNodes = new ArrayList<>();
//        for (RegisterEntity registerEntity : registerEntities){
//            JsonNode node = mapper.convertValue(RegisterEntity, JsonNode.class);
//            jsonNodes.add(node);
//        }
//        return jsonNodes;
//    }
//    public boolean deleteRegistersByuser_email(String user_email) throws IOException{
//        try{
//            RegisterRepository.deleteByuser_email(String.parseInt(RegisterID));
//            return true;
//        } catch (Exception ex){
//            return false;
//        }
//    }
//
//}


//
//
//import com.webapp.WaggingTales.entity.RegisterEntity;
//import com.example.repository.RegisterRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//@Service
//public class Registerservice {
//
//    @Autowired
//    private RegisterRepository registerRepository;
//
//    @Transactional
//    public void saveRegister(RegisterEntity register) {
//        registerRepository.save(register);
//    }
//
//    public List<RegisterEntity> listRegisters() {
//        return registerRepository.findAll();
//    }
//
//    public List<JsonNode> getRegistersByfirst_name(String first_name) {
//        return registerRepository.findByFirstName(first_name);
//    }
//
//    public List<JsonNode> getRegistersBylast_name(String last_name) {
//        return registerRepository.findByLastName(last_name);
//    }
//
//    public List<JsonNode> getRegistersByuser_email(String user_email) {
//        return registerRepository.findByUserEmail(user_email);
//    }
//
//    public boolean deleteRegistersByuser_email(String user_email) {
//        List<RegisterEntity> registers = registerRepository.findByUserEmail(user_email);
//        if (registers.isEmpty()) {
//            return false;
//        } else {
//            registerRepository.deleteByUserEmail(user_email);
//            return true;
//        }
//    }
//}
////last code
//package com.webapp.WaggingTales.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.fasterxml.jackson.databind.JsonNode;
//import com.webapp.WaggingTales.entity.RegisterEntity;
//import com.webapp.WaggingTales.repository.RegisterRepository;
//
//@Service
//public class Registerservice {
//
//    @Autowired
//    private RegisterRepository registerRepository;
//
//    public void saveRegister(RegisterEntity register) {
//        registerRepository.save(register);
//    }
//
//    public List<RegisterEntity> listRegisters() {
//        return (List<RegisterEntity>) registerRepository.findAll();
//    }
//
//    public Optional<RegisterEntity> getRegisterById(String useremail) {
//        return registerRepository.findById(useremail);
//    }
//
//    public List<JsonNode> getRegistersByfirstname(String firstname) {
//        return registerRepository.findByfirstName(firstname);
//    }
//
//    public List<JsonNode> getRegistersBylastname(String lastname) {
//        return registerRepository.findBylastName(lastname);
//    }
//
//    public List<JsonNode> getRegistersByuseremail(String useremail) {
//        return registerRepository.findByuserEmail(useremail);
//    }
//
//    public boolean deleteRegistersByuser_email(String useremail) {
//        Optional<RegisterEntity> optionalRegister = registerRepository.findById(useremail);
//        if (optionalRegister.isPresent()) {
//            registerRepository.delete(optionalRegister.get());
//            return true;
//        } else {
//            return false;
//        }
//    }
//}

package com.webapp.WaggingTales.service;

import com.webapp.WaggingTales.bean.RegisterBean;
import com.webapp.WaggingTales.repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Service
public class Registerservice {
    @Autowired
    public RegisterRepository registerrepo;
    public List<RegisterBean> getAllRegisters(){
        return new ArrayList<>(registerrepo.findAll());
    }

    public void addRegister(RegisterBean registerBean){
        registerrepo.save(registerBean);
    }

    public void updateRegister(String useremail, RegisterBean registerBean){
        registerrepo.save(registerBean);
    }

    public void deleteRegister(String useremail){
        registerrepo.deleteById(useremail);
    }
}