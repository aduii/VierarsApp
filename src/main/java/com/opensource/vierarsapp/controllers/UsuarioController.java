package com.opensource.vierarsapp.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.opensource.vierarsapp.models.Usuario;
import com.opensource.vierarsapp.services.UsuarioService;

@RestController
@RequestMapping("/usuarios")
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
	
	@GetMapping("/registrarReciclador")
	public void registrarReciclador(Model model) {
		
		Usuario reciclador = new Usuario();	
		model.addAttribute("titulo", "Registrar Reciclador");
		model.addAttribute("reciclador", reciclador);
	}
	
	@PostMapping("/guardarReciclador")
	public String guardar(@ModelAttribute Usuario reciclador) {
		_usuarioService.insert(reciclador);
		return "redirect:/";
	}
	
	@GetMapping(value = "/escogerTipoUsuario")
	public String escogerTipoUsuario() {		
		return "/views/usuario/escogerTipoUsuario";
	}

	@RequestMapping(value = "/insertar", method = RequestMethod.POST)
	public ResponseEntity<String> persistPerson(@RequestBody Usuario t) {
	  if (_usuarioService.insert(t)) {
		return ResponseEntity.status(HttpStatus.CREATED).build();
	  }
	  return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build();
	}

	//Registrar
	@RequestMapping(value = "/{distritoID}/insertar", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Usuario crearUsuario(@PathVariable(value="distritoID") int distritoID, @RequestBody Usuario t) {
	  return _usuarioService.insert(t, distritoID);
	}




	@GetMapping("/{id}")
	public Usuario obtenerUsuario(@PathVariable int id) {
	Optional<Usuario> usuario = _usuarioService.finbyId(id);
	return usuario.get();
	}
	
}
