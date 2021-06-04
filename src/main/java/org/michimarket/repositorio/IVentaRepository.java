package org.michimarket.repositorio;

import org.michimarket.modelo.CabeceraBoleta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVentaRepository extends JpaRepository<CabeceraBoleta, String>{

}
