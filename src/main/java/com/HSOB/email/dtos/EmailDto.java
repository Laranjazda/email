package com.HSOB.email.dtos;

import com.HSOB.email.models.EmailModel;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity//entou dizendo que essa classe é uma entidade do banco de dados
@Document(collection = "character")
public class EmailDto {
    EmailModel emailModel = new EmailModel();

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long emailId ;
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
