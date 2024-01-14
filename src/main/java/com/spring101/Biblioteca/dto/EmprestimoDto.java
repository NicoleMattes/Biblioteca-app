package com.spring101.Biblioteca.dto;

import com.spring101.Biblioteca.repository.models.BibliotecariaModel;
import com.spring101.Biblioteca.repository.models.LeitorModel;
import com.spring101.Biblioteca.repository.models.LivroModel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Builder
public class EmprestimoDto {
    private Integer id;
    private LeitorModel leitor;
    private BibliotecariaModel bibliotecaria;
    private LivroModel livro1;
    private LivroModel livro2;
    private LivroModel livro3;
    private LivroModel livro4;
    private LivroModel livro5;
    private Date dataEmprestimo;
    private Date dataLimiteDevolucao;
    private Date dataDevolucao;
    private double valorMulta;
    private Date dataRenovacao;
    private String observacoes;
}
