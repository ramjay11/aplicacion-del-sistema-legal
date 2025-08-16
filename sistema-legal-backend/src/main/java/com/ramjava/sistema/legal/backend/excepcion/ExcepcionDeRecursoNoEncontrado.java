package com.ramjava.sistema.legal.backend.excepcion;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ExcepcionDeRecursoNoEncontrado extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ExcepcionDeRecursoNoEncontrado(String mensaje) {
        super(mensaje);
    }
}
