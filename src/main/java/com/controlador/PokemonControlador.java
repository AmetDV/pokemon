package com.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.servicio.IPokemonServicio;

@Controller
public class PokemonControlador {
	//Se hace referencia al servicio
	@Autowired
	private IPokemonServicio servicio;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		//retornando una lista de pokemones
		
		//Enviar al formulario
		model.addAttribute("pokemones",servicio.listar());
		return "index";
	}
	
	
	@GetMapping("/help")
	public String info() {
		return "info";
	}
	

}
