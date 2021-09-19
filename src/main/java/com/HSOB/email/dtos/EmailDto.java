package com.HSOB.email.dtos;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity//entou dizendo que essa classe é uma entidade do banco de dados
@Document(collection = "character")
public class EmailDto {


//    private Long emailId;

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
