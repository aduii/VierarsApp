package com.opensource.vierarsapp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.opensource.vierarsapp.models.MateriaReciclado;
import com.opensource.vierarsapp.services.MaterialRecicladoService;

@Controller
@RequestMapping("materialreciclado")
public class MaterialRecicladoController {

	@Autowired
	MaterialRecicladoService _materialrecicladoService;
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<List<MateriaReciclado>> getStudent(){
		List<MateriaReciclado> materialesreciclados = new ArrayList<>();
		materialesreciclados = _materialrecicladoService.listAll();
		if(materialesreciclados.isEmpty()) {
			return new ResponseEntity<List<MateriaReciclado>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<MateriaReciclado>>(materialesreciclados, HttpStatus.OK);
	}
}
