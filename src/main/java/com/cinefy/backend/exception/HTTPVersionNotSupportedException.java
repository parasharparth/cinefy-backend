package com.cinefy.backend.exception;

import net.bytebuddy.implementation.bind.annotation.Super;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.HTTP_VERSION_NOT_SUPPORTED)
public class HTTPVersionNotSupportedException extends Exception{

    public HTTPVersionNotSupportedException(String message)
    {
        super(message);
    }
}
