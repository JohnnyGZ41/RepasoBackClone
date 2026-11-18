package com.acme.center.platform.sales.domain.exceptions;

public class EMaiInvalidException extends RuntimeException {
    public EMaiInvalidException(String message) {
        super(message);
    }
}
