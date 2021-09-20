package com.HSOB.email.models;

import com.HSOB.email.enums.StatusEmail;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity//entou dizendo que essa classe é uma entidade do banco de dados
@Document(collection = "api_email")
public class EmailModel  implements Serializable {
//    private static final long serialVersion = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID emailId;//https://medium.com/trainingcenter/o-que-%C3%A9-uuid-porque-us%C3%A1-lo-ad7a66644a2b
    private String ownerRef; //referencia de quem envia
    private String emailFrom;
    private String emailTo;
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String text;
    private LocalDateTime sendDateEmail;
    private StatusEmail statusEmail;//criar a entidade

    public UUID getEmailId() {
        return emailId;
    }

    public void setEmailId(UUID emailId) {
        this.emailId = emailId;
    }

    public String getOwnerRef() {
        return ownerRef;
    }

    public void setOwnerRef(String ownerRef) {
        this.ownerRef = ownerRef;
    }

    public String getEmailFrom() {
        return emailFrom;
    }

    public void setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom;
    }

    public String getEmailTo() {
        return emailTo;
    }

    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getSendDateEmail() {
        return sendDateEmail;
    }

    public void setSendDateEmail(LocalDateTime sendDateEmail) {
        this.sendDateEmail = sendDateEmail;
    }

    public StatusEmail getStatusEmail() {
        return statusEmail;
    }

    public void setStatusEmail(StatusEmail statusEmail) {
        this.statusEmail = statusEmail;
    }
}
