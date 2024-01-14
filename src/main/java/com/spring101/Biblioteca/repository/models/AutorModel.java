package com.spring101.Biblioteca.repository.models;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name = "Autor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AutorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;

    @Column(nullable = false)
    private String nome;

    @Column(name = "data_de_nascimento")
    private String dataDeNascimento;

    @Column(name = "pais_de_origem")
    private String paisDeOrigem;

    @ManyToMany
    @JoinTable(
            name = "Autor_Livro_Editora",
            joinColumns = @JoinColumn(name = "Autor_ID"),
            inverseJoinColumns = @JoinColumn(name = "Livro_ID")
    )
    private List<LivroModel> livros;
}
