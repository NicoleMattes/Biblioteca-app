package com.spring101.Biblioteca.mapper;

import com.spring101.Biblioteca.dto.LeitorDto;
import com.spring101.Biblioteca.repository.models.LeitorModel;
import org.springframework.stereotype.Component;

@Component
public class LeitorMapper {

    public static LeitorDto toLeitorDto(LeitorModel leitorModel) {
        return LeitorDto.builder()
                .id(leitorModel.getId())
                .nome(leitorModel.getNome())
                .idade(leitorModel.getIdade())
                .telefone(leitorModel.getTelefone())
                .email(leitorModel.getEmail())
                .endereco(leitorModel.getEndereco())
                .cidade(leitorModel.getCidade())
                .estado(leitorModel.getEstado())
                .cpf(leitorModel.getCpf())
                .build();
    }

    public static LeitorModel toLeitorModel(LeitorDto leitorDto) {
        LeitorModel leitorModel = new LeitorModel();
        leitorModel.setId(leitorDto.getId());
        leitorModel.setNome(leitorDto.getNome());
        leitorModel.setIdade(leitorDto.getIdade());
        leitorModel.setTelefone(leitorDto.getTelefone());
        leitorModel.setEmail(leitorDto.getEmail());
        leitorModel.setEndereco(leitorDto.getEndereco());
        leitorModel.setCidade(leitorDto.getCidade());
        leitorModel.setEstado(leitorDto.getEstado());
        leitorModel.setCpf(leitorDto.getCpf());
        return leitorModel;
    }
}
