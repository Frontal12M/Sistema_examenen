package com.sistema.examenes;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sistema.examenes.modelo.Rol;
import com.sistema.examenes.modelo.Usuario;
import com.sistema.examenes.modelo.UsuarioRol;
import com.sistema.examenes.services.UsuarioService;

@SpringBootApplication
public class SistemaExamanesBackendApplication implements CommandLineRunner {

	@Autowired
	private UsuarioService usuarioService;

	public static void main(String[] args) {

		SpringApplication.run(SistemaExamanesBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Usuario usuario = new Usuario();
//
//		usuario.setNombre("miguel");
//		usuario.setApellido("flores");
//		usuario.setUsername("miguel");
//		usuario.setPassword("miguel12");
//		usuario.setEmail("guti.12rt@gmail.com");
//		usuario.setTelefono("7776043318");
//		usuario.setPerfil("foto.png");
//
//		Rol rol = new Rol();
//		rol.setRolId(1L);
//		rol.setRolNombre("admin");
//
//		Set<UsuarioRol> usuarioRols = new HashSet<>();
//		UsuarioRol usuarioRol = new UsuarioRol();
//		usuarioRol.setRol(rol);
//		usuarioRol.setUsuario(usuario);
//		usuarioRols.add(usuarioRol);
//
//		Usuario usuario2 = usuarioService.guardarusuario(usuario, usuarioRols);
//		System.out.println(usuario2.getUsername());
	}

}
