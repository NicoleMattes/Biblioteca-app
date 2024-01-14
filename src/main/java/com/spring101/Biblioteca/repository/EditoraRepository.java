package com.spring101.Biblioteca.repository;

import com.spring101.Biblioteca.repository.models.EditoraModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EditoraRepository extends JpaRepository<EditoraModel, Integer>{
  EditoraModel findByNome(String nome);
}
