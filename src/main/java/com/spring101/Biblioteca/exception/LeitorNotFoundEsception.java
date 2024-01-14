package com.spring101.Biblioteca.exception;

public class LeitorNotFoundEsception extends EntityNotFoundException{
    public LeitorNotFoundEsception(String message) {
        super(message);
    }
}
