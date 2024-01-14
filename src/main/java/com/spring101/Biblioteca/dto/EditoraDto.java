package com.spring101.Biblioteca.dto;

import com.spring101.Biblioteca.repository.models.EditoraModel;
import com.spring101.Biblioteca.request.EditoraRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EditoraDto extends EditoraRequest {
    private Integer id;
    private String nome;

    public static EditoraDto fromEditoraModel(EditoraModel editoraModel){
        EditoraDto editoraDto = new EditoraDto();
        editoraDto.setId(editoraModel.getId());
        editoraDto.setNome(editoraModel.getNome());
        return editoraDto;
    }
}
