package com.HSOB.email.repositories;

import com.HSOB.email.models.EmailModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmailRepository extends MongoRepository<EmailModel, Long> {
}
