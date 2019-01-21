package com.stackroute.muzix.controller;

import com.stackroute.muzix.exception.IdNotFoundException;
import com.stackroute.muzix.exception.TrackAlreadyExistsException;
import com.stackroute.muzix.exception.TrackNotFoundException;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.persistence.Id;
import java.net.IDN;

@ControllerAdvice
@Log4j
public class GlobalExceptionHandler {
    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "track already exists")
    @ExceptionHandler(TrackAlreadyExistsException.class)
    public void handleEmptyFieldException(TrackAlreadyExistsException e)
    {
        log.error(" Track already exists", e);
    }
    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Track not found")
    @ExceptionHandler(TrackNotFoundException.class)
    public void handleEmptyFieldException(TrackNotFoundException e)
    {
        log.error(" Track is not present to delete", e);
    }
    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Id is not present to update")
    @ExceptionHandler(IdNotFoundException.class)
    public void handleEmptyFieldException(IdNotFoundException e)
    {
        log.error(" Id is not present to delete", e);
    }
}
