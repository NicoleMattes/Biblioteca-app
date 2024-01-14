package com.spring101.Biblioteca.request;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LivroAutorEditoraRequest {
    private Integer id;
    private AutorRequest autor;
    private LivroRequest livro;
    private EditoraRequest editora;
}
