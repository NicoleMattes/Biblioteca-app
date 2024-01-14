package com.spring101.Biblioteca.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EditoraRequest {
    private String nome;
    private String paisDeOrigem;
    private int anoDeFundacao;
    private String website;
    private String telefone;
    private String email;
}
