package com.telerikacademy.oop.exceptions;

public class InvalidUserOperationException extends RuntimeException {
    public InvalidUserOperationException(String message) {
        super(message);
    }
}
