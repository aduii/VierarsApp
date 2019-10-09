package com.opensource.vierarsapp.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.opensource.vierarsapp.models.Compra;
import com.opensource.vierarsapp.services.CompraService;

@Controller
@RequestMapping("compra")
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
}
