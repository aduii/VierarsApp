package com.opensource.vierarsapp.controllers;

import com.opensource.vierarsapp.models.Userlogin;
import com.opensource.vierarsapp.models.Usuario;
import com.opensource.vierarsapp.services.IUsuarioService;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@Autowired
	IUsuarioService _service;


	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Model model) {
		return "Hola mundo";
	}

	@PostMapping("/userlogin")
  	public Usuario newEmployee(@RequestBody Userlogin userlogin) {
		return _service.buscarPorEmail(userlogin.getUsername(), userlogin.getPassword());
  	}
	
}
