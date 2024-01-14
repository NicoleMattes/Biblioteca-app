package com.spring101.Biblioteca.service;


import com.spring101.Biblioteca.dto.LeitorDto;
import com.spring101.Biblioteca.mapper.LeitorMapper;
import com.spring101.Biblioteca.repository.LeitorRepository;
import com.spring101.Biblioteca.repository.models.LeitorModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class LeitorService {
    private final LeitorRepository leitorRepository;

    public List<LeitorDto> getAllLeitores(){
        List<LeitorModel> leitores = leitorRepository.findAll();
        return leitores.stream()
                .map(LeitorMapper::toLeitorDto)
                .collect(Collectors.toList());
    }
}
