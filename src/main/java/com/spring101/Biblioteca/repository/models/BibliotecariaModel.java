package com.spring101.Biblioteca.repository.models;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "Bibliotecaria")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BibliotecariaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false, unique = true)
    private Integer id;
    private String nome;
    private int idade;
    private String endereco;
    private String telefone;
    private String cidade;
    private String estado;

    @OneToOne(mappedBy = "bibliotecaria", cascade = CascadeType.ALL)
    private LeitorModel leitor;
}
