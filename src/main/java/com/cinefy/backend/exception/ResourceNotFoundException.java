package com.cinefy.backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/************************************************************************
 * This will serve as the resource not found status page exception
 * Will be called whenever resource is not found and the message in
 * the exception given below will be passed to the page using super and
 * parent class constructor
 *************************************************************************/
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String message)
    {
        //Simple exception message being passed to the parent class
        //This will handle the exception
        super(message);
    }
}
