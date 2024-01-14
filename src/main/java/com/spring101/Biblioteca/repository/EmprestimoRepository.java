package com.spring101.Biblioteca.repository;

import com.spring101.Biblioteca.repository.models.EmprestimoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmprestimoRepository extends JpaRepository<EmprestimoModel, Integer> {
}
