package com.sistema.examenes.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.examenes.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	public Usuario findByUsername(String username);

}
