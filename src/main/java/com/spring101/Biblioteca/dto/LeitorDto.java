package com.spring101.Biblioteca.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LeitorDto {
    private Integer id;
    private String nome;
    private int idade;
    private String telefone;
    private String email;
    private String endereco;
    private String cidade;
    private String estado;
    private String cpf;
}
