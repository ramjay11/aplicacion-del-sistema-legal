package com.ramjava.sistema.legal.backend.repositorio;

import com.ramjava.sistema.legal.backend.modelo.NombreDelRecluso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioDePrisioneros extends JpaRepository<NombreDelRecluso, Long> {
}
