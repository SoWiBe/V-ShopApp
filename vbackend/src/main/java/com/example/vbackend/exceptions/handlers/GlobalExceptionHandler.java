package com.example.vbackend.exceptions.handlers;

import com.example.vbackend.exceptions.response.ErrorResponse;
import com.example.vbackend.exceptions.runtime.NoSuchProductExistsException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = NoSuchProductExistsException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public @ResponseBody ErrorResponse handleException(NoSuchProductExistsException ex){
        return new ErrorResponse(ex.getMessage());
    }
}
