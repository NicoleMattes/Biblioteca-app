package com.spring101.Biblioteca.repository.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name = "Livro")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LivroModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id", nullable = false, unique = true)
    private Integer id;

    @Column(name = "Titulo", length = 150, nullable = false)
    private String titulo;

    @Column(name = "Resumo", columnDefinition = "TEXT")
    private String resumo;

    @Column(name = "numero_de_paginas", nullable = false)
    private int numeroDePaginas;

    @Column(name = "Idioma", length = 50, nullable = false)
    private String idioma;

    @Column(name = "genero_literario", length = 100)
    private String generoLiterario;

    @ManyToMany(mappedBy = "livros")
    private List<AutorModel> autores;
}


