package com.spring101.Biblioteca.mapper;

import com.spring101.Biblioteca.dto.AutorDto;
import com.spring101.Biblioteca.entity.Autor;
import com.spring101.Biblioteca.repository.models.AutorModel;
import com.spring101.Biblioteca.request.AutorRequest;

public class AutorMapper {
    public static AutorModel toAutorModel(AutorRequest request){
        return AutorModel.builder()
                .nome(request.getNome())
                .paisDeOrigem(request.getPaisDeOrigem())
                .build();
    }

    public static AutorDto toAutorDto(AutorModel autor) {
        AutorDto dto = new AutorDto();
        dto.setId(autor.getId());
        dto.setNome(autor.getNome());
        dto.setPaisDeOrigem(autor.getPaisDeOrigem());
        return dto;
    }


}
