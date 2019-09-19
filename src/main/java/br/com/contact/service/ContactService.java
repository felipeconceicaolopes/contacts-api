package br.com.contact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.contact.entity.Contact;
import br.com.contact.repository.ContactRepository;

@Service
public class ContactService {
	
	@Autowired
	private ContactRepository contactRepository;
	
	public Contact save(Contact contact) {
		return contactRepository.save(contact);
	}
	
	public List<Contact> getContacts(){
		return contactRepository.findAll();
	}
}
