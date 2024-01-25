package com.collectra.backend.infrastructure.controller.handler;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class ControllerExceptionHandler {

  @ExceptionHandler(value = {EntityNotFoundException.class})
  ResponseEntity<?> handleEntityNotFound(EntityNotFoundException ex, WebRequest request) {
    return ResponseEntity.noContent().build();
  }
}
