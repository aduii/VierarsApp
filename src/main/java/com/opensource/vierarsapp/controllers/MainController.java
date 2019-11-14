package com.opensource.vierarsapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

	@GetMapping(value = "/index")
	public String index(Model model) {

		model.addAttribute("message"," Mensaje de prueba desde el controller :D usando Thymeleaft");	
		return "index";
	}
	
}
