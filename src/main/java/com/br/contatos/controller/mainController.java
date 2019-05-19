package com.br.contatos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class mainController {
	
	@GetMapping
	public String main() {
		return "home";
	}
}
