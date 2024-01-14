package com.spring101.Biblioteca.mapper;

import com.spring101.Biblioteca.dto.BibliotecariaDto;
import com.spring101.Biblioteca.repository.models.BibliotecariaModel;
import org.springframework.beans.BeanUtils;

public class BibliotecariaMapper {
    public static BibliotecariaDto toBibliotecariaDto(BibliotecariaModel bibliotecaria) {
        BibliotecariaDto dto = new BibliotecariaDto();
        BeanUtils.copyProperties(bibliotecaria, dto);
        return dto;
    }
}


