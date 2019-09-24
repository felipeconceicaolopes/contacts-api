package br.com.contact.resource;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.google.gson.Gson;

import br.com.contact.ContactApplication;
import br.com.contact.JsonHelper;
import br.com.contact.entity.Contact;
import br.com.contact.service.ContactService;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = ContactApplication.class)
public class ContactControllerTest {

	private static final String FILE_PATH_POST = "assets/payload/contactPOST.json";
	
	@InjectMocks
	private ContactController contactController;
	
	@Mock
	private ContactService contactService;
	
	private MockMvc mockMvc;
	
	@Before
	public void init() {
		mockMvc = MockMvcBuilders.standaloneSetup(this.contactController).build();
	}
	
	@Test
	public void save() throws Exception {
		Contact contact = getContact();
		
		when(contactService.save(contact)).thenReturn(contact);

		mockMvc.perform(post("/v1/contacts", contact).contentType(MediaType.APPLICATION_JSON)
				.content(JsonHelper.asJsonString(contact))).andExpect(status().isCreated());
		
	}
	
	private Contact getContact() {
		return new Gson().fromJson(JsonHelper.readPath(FILE_PATH_POST), Contact.class);	}
}
