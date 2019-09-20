package br.com.contact.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.contact.entity.Contact;
import br.com.contact.service.ContactService;

@RestController
@RequestMapping(value = "/v1/contacts")
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@PostMapping
	public ResponseEntity<Contact> save(@RequestBody Contact contact) {		 
		 
		 return new ResponseEntity<Contact>(contactService.save(contact), HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<Contact>> findAll(){
		List<Contact> contacts = contactService.getContacts();
		
		return ResponseEntity.ok(contacts);
	}
}
