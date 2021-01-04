package com.clients.organiser;

import com.clients.organiser.models.*;
import com.clients.organiser.repositories.*;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ClientsOrganiserApplicationTests {

	@Autowired
	ClientRecordRepository clientRecordRepository;

	@Autowired
	ClientRepository clientRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createClientRecord() {
		ClientRecord pippa_record = new ClientRecord("Mrs Pippa Longstocking");
		clientRecordRepository.save(pippa_record);
	}

	@Test
	public void createClient() {
		Client pippa = new Client("Pippy", "Longstocking", "Mrs", "Individual");
		clientRepository.save(pippa);
	}
}
