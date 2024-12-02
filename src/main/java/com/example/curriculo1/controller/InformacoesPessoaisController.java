package com.example.curriculo1.controller;

import com.example.curriculo1.entity.InformacoesPessoais;
import com.example.curriculo1.repository.RepInformacoesPessoais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/informacoes")
public class InformacoesPessoaisController {

    @Autowired
    private RepInformacoesPessoais repositorio;

    @GetMapping
    public List<InformacoesPessoais> listar() {
        return repositorio.findAll();
    }

    @PostMapping
    public InformacoesPessoais criar(@RequestBody InformacoesPessoais informacoesPessoais) {
        return repositorio.save(informacoesPessoais);
    }
}