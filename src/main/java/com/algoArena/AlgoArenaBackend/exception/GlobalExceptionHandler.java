package com.algoArena.AlgoArenaBackend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String,String>>myMethodArgumentException(MethodArgumentNotValidException ex){
           Map<String,String>response=new HashMap<>();
           ex.getBindingResult().getFieldErrors().forEach(err->response.put(err.getField(),err.getDefaultMessage()));
           return ResponseEntity.badRequest().body(response);
    }
    @ExceptionHandler(ResourceNotFoundException.class)
    public  ResponseEntity<String>myResourceNotFoundException(ResourceNotFoundException ex){
         return  new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}
