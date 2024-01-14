package com.spring101.Biblioteca.service;

import com.spring101.Biblioteca.dto.EditoraDto;
import com.spring101.Biblioteca.entity.Editora;
import com.spring101.Biblioteca.mapper.EditoraMapper;
import com.spring101.Biblioteca.repository.EditoraRepository;
import com.spring101.Biblioteca.repository.models.EditoraModel;
import com.spring101.Biblioteca.request.EditoraRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EditoraService {
    private final EditoraRepository editoraRepository;

    public Editora novaEditora(EditoraRequest request) {
        EditoraModel editoraModel = EditoraMapper.toEditoraModel(request);
        editoraModel = editoraRepository.save(editoraModel);
        return EditoraMapper.toEditora(editoraModel);
    }

    public List<EditoraDto> getAllEditoras() {
        List<EditoraModel> editoras = editoraRepository.findAll();
        return editoras.stream()
                .map(EditoraMapper::toEditoraDto)
                .collect(Collectors.toList());
    }
}
