package com.opensource.vierarsapp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.opensource.vierarsapp.models.Distrito;
import com.opensource.vierarsapp.models.Usuario;
import com.opensource.vierarsapp.services.DistritoService;
import com.opensource.vierarsapp.services.UsuarioService;

@Controller
@RequestMapping("/views/usuario")

public class UsuarioController {
	@Autowired
	UsuarioService _usuarioService;

	@Autowired
	DistritoService _distritoService;
	
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
	public String registrarReciclador(Model model) {
		
		Usuario reciclador = new Usuario();
		
		model.addAttribute("titulo", "Registrar Reciclador");
		model.addAttribute("reciclador", reciclador);

		return "/views/usuario/registrarReciclador";
	}
	
	@PostMapping("/guardarReciclador")
	public String guardar(@ModelAttribute Usuario reciclador) {
		//Tipo (1. usuario)(2. Reciclador)
		
		reciclador.setPuntos(0);
		reciclador.setTipo(2);
		reciclador.setDistrito(_distritoService.finbyId(1));
		_usuarioService.insert(reciclador);
		return "redirect:/";
	}
	
	@GetMapping("/escogerTipoUsuario")
	public String escogerTipoUsuario() {
		
		return "/views/usuario/escogerTipoUsuario";
	}
	
	@GetMapping("/ingresar")
	public String ingresar(Model model) {
		
		Usuario usuario = new Usuario();
		
		model.addAttribute("user", usuario);
		return "/views/usuario/ingresar";
	}
	
	@PostMapping("/ingresarUsuario")
	public String ingresarUsuario(@ModelAttribute Usuario user) {
		
		System.out.println(user.getEmail());
		return "redirect:/";
	}
	
	
	@ModelAttribute("distritos")
	public List<Distrito> getMultiCheckboxAllValues() {
	    return _distritoService.listAll();
	}

	
}
