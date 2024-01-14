package com.spring101.Biblioteca.controller;

import com.spring101.Biblioteca.dto.EditoraDto;
import com.spring101.Biblioteca.repository.models.EditoraModel;
import com.spring101.Biblioteca.request.EditoraRequest;
import com.spring101.Biblioteca.response.BaseResponseEditora;
import com.spring101.Biblioteca.service.EditoraService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/editora")
public class EditoraController {
    private final EditoraService editoraService;

    @PostMapping
    public BaseResponseEditora<EditoraDto> novaEditora(@RequestBody EditoraRequest request){
        EditoraModel editoraModel = editoraService.novaEditora(request);
        EditoraDto editoraDto = EditoraDto.fromEditoraModel(editoraModel);
        return new BaseResponseEditora<>(HttpStatus.OK.value(), "Autor criado com sucesso", editoraDto);
    }

    @GetMapping
    public BaseResponseEditora<List<EditoraDto>> getAllEditoras(){
        List<EditoraDto> editoras = editoraService.getAllEditoras();
        return new BaseResponseEditora<>(HttpStatus.OK.value(), "Lista de autores obtida com sucesso", editoras);
    }

}
