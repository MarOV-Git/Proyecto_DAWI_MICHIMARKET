package org.michimarket.repositorio;

import org.michimarket.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductoRepository extends JpaRepository<Producto, String>{

}
