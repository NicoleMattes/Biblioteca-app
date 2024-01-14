package com.spring101.Biblioteca.controller;

import com.spring101.Biblioteca.dto.LivroDto;
import com.spring101.Biblioteca.exception.AutorNotFoundException;
import com.spring101.Biblioteca.exception.EditoraNotFoundException;
import com.spring101.Biblioteca.repository.models.LivroModel;
import com.spring101.Biblioteca.request.LivroRequest;
import com.spring101.Biblioteca.response.BaseResponseLivro;
import com.spring101.Biblioteca.service.LivroServise;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/livro")
public class LivroController {
    private final LivroServise livroService;

    @PostMapping
    public BaseResponseLivro<LivroDto> novoLivro(@RequestBody LivroRequest request) throws EditoraNotFoundException, AutorNotFoundException {
        LivroModel livroModel = livroService.novoLivro(request);
        LivroDto livroDto = LivroDto.fromLivroModel(livroModel);
        return new BaseResponseLivro<>(HttpStatus.OK.value(), "Livro criado com sucesso", livroDto);
    }

    @GetMapping
    public BaseResponseLivro<List<LivroDto>> getAllLivros(){
        List<LivroDto> livros = livroService.getAllLivros();
        return new BaseResponseLivro<>(HttpStatus.OK.value(), "Lista de livros obtida com sucesso", livros);
    }

    @GetMapping("/{id}")
    public BaseResponseLivro<LivroDto> getLivroById(@PathVariable Integer id) {
        LivroDto livroDto = livroService.getLivroById(id);
        return new BaseResponseLivro<>(HttpStatus.OK.value(), "Livro obtido com sucesso", livroDto);
    }


    @PutMapping("/{id}")
    public BaseResponseLivro<LivroDto> atualizarLivro(@PathVariable Integer id, @RequestBody LivroRequest request) throws AutorNotFoundException, EditoraNotFoundException {
        LivroModel livroModel = livroService.atualizarLivro(id, request);
        LivroDto livroDto = LivroDto.fromLivroModel(livroModel);
        return new BaseResponseLivro<>(HttpStatus.OK.value(), "Livro atualizado com sucesso", livroDto);
    }

    @DeleteMapping("/{id}")
    public BaseResponseLivro<Void> deletarLivro(@PathVariable Integer id) {
        livroService.deletarLivro(id);
        return new BaseResponseLivro<>(HttpStatus.OK.value(), "Livro deletado com sucesso", null);
    }
}

