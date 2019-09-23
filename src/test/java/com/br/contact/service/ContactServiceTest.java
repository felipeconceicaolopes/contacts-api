package com.br.contact.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import br.com.contact.entity.Contact;
import br.com.contact.repository.ContactRepository;
import br.com.contact.service.ContactService;

@RunWith(MockitoJUnitRunner.class)
public class ContactServiceTest {
	
	@InjectMocks
	private ContactService contactService;
	
	@Mock
	private ContactRepository contactRepository;
	
	private List<Contact> contactList = new ArrayList<Contact>();
	
	@Before
	public void init() {
		Contact contact1 = new Contact();
		Contact contact2 = new Contact();
		
		contact1.setId(Long.valueOf(1));
		contact1.setName("Teste 1");
		contact1.setValue("(11) 96342-2126");
		
		contact2.setId(Long.valueOf(2));
		contact2.setName("Teste 2");
		contact2.setValue("(12) 4648-7410");
		
		contactList.add(contact1);
		contactList.add(contact2);
	}
	
	@Test
	public void getContactsTest() {
		Mockito.when(contactRepository.findAll()).thenReturn(contactList);
		
		assertNotNull(contactService.getContacts());
		assertEquals(contactList, contactService.getContacts());
	}
}