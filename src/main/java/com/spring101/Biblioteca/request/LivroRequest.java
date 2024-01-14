package com.spring101.Biblioteca.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LivroRequest {
    private String titulo;
    private String autor;
    private String editora;
    private String idioma;
    private String generoLiterario;
    private String resumo;
    private int numeroDePaginas;
}
