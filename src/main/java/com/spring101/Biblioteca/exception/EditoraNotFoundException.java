package com.spring101.Biblioteca.exception;

public class EditoraNotFoundException extends EntityNotFoundException{
    public EditoraNotFoundException(String message) {
        super("Autor não encontrado.");
    }

}
