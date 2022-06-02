package com.cinefy.backend.exception;

public class RunTimeException extends Exception{
    public String RunTimeException()
    {
        //Simple exception message being passed to the parent class
        //This will handle the exception
        String message = "Runtime Exception found";
        return message;
    }
}
