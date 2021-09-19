package com.HSOB.email.dtos;

import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class EmailDto {


    private Long emailId;

    @NotBlank
    private String ownerRef; //referencia de quem envia

    @NotBlank
    @Email
    private String emailFrom;

    @NotBlank
    @Email
    private String emailTo;

    @NotBlank
    private String subject;

    @NotBlank
    private String text;

}
