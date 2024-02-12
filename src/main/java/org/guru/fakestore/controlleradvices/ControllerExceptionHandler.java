package org.guru.fakestore.controlleradvices;

import org.guru.fakestore.dto.ExceptionDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.resource.NoResourceFoundException;


@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(NoResourceFoundException.class)
    public ResponseEntity<ExceptionDto> uriException(){
        return ResponseEntity.badRequest().body(new ExceptionDto("Invalid URI", "Please provide a valid URI"));

    }
}
