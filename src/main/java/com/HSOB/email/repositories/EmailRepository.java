package com.HSOB.email.repositories;

import com.HSOB.email.models.EmailModel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

//responsavel pelos métodos que acessam o banco de dados
//suficiente para as consultas basicas no banco
//MongoRepository ja possui varios metodos prontos para fazer pesquisas no banco
public interface EmailRepository extends MongoRepository<EmailModel, UUID> {
}
