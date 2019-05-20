package com.br.contatos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.br.contatos.entity.Contato;
import com.br.contatos.service.ContatoService;

@Controller
@RequestMapping(value = "/")
public class MainController {
	
	@Autowired
	private ContatoService contatoService;
	
	@GetMapping
	public String main(Contato contato, Model model) {
		model.addAttribute("listaContatos", contatoService.listaContatos());
		return "home";
	}
}
