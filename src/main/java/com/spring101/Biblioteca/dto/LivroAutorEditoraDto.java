package com.spring101.Biblioteca.dto;

import com.spring101.Biblioteca.dto.AutorDto;
import com.spring101.Biblioteca.dto.LivroDto;
import com.spring101.Biblioteca.dto.EditoraDto;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LivroAutorEditoraDto {
    private Integer id;
    private AutorDto autor;
    private LivroDto livro;
    private EditoraDto editora;
}
