package dev.karlmenzel.personalwebsitebackend.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class ServerErrorException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    
    public ServerErrorException(String message) {
        super(message);
    }
}