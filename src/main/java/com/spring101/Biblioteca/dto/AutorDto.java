package com.spring101.Biblioteca.dto;

import com.spring101.Biblioteca.repository.models.AutorModel;
import com.spring101.Biblioteca.request.AutorRequest;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AutorDto extends AutorRequest {
    private Integer id;
    private String nome;
    private String paisDeOrigem;

    public static AutorDto fromAutorModel(AutorDto autorModel){
        AutorDto autorDto = new AutorDto();
        autorDto.setId(autorModel.getId());
        autorDto.setNome(autorModel.getNome());
        autorDto.setPaisDeOrigem(autorModel.getPaisDeOrigem());
        return autorDto;
    }
}
