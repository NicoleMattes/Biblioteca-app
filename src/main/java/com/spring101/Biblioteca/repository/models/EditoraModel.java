package com.spring101.Biblioteca.repository.models;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "Editora")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EditoraModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private Integer id;

    private String nome;
    private int anoDeFundacao;
    private String paisDeorigem;
    private String website;
    private String telefone;
    private String email;
}
