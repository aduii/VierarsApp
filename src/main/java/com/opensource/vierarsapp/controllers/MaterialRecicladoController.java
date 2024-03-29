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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.opensource.vierarsapp.models.MateriaReciclado;
import com.opensource.vierarsapp.models.Tipo;
import com.opensource.vierarsapp.models.Usuario;
import com.opensource.vierarsapp.services.MaterialRecicladoService;
import com.opensource.vierarsapp.services.TipoService;
import com.opensource.vierarsapp.services.UsuarioService;

@RestController
@RequestMapping("/materialreciclado")
public class MaterialRecicladoController {

	@Autowired
	MaterialRecicladoService _materialrecicladoService;

	@Autowired
	UsuarioService _usuarioService;

	@Autowired
	TipoService _tipoService;
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<List<MateriaReciclado>> getStudent(){
		List<MateriaReciclado> materialesreciclados = new ArrayList<>();
		materialesreciclados = _materialrecicladoService.listAll();
		
		if(materialesreciclados.isEmpty()) {
			return new ResponseEntity<List<MateriaReciclado>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<MateriaReciclado>>(materialesreciclados, HttpStatus.OK);
	}
	
	@GetMapping("/registrarMaterialReciclado")
	public void registrarMaterialReciclado(Model model) {
		
		MateriaReciclado materialreciclado = new MateriaReciclado();	
		model.addAttribute("titulo", "Registrar MaterialReciclado");
		model.addAttribute("reciclador", materialreciclado);
	}
	
	@PostMapping("/guardarMaterialReciclado")
	public String guardar(@ModelAttribute MateriaReciclado materialreciclado) {
		_materialrecicladoService.insert(materialreciclado);
		return "redirect:/";
	}
	
	@GetMapping(value = "/escogerTipoMaterialReciclado")
	public String escogerTipoMaterialReciclado() {		
		return "/views/materialreciclado/escogerTipoMaterialReciclado";
	}

	@RequestMapping(value = "/insertar", method = RequestMethod.POST)
	public ResponseEntity<String> persistPerson(@RequestBody MateriaReciclado t) {
	  if (_materialrecicladoService.insert(t)) {
		return ResponseEntity.status(HttpStatus.CREATED).build();
	  }
	  return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build();
	}

	//Registrar
	@RequestMapping(value = "/{usuarioID}/{tipoID}/insertar", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public MateriaReciclado crearMaterialReciclado(@PathVariable(value="tipoID") int tipoID, @PathVariable(value="usuarioID") int usuarioID,@RequestBody MateriaReciclado t) {
	  return _materialrecicladoService.insert(t, usuarioID,tipoID);
	}


	@GetMapping("/{id}")
	public MateriaReciclado obtenerMaterialReciclado(@PathVariable int id) {
	Optional<MateriaReciclado> materialreciclado = _materialrecicladoService.finbyId(id);
	return materialreciclado.get();
	}


	@GetMapping("/sinvender")
	public ResponseEntity<List<MateriaReciclado>> getSinVender(){
		List<MateriaReciclado> materialesreciclados = new ArrayList<>();
		materialesreciclados = _materialrecicladoService.listarMaterialSinVender();
		if(materialesreciclados.isEmpty()) {
			return new ResponseEntity<List<MateriaReciclado>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<MateriaReciclado>>(materialesreciclados, HttpStatus.OK);
	}


	//Materiales por Id de usuario que lo registro
	@GetMapping("/{idUsuario}/listar")
	public ResponseEntity<List<MateriaReciclado>> getMaterialesUsuario(@PathVariable(value="idUsuario") int id) {
		List<MateriaReciclado> materialesreciclados = new ArrayList<>();
		materialesreciclados = _materialrecicladoService.listarMaterialUsuario(id);
		if(materialesreciclados.isEmpty()) {
			return new ResponseEntity<List<MateriaReciclado>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<MateriaReciclado>>(materialesreciclados, HttpStatus.OK);
	}


	@PutMapping("/{usuarioID}/{tipoID}/editar")
	public void update(@PathVariable(value="tipoID") int tipoID, @PathVariable(value="usuarioID") int usuarioID, @RequestBody MateriaReciclado materiaReciclado) {
		Usuario user = _usuarioService.finbyId(usuarioID).get();
		Tipo tipo  = _tipoService.finbyId(tipoID).get();
		materiaReciclado.setUsuario(user);
		materiaReciclado.setTipo(tipo);
		_materialrecicladoService.update(materiaReciclado);
	}


}
