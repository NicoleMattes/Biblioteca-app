package com.spring101.Biblioteca.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LeitorRequest {
    private Long id;
    private String nome;
    private Integer idade;
    private String telefone;
    private String email;
    private String endereco;
    private String cidade;
    private String estado;
    private String cpf;
}