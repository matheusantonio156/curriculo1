package com.example.curriculo1.repository;

import com.example.curriculo1.entity.InformacoesPessoais;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepInformacoesPessoais extends JpaRepository<InformacoesPessoais, Long> {
}