package com.opensource.vierarsapp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.opensource.vierarsapp.models.Usuario;
import com.opensource.vierarsapp.services.UsuarioService;

@Controller
@RequestMapping("usuario")
public class UsuarioController {
	@Autowired
	UsuarioService _usuarioService;
	
	//GET
	@RequestMapping(value = "/listar", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<List<Usuario>> getUsuario(){
		List<Usuario> usuarios = new ArrayList<>();
		usuarios = _usuarioService.listAll();
		if(usuarios.isEmpty()) {
			return new ResponseEntity<List<Usuario>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Usuario>>(usuarios, HttpStatus.OK);
	}
}
