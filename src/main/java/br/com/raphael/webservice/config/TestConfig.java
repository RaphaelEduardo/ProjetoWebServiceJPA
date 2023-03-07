package br.com.raphael.webservice.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.raphael.webservice.entities.User;
import br.com.raphael.webservice.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	// tudo que estiver dentro do metodo vai ser executado quando a aplicação for iniciada.
	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "1234567");
	
		//Para salvar no DB
		userRepository.saveAll(Arrays.asList(u1, u2));	
	}
	
}
