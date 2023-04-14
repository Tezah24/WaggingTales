package com.webapp.WaggingTales.service;

import com.webapp.WaggingTales.entity.RegisterEntity;
import com.webapp.WaggingTales.repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RegisterService {
    @Autowired
    private RegisterRepository registerRepository;

    public ArrayList listRegisterData() {
        return new ArrayList<>(registerRepository.findAll());
    }

    public void saveRegisterBean(RegisterEntity registerEntity) {
        registerRepository.save(registerEntity);
    }
}
