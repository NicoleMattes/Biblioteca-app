package com.spring101.Biblioteca.exception;

public class LivroNotFoundException extends EntityNotFoundException{
    public LivroNotFoundException(String message) {
        super(message);
    }

}
