package com.opensource.vierarsapp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.opensource.vierarsapp.models.Tipo;
import com.opensource.vierarsapp.services.TipoService;

@RestController
@RequestMapping("/tipo")
public class TipoController {
	
	@Autowired
	TipoService _tipoService;
	
	@RequestMapping(value ="/listar", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<List<Tipo>> getStudent(){
		List<Tipo> tipos = new ArrayList<>();
		tipos = _tipoService.listAll();
		if(tipos.isEmpty()) {
			return new ResponseEntity<List<Tipo>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Tipo>>(tipos, HttpStatus.OK);
	}
	
}
