package br.com.raphael.webservice.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.raphael.webservice.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Maria", "maria@gmail.com", "7777777", "12345");
		//vai retornar a resposta com sucesso (ok) + o corpo do usuario (body) instanciado "u".
		return ResponseEntity.ok().body(u);
	}
	
	
}
