package com.opensource.vierarsapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class MainController {

	@RequestMapping(value = "")
	public String index(Model model) {

		model.addAttribute("message"," Mensaje de prueba desde el controller :D usando Thymeleaft");	
		return "index";
	}
	
}
