package com.spring101.Biblioteca.mapper;

import com.spring101.Biblioteca.dto.EmprestimoDto;
import com.spring101.Biblioteca.repository.models.EmprestimoModel;

import java.util.List;
import java.util.stream.Collectors;

public class EmprestimoMapper {

    public static EmprestimoDto toEmprestimoDto(EmprestimoModel emprestimoModel) {
        return EmprestimoDto.builder()
                .id(emprestimoModel.getId())
                .leitor(emprestimoModel.getLeitor())
                .bibliotecaria(emprestimoModel.getBibliotecaria())
                .livro1(emprestimoModel.getLivro1())
                .livro2(emprestimoModel.getLivro2())
                .livro3(emprestimoModel.getLivro3())
                .livro4(emprestimoModel.getLivro4())
                .livro5(emprestimoModel.getLivro5())
                .dataEmprestimo(emprestimoModel.getDataEmprestimo())
                .dataLimiteDevolucao(emprestimoModel.getDataLimiteDevolucao())
                .dataDevolucao(emprestimoModel.getDataDevolucao())
                .valorMulta(emprestimoModel.getValorMulta())
                .dataRenovacao(emprestimoModel.getDataRenovacao())
                .observacoes(emprestimoModel.getObservacoes())
                .build();
    }

    public static List<EmprestimoDto> toEmprestimoDtoList(List<EmprestimoModel> emprestimoModels) {
        return emprestimoModels.stream()
                .map(EmprestimoMapper::toEmprestimoDto)
                .collect(Collectors.toList());
    }
}

