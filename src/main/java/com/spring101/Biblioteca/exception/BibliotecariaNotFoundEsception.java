package com.spring101.Biblioteca.exception;

public class BibliotecariaNotFoundEsception extends EntityNotFoundException{
    public BibliotecariaNotFoundEsception(String message) {
        super("Autor não encontrado.");
    }

}
