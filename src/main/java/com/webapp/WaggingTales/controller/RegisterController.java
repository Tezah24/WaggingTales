package com.webapp.WaggingTales.controller;

import com.webapp.WaggingTales.entity.RegisterEntity;
import com.webapp.WaggingTales.service.RegisterService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("register")
public class RegisterController {
    private final RegisterService registerservice;

    public RegisterController(RegisterService registerservice) {
        this.registerservice = registerservice;
    }

    @GetMapping("list_register")
    @CrossOrigin(origins = "*")
    public List<RegisterEntity> listregister() {
        return registerservice.listRegisterData();
    }

    @PostMapping("/postregister")
    @CrossOrigin(origins = "*")
    public void saveRegisterBean(@RequestBody RegisterEntity registerEntity) {
        System.out.println("RegisterController: saveRegisterBean");
        registerservice.saveRegisterBean(registerEntity);
    }
}
