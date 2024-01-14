package com.spring101.Biblioteca.service;


import com.spring101.Biblioteca.dto.EmprestimoDto;
import com.spring101.Biblioteca.mapper.EmprestimoMapper;
import com.spring101.Biblioteca.repository.EmprestimoRepository;
import com.spring101.Biblioteca.repository.models.EmprestimoModel;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmprestimoService {
    private final LeitorService leitorService;
    private final BibliotecariaService bibliotecariaService;
    private final LivroServise livroService;
    private final EmprestimoRepository emprestimoRepository;

    public List<EmprestimoDto> getAllEmprestimos(){
        List<EmprestimoModel> emprestimos = emprestimoRepository.findAll();
        return emprestimos.stream()
                .map(EmprestimoMapper::toEmprestimoDto)
                .collect(Collectors.toList());
    }
}
