package de.maxkorte.employeer.web.exceptions;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(value = EmptyResultDataAccessException.class)
    public ResponseEntity<Object> handleRessourceNotFound(RuntimeException e, WebRequest request) {
        return handleExceptionInternal(e, "No element found with the given id!", new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }
}
