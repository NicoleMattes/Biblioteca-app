package com.spring101.Biblioteca.dto;

import com.spring101.Biblioteca.repository.models.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LivroDto {
    private Integer id;
    private String titulo;
    private List<AutorModel> autores;
    private EditoraModel editora;
    private String idioma;
    private String generoLiterario;

    public static LivroDto fromLivroModel(LivroModel livroModel) {
        LivroDto livroDto = new LivroDto();
        livroDto.setId(livroModel.getId());
        livroDto.setTitulo(livroModel.getTitulo());
        livroDto.setIdioma(livroModel.getIdioma());
        livroDto.setGeneroLiterario(livroModel.getGeneroLiterario());
        return livroDto;
    }

    public void setAutores(List<AutorDto> autoresDto) {
    }
}
