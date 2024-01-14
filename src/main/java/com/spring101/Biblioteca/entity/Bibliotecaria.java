package com.spring101.Biblioteca.entity;

import com.spring101.Biblioteca.repository.models.BibliotecariaModel;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Bibliotecara")
public class Bibliotecaria extends BibliotecariaModel {
}
