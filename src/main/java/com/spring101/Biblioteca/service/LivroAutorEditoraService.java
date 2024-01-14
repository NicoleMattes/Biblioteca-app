package com.spring101.Biblioteca.service;

import com.spring101.Biblioteca.dto.LivroAutorEditoraDto;
import com.spring101.Biblioteca.mapper.LivroAutorEditoraMapper;
import com.spring101.Biblioteca.repository.LivroAutorEditoraRepository;
import com.spring101.Biblioteca.repository.models.LivroAutorEditoraModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class LivroAutorEditoraService {
    private final LivroAutorEditoraRepository livroAutorEditoraRepository;

    public List<LivroAutorEditoraDto> getAllLivrosAutorEditora(){
        List<LivroAutorEditoraModel> livrosAutoreEditora = livroAutorEditoraRepository.findAll();
        return livrosAutoreEditora.stream()
                .map(LivroAutorEditoraMapper::toLivroAutorEditoraDto)
                .collect(Collectors.toList());
    }
}
