package com.sistema.examenes.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistema.examenes.modelo.Rol;
import com.sistema.examenes.modelo.Usuario;
import com.sistema.examenes.modelo.UsuarioRol;
import com.sistema.examenes.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping("/")
	public Usuario guardarUsuario(@RequestBody Usuario usuario) throws Exception {
		
		Set<UsuarioRol> rols = new HashSet<>();
		
		Rol rol = new Rol();
		
		rol.setRolId(2L);
		rol.setRolNombre("NORMAL");
		
		UsuarioRol usuarioRol = new UsuarioRol();
		usuarioRol.setUsuario(usuario);
		usuarioRol.setRol(rol);
		
		
		return usuarioService.guardarusuario(usuario, rols);
		
	}
	
	  @GetMapping("/{username}")
	    public Usuario obtenerUsuario(@PathVariable("username") String username){
	        return usuarioService.obtenerUsuario(username);
	    }

	    @DeleteMapping("/{usuarioId}")
	    public void eliminarUsuario(@PathVariable("usuarioId") Long usuarioId){
	        usuarioService.eliminarUsuario(usuarioId);
	    }

}
