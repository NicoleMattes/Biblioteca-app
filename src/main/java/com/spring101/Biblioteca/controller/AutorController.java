package com.spring101.Biblioteca.controller;

import com.spring101.Biblioteca.dto.AutorDto;
import com.spring101.Biblioteca.entity.Autor;
import com.spring101.Biblioteca.repository.models.AutorModel;
import com.spring101.Biblioteca.request.AutorRequest;
import com.spring101.Biblioteca.response.BaseResponseAutor;
import com.spring101.Biblioteca.service.AutorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/autor")
public class AutorController {
    private final AutorService autorServise;

    @PostMapping
    public BaseResponseAutor<AutorDto> novoAutor(@RequestBody AutorRequest request){
        AutorDto autorModel = autorServise.novoAutor(request);
        AutorDto autorDto = AutorDto.fromAutorModel(autorModel);
        return new BaseResponseAutor<>(HttpStatus.OK.value(), "Autor criado com sucesso", autorDto);
    };

    @GetMapping
    public BaseResponseAutor<List<AutorDto>> getAllLivros(){
        List<AutorDto> autores = autorServise.getAllAutores();
        return new BaseResponseAutor<>(HttpStatus.OK.value(), "Lista de autores obtida com sucesso", autores);
    };

}
