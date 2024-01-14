package com.spring101.Biblioteca.service;

import com.spring101.Biblioteca.dto.AutorDto;
import com.spring101.Biblioteca.entity.Autor;
import com.spring101.Biblioteca.mapper.AutorMapper;
import com.spring101.Biblioteca.repository.AutorRepository;
import com.spring101.Biblioteca.repository.models.AutorModel;
import com.spring101.Biblioteca.request.AutorRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class AutorService {
    private final AutorRepository autorRepository;

    public AutorDto novoAutor(AutorRequest request){
        AutorModel autorModel = AutorMapper.toAutorModel(request);
        autorModel = autorRepository.save(autorModel);
        return AutorMapper.toAutorDto(autorModel);
    }

    public List<AutorDto> getAllAutores(){
        List<AutorModel> autores = autorRepository.findAll();
        return autores.stream()
                .map(AutorMapper::toAutorDto)
                .collect(Collectors.toList());
    }
}
