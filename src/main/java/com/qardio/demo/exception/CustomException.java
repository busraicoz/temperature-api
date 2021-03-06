package com.qardio.demo.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;


@Getter
public class CustomException extends RuntimeException {

    private final String key;
    private final String[] args;
    private final HttpStatus httpStatus;

    public CustomException(String key, HttpStatus httpStatus, String... args) {
        this.key = key;
        this.httpStatus = httpStatus;
        this.args = args;
    }
}
