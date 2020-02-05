package com.xuzhang.selfvalidation.exception;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Robert 2020/2/5
 */
@ControllerAdvice
public class ParameterValidationExceptionHandler {
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public List<Map<String, String>> parameterNotValidExceptionHandler(MethodArgumentNotValidException e) {
        List<Map<String, String>> errorResponse = new ArrayList<>();
        Map<String, String> errorMaps = new HashMap<>();
        e.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errorMaps.put(fieldName, errorMessage);
        });
        errorResponse.add(errorMaps);
        return errorResponse;

    }
}
