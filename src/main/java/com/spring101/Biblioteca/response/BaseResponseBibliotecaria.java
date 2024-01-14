package com.spring101.Biblioteca.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponseBibliotecaria<BibliotecaDto> {
    private Integer httpCode;
    private String message;
    private BibliotecaDto response;
}
