package br.com.raphael.webservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.raphael.webservice.entities.User;
import br.com.raphael.webservice.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {	
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		//vai retornar o obj que estiver dentro do Optional.
		return obj.get();
	}
	
	//inserir um novo obj(User) no db
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	
}
