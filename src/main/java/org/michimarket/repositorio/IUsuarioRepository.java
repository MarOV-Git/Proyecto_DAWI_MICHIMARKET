package org.michimarket.repositorio;

import org.michimarket.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository extends JpaRepository<Usuario, String>{

}
