package com.spring101.Biblioteca.service;

import com.spring101.Biblioteca.dto.BibliotecariaDto;
import com.spring101.Biblioteca.mapper.BibliotecariaMapper;
import com.spring101.Biblioteca.repository.BibliotecariaRepository;
import com.spring101.Biblioteca.repository.models.BibliotecariaModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BibliotecariaService {
    private final BibliotecariaRepository bibliotecariaRepository;

    public List<BibliotecariaDto> getAllBibliotecarias() {
        List<BibliotecariaModel> bibliotecarias = bibliotecariaRepository.findAll();
        return bibliotecarias.stream()
                .map(BibliotecariaMapper::toBibliotecariaDto)
                .collect(Collectors.toList());
    }

}
