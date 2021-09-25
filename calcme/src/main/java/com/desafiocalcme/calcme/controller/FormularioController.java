package com.desafiocalcme.calcme.controller;

import com.desafiocalcme.calcme.model.Formulario;
import com.desafiocalcme.calcme.repository.FormularioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class FormularioController {

    @Autowired
    private FormularioRepository formularioRepository;

    @PostMapping
    public Formulario adicionar(@Valid @RequestBody Formulario formulario) {
    return formularioRepository.save(formulario);
    }

}
