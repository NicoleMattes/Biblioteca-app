package com.spring101.Biblioteca.repository;


import com.spring101.Biblioteca.repository.models.LivroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LivroRepository extends JpaRepository<LivroModel, Integer> {
}
