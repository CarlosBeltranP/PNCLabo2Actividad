package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.uca.capas.domain.Usuario;

@Controller
public class MainController {
	
	@GetMapping("/agregarUsuario")
	public String enviarForm(Usuario usuario) {
		
		return "agregarUsuario";
	}
	
	@PostMapping("/mostrarMensaje")
	public String procesarForm(Usuario usuario) {
		
		return "mostrarMensaje";
	}
}
