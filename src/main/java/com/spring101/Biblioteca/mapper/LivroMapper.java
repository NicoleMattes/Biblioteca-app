package com.spring101.Biblioteca.mapper;

import com.spring101.Biblioteca.dto.AutorDto;
import com.spring101.Biblioteca.dto.LivroDto;
import com.spring101.Biblioteca.repository.models.AutorModel;
import com.spring101.Biblioteca.repository.models.LivroModel;
import com.spring101.Biblioteca.request.LivroRequest;
import lombok.RequiredArgsConstructor;


import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class LivroMapper {
    public static LivroModel toLivroModel(LivroRequest request, List<AutorModel> autores) {
        return LivroModel.builder()
                .titulo(request.getTitulo())
                .idioma(request.getIdioma())
                .generoLiterario(request.getGeneroLiterario())
                .resumo(request.getResumo())
                .numeroDePaginas(request.getNumeroDePaginas())
                .autores(autores)
                .build();
    }

    public static LivroDto toLivroDto(LivroModel livro) {
        LivroDto dto = new LivroDto();
        dto.setId(livro.getId());
        dto.setTitulo(livro.getTitulo());
        dto.setIdioma(livro.getIdioma());
        dto.setGeneroLiterario(livro.getGeneroLiterario());

        List<AutorDto> autoresDto = livro.getAutores()
                .stream()
                .map((AutorModel autorModel) -> AutorMapper.toAutorDto(autorModel))
                .collect(Collectors.toList());

        dto.setAutores(autoresDto);

        return dto;
    }

    public static LivroModel toLivroModel(LivroDto livro) {
        return null;
    }
}

