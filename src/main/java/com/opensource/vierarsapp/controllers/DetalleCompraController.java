package com.opensource.vierarsapp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.opensource.vierarsapp.models.DetalleCompra;
import com.opensource.vierarsapp.services.DetalleCompraService;

@Controller
@RequestMapping("detallecompra")
public class DetalleCompraController {
	@Autowired
	DetalleCompraService _detallecompraService;
	
	//GET
	@RequestMapping(value = "/listar", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<List<DetalleCompra>> getCiudad(){
		List<DetalleCompra> _detallescompras = new ArrayList<>();
		_detallescompras = _detallecompraService.listAll();
		if(_detallescompras.isEmpty()) {
			return new ResponseEntity<List<DetalleCompra>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<DetalleCompra>>(_detallescompras, HttpStatus.OK);
		
	}
			
}
