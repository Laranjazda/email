package com.HSOB.email.controllers;

import com.HSOB.email.dtos.EmailDto;
import com.HSOB.email.models.EmailModel;
import com.HSOB.email.services.EmailService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/api")
public class EmailController {
    @Autowired
    EmailService emailService;

    @PostMapping("/sendingMail")
    public ResponseEntity<EmailModel> sendingEmail(@RequestBody @Valid EmailDto emailDto){//recebo os parametros e Valid com o @Valid
        EmailModel emailModel = new EmailModel();//instancio o email model para poder converter o dto em model
        BeanUtils.copyProperties(emailDto, emailModel);
        emailService.sendEmail(emailModel);//criar método no service
        return new ResponseEntity<>(emailModel, HttpStatus.OK);
    }
}
