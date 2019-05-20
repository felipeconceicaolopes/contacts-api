package com.br.contatos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.contatos.entity.Contato;
import com.br.contatos.repository.ContatoRepository;

@Service
public class ContatoService {
	
	@Autowired
	private ContatoRepository contatoRepository;
	
	public Contato save(Contato contato) {
		return contatoRepository.save(contato);
	}
	
	public List<Contato> listaContatos(){
		return contatoRepository.findAll();
	}
}
