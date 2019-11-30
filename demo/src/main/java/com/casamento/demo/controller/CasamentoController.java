package com.casamento.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/casamento")
public class CasamentoController {

	@GetMapping("/pages/cadastrar-convidado")
	public String cadastroConviddo() {
		return "/pages/cadastar-convidado";
	}
	
	@GetMapping("/pages/listar-convidados")
	public String listarConvidados() {
		return "/pages/listar-convidados";
	}
	
}
