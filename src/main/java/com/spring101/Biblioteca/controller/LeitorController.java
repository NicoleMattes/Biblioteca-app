package com.spring101.Biblioteca.controller;

import com.spring101.Biblioteca.dto.LeitorDto;
import com.spring101.Biblioteca.response.BaseResponseLeitor;
import com.spring101.Biblioteca.service.LeitorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/leitores")
public class LeitorController {

    private final LeitorService leitorService;

    @GetMapping
    public BaseResponseLeitor<List<LeitorDto>> getAllLeitores() {
        List<LeitorDto> leitores = leitorService.getAllLeitores();
        return new BaseResponseLeitor<>(HttpStatus.OK.value(), "Lista de leitores encontrada com sucesso", leitores);
    }

}
