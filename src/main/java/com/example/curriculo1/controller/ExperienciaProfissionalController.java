package com.example.curriculo1.controller;

import com.example.curriculo1.entity.ExperienciaProfissional;
import com.example.curriculo1.repository.RepExperienciaProfissional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/experiencias")
public class ExperienciaProfissionalController {

    @Autowired
    private RepExperienciaProfissional repositorio;

    @GetMapping
    public List<ExperienciaProfissional> listar() {
        return repositorio.findAll();
    }

    @PostMapping
    public ExperienciaProfissional criar(@RequestBody ExperienciaProfissional experienciaProfissional) {
        return repositorio.save(experienciaProfissional);
    }
}