package com.spring101.Biblioteca.exception;

public class AutorNotFoundException extends EntityNotFoundException {
    public AutorNotFoundException(String message) {
        super("Autor não encontrado.");
    }
}
