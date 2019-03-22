package com.example.demo.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author:jobs
 * @date:2018/12/11 8:30
 * @description:
 */
@ControllerAdvice
public class ErrorController {
    @ExceptionHandler(value = Exception.class)
    public String error(){
        return "404";
    }
}
