package com.HSOB.email.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusDBOConnections {
    @GetMapping(path = "/api/status")
    public String checkStatus(){
        return "H.S.O.B. Microservice Email Online ";
    }
}
