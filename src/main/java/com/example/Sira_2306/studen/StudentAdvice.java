package com.example.Sira_2306.studen;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class StudentAdvice {

    @ResponseBody
    @ExceptionHandler(StudentNotFound.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String todoNotFound(StudentNotFound ex){
        return ex.getMessage();
    }
    @ResponseBody
    @ExceptionHandler(StudentUnAuthen.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    String todoUnAuthen(StudentUnAuthen ex){
        return ex.getMessage();
    }
}
