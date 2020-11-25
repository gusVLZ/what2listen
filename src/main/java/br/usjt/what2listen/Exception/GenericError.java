package br.usjt.what2listen.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class GenericError extends RuntimeException {
    private static final long serialVersionUID = -9068482506168160352L;

    public GenericError(Exception e) {
        e.printStackTrace();
    }
}
