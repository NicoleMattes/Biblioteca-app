package com.spring101.Biblioteca.repository.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity(name = "Emprestimo")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmprestimoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false, unique = true)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "Leitor_ID")
    private LeitorModel leitor;

    @ManyToOne
    @JoinColumn(name = "Bibliotecaria_ID")
    private BibliotecariaModel bibliotecaria;

    @ManyToOne
    @JoinColumn(name = "Livro1")
    private LivroModel livro1;

    @ManyToOne
    @JoinColumn(name = "Livro2")
    private LivroModel livro2;

    @ManyToOne
    @JoinColumn(name = "Livro3")
    private LivroModel livro3;

    @ManyToOne
    @JoinColumn(name = "Livro4")
    private LivroModel livro4;

    @ManyToOne
    @JoinColumn(name = "Livro5")
    private LivroModel livro5;

    @Column(name = "Data_Emprestimo")
    private Date dataEmprestimo;

    @Column(name = "Data_Limite_Devolucao")
    private Date dataLimiteDevolucao;

    @Column(name = "Data_Devolucao")
    private Date dataDevolucao;

    @Column(name = "Valor_Multa")
    private double valorMulta;

    @Column(name = "Data_Renovacao")
    private Date dataRenovacao;

    @Column(name = "Observacoes", columnDefinition = "TEXT")
    private String observacoes;
}

