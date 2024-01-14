package com.spring101.Biblioteca.controller;

import com.spring101.Biblioteca.dto.EmprestimoDto;
import com.spring101.Biblioteca.response.BaseResponseEmprestimo;
import com.spring101.Biblioteca.service.EmprestimoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/emprestimos")
public class EmprestimoController {
    private final EmprestimoService emprestimoService;

    @GetMapping
    public BaseResponseEmprestimo<List<EmprestimoDto>> getAllEmprestimos() {
        List<EmprestimoDto> emprestimos = emprestimoService.getAllEmprestimos();
        return new BaseResponseEmprestimo<>(HttpStatus.OK.value(), "Lista de empréstimos encontrada com sucesso", emprestimos);
    }

}
