package br.com.raphael.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.raphael.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
