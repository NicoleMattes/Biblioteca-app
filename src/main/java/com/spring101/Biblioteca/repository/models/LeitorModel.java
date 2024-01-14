package com.spring101.Biblioteca.repository.models;

import com.spring101.Biblioteca.entity.Leitor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity(name = "Leitor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LeitorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false, unique = true)
    private Integer id;

    @Column(name = "Nome", length = 255)
    private String nome;

    @Column(name = "Idade")
    private int idade;

    @Column(name = "Telefone", length = 20)
    private String telefone;

    @Column(name = "Email", length = 200)
    private String email;

    @Column(name = "Endereco", length = 255)
    private String endereco;

    @Column(name = "Cidade", length = 255)
    private String cidade;

    @Column(name = "Estado", length = 255)
    private String estado;

    @Column(name = "CPF", length = 20)
    private String cpf;

    @ManyToOne
    @JoinColumn(name = "Bibliotecaria_ID")
    private BibliotecariaModel bibliotecaria;


}


