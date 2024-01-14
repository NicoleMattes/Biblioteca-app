package com.spring101.Biblioteca.repository;

import com.spring101.Biblioteca.entity.Bibliotecaria;
import com.spring101.Biblioteca.repository.models.BibliotecariaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BibliotecariaRepository extends JpaRepository<BibliotecariaModel, Integer> {
    Bibliotecaria findByNome(String nome);
}
