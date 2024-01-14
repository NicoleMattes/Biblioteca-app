package com.spring101.Biblioteca.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class EmprestimoRequest {
    private String leitorNome;
    private String bibliotecariaNome;
    private String livro1Titulo;
    private String livro2Titulo;
    private String livro3Titulo;
    private String livro4Titulo;
    private String livro5Titulo;
    private Date dataEmprestimo;
    private Date dataLimiteDevolucao;
    private double valorMulta;
    private String observacoes;
}
