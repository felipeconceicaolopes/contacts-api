package com.br.contatos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.br.contatos.entity.Contato;
import com.br.contatos.service.ContatoService;

@Controller
@RequestMapping(value = "contato")
public class ContatoController {
	
	@Autowired
	private ContatoService contatoService;
	
	@PostMapping
	public String cadastrar(@ModelAttribute("contato") Contato contato, BindingResult result) {
		 if (result.hasErrors()) {
	            return "error";
		 }
		 
		 contatoService.save(contato);
		 
		 return "redirect:/";
	}
}
