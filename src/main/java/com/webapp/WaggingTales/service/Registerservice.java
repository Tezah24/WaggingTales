package com.webapp.WaggingTales.service;
import com.webapp.WaggingTales.model.Registers;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Registerservice {
    public List<Registers> listregister(){
        return List.of(
                new Registers(
                        "Chethan",
                        "Peter",
                        "chetpetr@gmail.com"
                ),

                new Registers(
                        "Cristiano",
                        "Ronaldo",
                        "cr7@gmail.com"
                ),
                new Registers(
                        "Lionel",
                        "Messi",
                        "lm10@gmail.com"
                ),
                new Registers(
                        "Eden",
                        "Hazard",
                        "eh10@gmail.com"
                ),
                new Registers(
                        "Kai",
                        "Havertz",
                        "kh29@gmail.com"
                ),
                new Registers(
                        "dhruv",
                        "s",
                        "dhruvs@gmail.com"
                ),
                new Registers(
                        "anagha",
                        "r",
                        "anaghar@gmail.com"
                ),
                new Registers(
                        "vismaya",
                        "mohan",
                        "vismayamohan@gmail.com"
                ),
                new Registers(
                        "akhil",
                        "bab",
                        "akhib@gmail.com"
                )
        );
    }

}
