package com.HSOB.email.controllers;

import com.HSOB.email.dtos.EmailDto;
import com.HSOB.email.models.EmailModel;
import com.HSOB.email.repositories.EmailRepository;
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
    @Autowired//impostação do repositori e poder utiliar os metodos apra conectar no banco de dados
    private EmailService emailService;
    private EmailRepository emailRepository;

    @PostMapping("/sendingMail")
    public ResponseEntity<EmailModel> sendingEmail(@RequestBody EmailDto emailDto){//recebo os parametros e Valid com o @Valid
        EmailModel emailModel = new EmailModel();
        BeanUtils.copyProperties(emailDto, emailModel);//converto o DTO no model instanciado acima
        emailService.sendEmail(emailModel);//criar método no service
        return new ResponseEntity<>(emailModel, HttpStatus.OK);
    }
}
