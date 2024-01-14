package com.spring101.Biblioteca.mapper;

import com.spring101.Biblioteca.dto.LivroAutorEditoraDto;
import com.spring101.Biblioteca.repository.models.LivroAutorEditoraModel;
import org.springframework.stereotype.Component;

@Component
public class LivroAutorEditoraMapper {

    public static LivroAutorEditoraDto toLivroAutorEditoraDto(LivroAutorEditoraModel livroAutorEditoraModel) {
        return LivroAutorEditoraDto.builder()
                .id(livroAutorEditoraModel.getId())
                .autor(AutorMapper.toAutorDto(livroAutorEditoraModel.getAutor()))
                .livro(LivroMapper.toLivroDto(livroAutorEditoraModel.getLivro()))
                .editora(EditoraMapper.toEditoraDto(livroAutorEditoraModel.getEditora()))
                .build();
    }

    public LivroAutorEditoraModel toLivroAutorEditoraModel(LivroAutorEditoraDto livroAutorEditoraDto) {
        return LivroAutorEditoraModel.builder()
                .id(livroAutorEditoraDto.getId())
                .autor(AutorMapper.toAutorModel(livroAutorEditoraDto.getAutor()))
                .livro(LivroMapper.toLivroModel(livroAutorEditoraDto.getLivro()))
                .editora(EditoraMapper.toEditoraModel(livroAutorEditoraDto.getEditora()))
                .build();
    }
}

