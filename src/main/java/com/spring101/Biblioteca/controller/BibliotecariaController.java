package com.spring101.Biblioteca.controller;

import com.spring101.Biblioteca.dto.BibliotecariaDto;
import com.spring101.Biblioteca.response.BaseResponseBibliotecaria;
import com.spring101.Biblioteca.service.BibliotecariaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bibliotecaria")
public class BibliotecariaController {

    private final BibliotecariaService bibliotecariaService;

    @GetMapping
    public BaseResponseBibliotecaria<List<BibliotecariaDto>> getAllBibliotecarias() {
        List<BibliotecariaDto> bibliotecarias = bibliotecariaService.getAllBibliotecarias();
        return new BaseResponseBibliotecaria<>(HttpStatus.OK.value(), "Lista de bibliotecarias encontrada com sucesso", bibliotecarias);
    }

}
