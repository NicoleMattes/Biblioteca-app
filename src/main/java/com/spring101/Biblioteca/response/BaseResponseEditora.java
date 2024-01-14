package com.spring101.Biblioteca.response;

import com.spring101.Biblioteca.dto.EditoraDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponseEditora<EditoraDto> {
    private Integer httpCode;
    private String message;
    private EditoraDto response;
}
