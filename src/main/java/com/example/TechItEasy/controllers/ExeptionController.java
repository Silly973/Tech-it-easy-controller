package com.example.TechItEasy.controllers;

import com.example.TechItEasy.exeptions.RecordNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// 7-9 Maak een nieuwe klasse aan in de map Controllers voor de ExceptionController.(hfst. 5.11 EHub).
@ControllerAdvice
public class ExeptionController {
    @ExceptionHandler(value = RecordNotFoundException.class)
    public ResponseEntity<Object>exception(RecordNotFoundException exception){
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
    }

}
