package com.spring101.Biblioteca.repository;

import com.spring101.Biblioteca.entity.Leitor;
import com.spring101.Biblioteca.repository.models.LeitorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LeitorRepository extends JpaRepository<LeitorModel, Integer> {

}
