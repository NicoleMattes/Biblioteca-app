package com.spring101.Biblioteca.repository;

import com.spring101.Biblioteca.repository.models.LivroAutorEditoraModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroAutorEditoraRepository extends JpaRepository<LivroAutorEditoraModel, Integer> {
}
