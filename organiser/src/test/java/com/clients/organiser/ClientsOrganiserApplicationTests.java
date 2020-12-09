package com.clients.organiser;

import com.clients.organiser.models.Client;
import com.clients.organiser.repositories.ClientRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ClientsOrganiserApplicationTests {

	@Autowired
	ClientRepository clientRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createClient() {
		Client susan = new Client("Susan","Individual");
		clientRepository.save(susan);
	}
}
