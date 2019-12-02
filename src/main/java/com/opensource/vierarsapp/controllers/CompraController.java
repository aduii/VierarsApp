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

import com.opensource.vierarsapp.models.Compra;
import com.opensource.vierarsapp.services.CompraService;

@RestController
@RequestMapping("/compra")
public class CompraController {

	@Autowired
	CompraService _compraService;
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<List<Compra>> getStudent(){
		List<Compra> compras = new ArrayList<>();
		compras = _compraService.listAll();
		if(compras.isEmpty()) {
			return new ResponseEntity<List<Compra>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Compra>>(compras, HttpStatus.OK);
	}
	
	@GetMapping("/registrarCompra")
	public void registrarCompra(Model model) {
		
		Compra compra = new Compra();	
		model.addAttribute("titulo", "Registrar Compra");
		model.addAttribute("reciclador", compra);
	}
	
	@PostMapping("/guardarCompra")
	public String guardar(@ModelAttribute Compra compra) {
		_compraService.insert(compra);
		return "redirect:/";
	}
	

	@RequestMapping(value = "/insertar", method = RequestMethod.POST)
	public ResponseEntity<String> persistPerson(@RequestBody Compra t) {
	  if (_compraService.insert(t)) {
		return ResponseEntity.status(HttpStatus.CREATED).build();
	  }
	  return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build();
	}

	//Registrar
	@RequestMapping(value = "/{recicladorID}/{materialID}/insertar", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Compra crearCompra(@PathVariable(value="recicladorID") int recicladorID, @PathVariable(value="materialID") int materialID,@RequestBody Compra t) {
	  return _compraService.insert(t,recicladorID , materialID);
	}


	@GetMapping("/{id}")
	public Compra obtenerCompra(@PathVariable int id) {
	Optional<Compra> compra = _compraService.finbyId(id);
	return compra.get();
	}

	//Compras por Id de usuario que lo registro
	@GetMapping("/{idUsuario}/listar")
	public ResponseEntity<List<Compra>> getMaterialesUsuario(@PathVariable(value="idUsuario") int id) {
		List<Compra> compras = new ArrayList<>();
		compras = _compraService.listarCompraUsuario(id);
		if(compras.isEmpty()) {
			return new ResponseEntity<List<Compra>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Compra>>(compras, HttpStatus.OK);
	}


}
