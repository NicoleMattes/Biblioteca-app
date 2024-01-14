package com.spring101.Biblioteca.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponseAutor<AutorDto>{
    private Integer httpCode;
    private String message;
    private AutorDto response;

}
