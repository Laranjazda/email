package com.HSOB.email.consumers;

import com.HSOB.email.dtos.EmailDto;
import com.HSOB.email.models.EmailModel;
import com.HSOB.email.services.EmailService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;

public class EmailConsumer {
    @Autowired
    EmailService emailService;

    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void listen(@Payload EmailDto emailDto){
        EmailModel emailModel = new EmailModel();
        BeanUtils.copyProperties(emailDto, emailModel);
        emailService.sendEmail(emailModel);
        System.out.println("Status: " + emailModel.getStatusEmail().toString());
    }
}
