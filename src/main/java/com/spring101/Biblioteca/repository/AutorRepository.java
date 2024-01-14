package com.spring101.Biblioteca.repository;

import com.spring101.Biblioteca.repository.models.AutorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<AutorModel, Integer> {
    AutorModel findByNome(String nome);
}
