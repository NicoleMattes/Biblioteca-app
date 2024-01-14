package com.spring101.Biblioteca.mapper;

import com.spring101.Biblioteca.dto.EditoraDto;
import com.spring101.Biblioteca.entity.Editora;
import com.spring101.Biblioteca.repository.models.EditoraModel;
import com.spring101.Biblioteca.request.EditoraRequest;

public class EditoraMapper {
    public static EditoraModel toEditoraModel(EditoraRequest request) {
        return EditoraModel.builder()
                .nome(request.getNome())
                .paisDeorigem(request.getPaisDeOrigem())
                .anoDeFundacao(request.getAnoDeFundacao())
                .email(request.getEmail())
                .telefone(request.getTelefone())
                .build();
    }

    public static Editora toEditora(EditoraModel editoraModel) {
        Editora editora = new Editora();
        editora.setNome(editoraModel.getNome());
        editora.setPaisDeorigem(editora.getPaisDeorigem());
        return editora;
    }

    public static EditoraDto toEditoraDto(EditoraModel editora){
        EditoraDto dto = new EditoraDto();
        dto.setId(editora.getId());
        dto.setNome(editora.getNome());
        return dto;
    }
}
