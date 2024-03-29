package com.opensource.vierarsapp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.opensource.vierarsapp.models.Ciudad;
import com.opensource.vierarsapp.services.CiudadService;

@RestController
@RequestMapping("/ciudad")
public class CiudadController {
	@Autowired
	CiudadService _ciudadService;
	
	
	//GET
	@RequestMapping(value = "/listar", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<List<Ciudad>> getCiudad(){
		List<Ciudad> ciudades = new ArrayList<>();
		ciudades = _ciudadService.listAll();
		if(ciudades.isEmpty()) {
			return new ResponseEntity<List<Ciudad>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Ciudad>>(ciudades, HttpStatus.OK);
		
	}
		
}
