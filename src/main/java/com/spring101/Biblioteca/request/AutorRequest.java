package com.spring101.Biblioteca.request;

import com.spring101.Biblioteca.repository.models.AutorModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AutorRequest {
    private String nome;
    private Date dataDeNascimento;
    private String paisDeOrigem;
}
