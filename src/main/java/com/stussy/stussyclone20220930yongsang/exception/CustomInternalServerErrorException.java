package com.stussy.stussyclone20220930yongsang.exception;

public class CustomInternalServerErrorException extends RuntimeException{
    public CustomInternalServerErrorException(String message) {
        super(message);
    }
}
