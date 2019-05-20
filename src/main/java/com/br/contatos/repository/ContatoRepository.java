package com.br.contatos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.contatos.entity.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Contato>{

}
