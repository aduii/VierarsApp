package com.opensource.vierarsapp.controllers;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.opensource.vierarsapp.models.Pais;
import com.opensource.vierarsapp.services.PaisService;

@Controller
@RequestMapping("pais")
public class PaisController {

	
	@Autowired
	PaisService _paisService;
	
	//GET
	@RequestMapping(value = "/listar", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<List<Pais>> getPais(){
		List<Pais> paises = new ArrayList<>();
		paises = _paisService.listAll();
		if(paises.isEmpty()) {
			return new ResponseEntity<List<Pais>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Pais>>(paises, HttpStatus.OK);
	}
	
	
}
