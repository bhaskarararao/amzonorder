package org.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException rs, WebRequest req){
        ErrorDetails err = new ErrorDetails(new Date(),rs.getMessage(),req.getDescription(false));
         return new ResponseEntity(err, HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleResourceNotFoundException(Exception rs, WebRequest req){
        ErrorDetails err = new ErrorDetails(new Date(),rs.getMessage(),req.getDescription(false));
        return new ResponseEntity(err, HttpStatus.INTERNAL_SERVER_ERROR);

    }
}
