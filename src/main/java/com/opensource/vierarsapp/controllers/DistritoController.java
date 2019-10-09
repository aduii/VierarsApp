package com.opensource.vierarsapp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.opensource.vierarsapp.models.Distrito;
import com.opensource.vierarsapp.services.DistritoService;



@Controller
@RequestMapping("distrito")
public class DistritoController {
	@Autowired
	DistritoService _distritoService;

	//GET
			@RequestMapping(value = "/listar", method = RequestMethod.GET, headers = "Accept=application/json")
			public ResponseEntity<List<Distrito>> getDistrito(){
				List<Distrito> distritos = new ArrayList<>();
				distritos = _distritoService.listAll();
				if(distritos.isEmpty()) {
					return new ResponseEntity<List<Distrito>>(HttpStatus.NO_CONTENT);
				}
				return new ResponseEntity<List<Distrito>>(distritos, HttpStatus.OK);
			}
}
