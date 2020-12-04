package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.IPrimerService;

@Controller
@RequestMapping("/")
public class ServiceController {

	@Autowired
	@Qualifier("primerService")
	private IPrimerService primerService;

	@GetMapping("/listado")
	public String listadoPersonas(Model model) {
		model.addAttribute("personas", primerService.getPersonas());
		return "listado";
	}
}
