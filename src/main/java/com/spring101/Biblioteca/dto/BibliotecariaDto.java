package com.spring101.Biblioteca.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BibliotecariaDto {
    private Integer id;
    private String nome;
    private int idade;
    private String endereco;
    private String telefone;
    private String cidade;
    private String estado;
}
