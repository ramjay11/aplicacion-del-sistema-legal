package com.ramjava.sistema.legal.backend.controlador;

import com.ramjava.sistema.legal.backend.modelo.NombreDelRecluso;
import com.ramjava.sistema.legal.backend.repositorio.RepositorioDePrisioneros;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200") @RestController @RequestMapping("/prisioneros")
public class ControladorDePrisioneros {

    private RepositorioDePrisioneros repositorioDePrisioneros;

    public ControladorDePrisioneros(RepositorioDePrisioneros repositorioDePrisioneros) {
        this.repositorioDePrisioneros = repositorioDePrisioneros;
    }

    @GetMapping("/prisioneros")
    public List<NombreDelRecluso> consigueATodosLosPrisioneros() {
        return repositorioDePrisioneros.findAll();
    }
}
