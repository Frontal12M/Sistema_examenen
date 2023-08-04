package com.sistema.examenes.serviceImpl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.examenes.modelo.Usuario;
import com.sistema.examenes.modelo.UsuarioRol;
import com.sistema.examenes.repositorios.RolRepository;
import com.sistema.examenes.repositorios.UsuarioRepository;
import com.sistema.examenes.services.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private RolRepository rolRepository;

	@Override
	public Usuario guardarusuario(Usuario usuario, Set<UsuarioRol> usuarioRols) throws Exception {
		Usuario usuarioLocal = usuarioRepository.findByUsername(usuario.getUsername());
		if (usuarioLocal != null) {
			System.out.println("el usaurio ya existe");
			throw new Exception("el usuario ya esta presente");
		} else {
			for (UsuarioRol usuarioRol : usuarioRols) {
				rolRepository.save(usuarioRol.getRol());
			}
			usuario.getUsuarioRoles().addAll(usuarioRols);
			usuarioLocal = usuarioRepository.save(usuario);
		}

		return usuarioLocal;

	}

	@Override
	public Usuario obtenerUsuario(String username) {

		return usuarioRepository.findByUsername(username);
	}

	@Override
	public void eliminarUsuario(Long usuarioId) {

		usuarioRepository.deleteById(usuarioId);
	}

}
