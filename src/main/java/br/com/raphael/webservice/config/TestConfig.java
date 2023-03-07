package br.com.raphael.webservice.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.raphael.webservice.entities.Order;
import br.com.raphael.webservice.entities.User;
import br.com.raphael.webservice.repositories.OrderRepository;
import br.com.raphael.webservice.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	// tudo que estiver dentro do metodo vai ser executado quando a aplicação for iniciada.
	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "1234567");
	
		//ISO 8601 - Padrão de hora UTC.
		Order o1 = new Order(null, Instant.parse("2023-01-20T19:53:07Z"), u1); 
		Order o2 = new Order(null, Instant.parse("2023-02-21T03:42:10Z"), u2); 
		Order o3 = new Order(null, Instant.parse("2023-03-05T15:21:22Z"), u1); 
		
		//Para salvar no DB
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
	
}
