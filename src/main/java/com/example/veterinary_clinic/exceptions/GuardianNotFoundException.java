package com.example.veterinary_clinic.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class GuardianNotFoundException extends RuntimeException {
    public GuardianNotFoundException(String message) {
        super(message);
    }
}
