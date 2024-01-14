package com.spring101.Biblioteca.exception;

import com.spring101.Biblioteca.error.BaseResponseError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler({UnauthorizedException.class})
    public ResponseEntity<BaseResponseError> handleUnauthorizedException(UnauthorizedException ex) {
        return buildErrorResponse(HttpStatus.UNAUTHORIZED, "Não autorizado.");
    }

    @ExceptionHandler({ForbiddenException.class})
    public ResponseEntity<BaseResponseError> handleForbiddenException(ForbiddenException ex) {
        return buildErrorResponse(HttpStatus.FORBIDDEN, "Acesso proibido.");
    }

    @ExceptionHandler({EntityNotFoundException.class, AutorNotFoundException.class, BibliotecariaNotFoundEsception.class,
    EditoraNotFoundException.class, LeitorNotFoundEsception.class, LivroNotFoundException.class})
    public ResponseEntity<BaseResponseError> handleNotFoundException(Exception ex) {
        return buildErrorResponse(HttpStatus.NOT_FOUND, "Recurso não encontrado.");
    }

    @ExceptionHandler({ConflictException.class})
    public ResponseEntity<BaseResponseError> handleConflictException(ConflictException ex) {
        return buildErrorResponse(HttpStatus.CONFLICT, "Conflito ao processar a solicitação.");
    }

    @ExceptionHandler({Exception.class})
    public ResponseEntity<BaseResponseError> handleGenericException(Exception ex) {
        return buildErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR, "Ocorreu um erro interno no servidor.");
    }

    private ResponseEntity<BaseResponseError> buildErrorResponse(HttpStatus status, String mensagem) {
        BaseResponseError response = BaseResponseError.builder()
                .errorCode(status.toString())
                .mensagem(mensagem)
                .build();
        return ResponseEntity.status(status).body(response);
    }
}
