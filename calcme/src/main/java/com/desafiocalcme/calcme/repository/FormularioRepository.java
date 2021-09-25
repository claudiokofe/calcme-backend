package com.desafiocalcme.calcme.repository;

import com.desafiocalcme.calcme.model.Formulario;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface FormularioRepository extends MongoRepository<Formulario, String> {

}
