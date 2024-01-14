package com.spring101.Biblioteca.controller;

import com.spring101.Biblioteca.dto.LivroAutorEditoraDto;
import com.spring101.Biblioteca.response.BaseResponseLivroAutoreditora;
import com.spring101.Biblioteca.service.LivroAutorEditoraService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/LivrosCompletos")
public class LivroAutorEditoraController {

    private final LivroAutorEditoraService livroAutorEditoraService;

    @GetMapping
    public BaseResponseLivroAutoreditora<List<LivroAutorEditoraDto>> getAllLivrosCompletos(){
        List<LivroAutorEditoraDto> livros = livroAutorEditoraService.getAllLivrosAutorEditora();
        return new BaseResponseLivroAutoreditora<>(HttpStatus.OK.value(), "Lista de Livros completa obtida com sucesso", livros);

    }
}
