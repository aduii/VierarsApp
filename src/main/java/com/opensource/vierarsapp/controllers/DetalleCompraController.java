package com.opensource.vierarsapp.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.opensource.vierarsapp.models.Detalle_Compra;
import com.opensource.vierarsapp.services.DetalleCompraService;

@RestController
@RequestMapping("/detallecompra")
public class DetalleCompraController {

	@Autowired
	DetalleCompraService _detallecompraService;
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<List<Detalle_Compra>> getStudent(){
		List<Detalle_Compra> detallecompras = new ArrayList<>();
		detallecompras = _detallecompraService.listAll();
		if(detallecompras.isEmpty()) {
			return new ResponseEntity<List<Detalle_Compra>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Detalle_Compra>>(detallecompras, HttpStatus.OK);
	}
}
