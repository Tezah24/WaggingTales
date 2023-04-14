//package com.webapp.WaggingTales.controller;





//@RestController
//@RequestMapping ("register")
//
//
//public class RegisterController {
//
//
//   private final Registerservice Registerservice;
//
//    @Autowired
//    public RegisterController(Registerservice Registerservice) {
//        this.Registerservice = Registerservice;
//    }
//
//    @GetMapping
//    @CrossOrigin(origins ="*")
//    public List<Registers> listregister() {
//        return Registerservice.listregister();
//    }
//
//
//    @GetMapping(value = "/getregisterdata")
//    @CrossOrigin(origins ="*")
//    public ResponseEntity<String> getJsonData() throws IOException {
//        ClassPathResource jsonResource = new ClassPathResource("json/registerpost.json");
//        Path jsonFilePath = jsonResource.getFile().toPath();
//        String jsonData = Files.readString(jsonFilePath);
//        return ResponseEntity.ok(jsonData);
//    }
//
//    @PostMapping(value = "/postregisterdata")
//    @CrossOrigin(origins ="*")
//    public String addRegister(@RequestBody Register register) throws IOException {
//        ObjectMapper objectMapper = new ObjectMapper();
//        File file = new File("src/main/resources/json/registerpost.json");
//        List<Register> registerList;
//        if (file.exists()) {
//            //read existing json file
//            registerList = RegisterReader.readRegisterJson(file);
//        } else {
//            //create new lists
//            registerList = new ArrayList<>();
//        }
//        //add new register to list
//        registerList.add(register);
//        //write updated list to json file
//        objectMapper.writeValue(file, registerList);
//        System.out.println("Submitted data: " + objectMapper.writeValueAsString(register));
//        return "Registered successfully";
//
//    }
//}
//
//
//SQL
//
//@RestController
//@RequestMapping("/register")
//public class RegisterController {
//
//    private final RegisterRepository registerRepository;
//    private final ObjectMapper objectMapper;
//    @Autowired
//    public RegisterController(RegisterRepository registerRepository, ObjectMapper objectMapper) {
//        this.registerRepository = registerRepository;
//        this.objectMapper = objectMapper;
//    }
//
//    @GetMapping
//    @CrossOrigin(origins = "*")
//    public List<Registers> listregister() {
//        List<RegisterEntity> registerEntities = registerRepository.findAll();
//        List<Registers> registers = new ArrayList<>();
//        for (RegisterEntity entity : registerEntities) {
//            registers.add(new Registers(entity.getFirstname(), entity.getLastname(), entity.getEmailname()));
//        }
//        return registers;
//    }
//
//    @PostMapping(value = "/postregisterdata")
//    @CrossOrigin(origins = "*")
//    public String addRegister(@RequestBody Register register) throws IOException {
//        RegisterEntity entity = new RegisterEntity();
//        entity.setFirstname(register.getFirstname());
//        entity.setLastname(register.getLastname());
//        entity.setEmailname(register.getEmailname());
//        registerRepository.save(entity);
//        System.out.println("Submitted data: " + objectMapper.writeValueAsString(register));
//        return "Registered successfully";
//    }
//
//}


//vishnu code
//@RestController
//@RequestMapping("/register")
//
//public class RegisterController {
//    @Autowired
//    private final Registerservice registerservice;
//
//    public RegisterController(Registerservice registerservice) {
//        System.out.println("RegisterController===================");
//        this.registerservice = registerservice;
//    }
//
//
//    @PostMapping(value = "/postregisterdata")
//    @CrossOrigin(origins = "*")
//    public ResponseEntity<RegisterEntity> saveRegister(@RequestBody RegisterEntity register) throws IOException {
//        System.out.println("saveRegister===================");
//        registerservice.saveRegister(register);
//        return ResponseEntity.status(HttpStatusCode.valueOf(201)).build();
//    }
//
//    @GetMapping(value = "/getregisterdata")
//    @CrossOrigin(origins = "*")
//    public ResponseEntity<List<RegisterEntity>> listRegisters() throws IOException {
//        System.out.println("listRegisters===================");
//        List<RegisterEntity> registers = registerservice.listRegisters();
//        for (RegisterEntity element : registers) {
//            System.out.print(element + " ");
//        }
//        return ResponseEntity.ok(registerservice.listRegisters());
//    }
//    @GetMapping("registerdata/{firstname}")
//    @CrossOrigin(origins = "*")
//    public ResponseEntity<List<JsonNode>> getRegistersByfirstname(@PathVariable String firstname) throws IOException {
//        System.out.println("getRegistersByfirstname===================" + firstname);
//        System.out.println(registerservice.getRegistersByfirstname(firstname));
//        return ResponseEntity.ok(registerservice.getRegistersByfirstname(firstname));
//    }
//
//    @GetMapping("registerdata/{lastname}")
//    @CrossOrigin(origins = "*")
//    public ResponseEntity<List<JsonNode>> getRegistersBylastname(@PathVariable String lastname) throws IOException {
//        System.out.println("getRegistersBylastname===================" + lastname);
//        System.out.println(registerservice.getRegistersBylastname(lastname));
//        return ResponseEntity.ok(registerservice.getRegistersBylastname(lastname));
//    }
//
//    @GetMapping("registerdata/{useremail}")
//    @CrossOrigin(origins = "*")
//    public ResponseEntity<List<JsonNode>> getRegistersByuseremail(@PathVariable String useremail) throws IOException {
//        System.out.println("getRegistersByuseremail===================" + useremail);
//        System.out.println(registerservice.getRegistersByuseremail(useremail));
//        return ResponseEntity.ok(registerservice.getRegistersByuseremail(useremail));
//    }
//    @DeleteMapping("delete/{usermail}")
//    @CrossOrigin(origins = "*")
//    public ResponseEntity<Void> deleteRegistersByuseremail(@PathVariable String useremail) throws IOException {
//        System.out.println("deleteRegistersByuseremail===================" + useremail);
//        boolean deleted = registerservice.deleteRegistersByuser_email(useremail);
//        if (deleted) {
//            return ResponseEntity.noContent().build();
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//
//}
//


package com.webapp.WaggingTales.controller;

import com.webapp.WaggingTales.bean.RegisterBean;
import com.webapp.WaggingTales.service.Registerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RegisterController {
    @Autowired
    private Registerservice registerservice;
    @RequestMapping("/register")
    public List<RegisterBean> getAllRegisters(){
 return registerservice.getAllRegisters();
    }
    @RequestMapping(method = RequestMethod.POST, value = "/register")
    public void addRegister(@RequestBody RegisterBean registerBean){
    registerservice.addRegister(registerBean);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/register/{useremail}")
    public void updateRegister( @PathVariable String useremail, @RequestBody RegisterBean registerBean){
        registerservice.updateRegister(useremail, registerBean);
    }

    public void DeleteRegister(@PathVariable String useremail){
    registerservice.deleteRegister(useremail);
    }

}