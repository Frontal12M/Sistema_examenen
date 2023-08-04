package com.sistema.examenes.services;

import java.util.Set;

import com.sistema.examenes.modelo.Usuario;
import com.sistema.examenes.modelo.UsuarioRol;

public interface UsuarioService {

	public Usuario guardarusuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

	public Usuario obtenerUsuario(String username);

	public void eliminarUsuario(Long usuarioId);
}
