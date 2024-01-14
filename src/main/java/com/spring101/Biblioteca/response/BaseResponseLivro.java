package com.spring101.Biblioteca.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BaseResponseLivro<LivroDto > {
    private Integer httpCode;
    private String message;
    private LivroDto  response;


}
