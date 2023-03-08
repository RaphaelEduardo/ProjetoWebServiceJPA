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
		// vai retornar o obj que estiver dentro do Optional.
		return obj.get();
	}

	// inserir um novo obj(User) no db
	public User insert(User obj) {
		return repository.save(obj);
	}

	// deletar um obj(User) no db
	public void delete(Long id) {
		repository.deleteById(id);
	}

	// atualizar um obj(User) no db
	public User update(Long id, User obj) {
		// instancia um objeto monitorado (so prepara sem efetuar nenhuma operacao)
		User entity = repository.getReferenceById(id);
		// operacao
		updateData(entity, obj); // atualizar os dados de entity, baseado no que vai receber de obj
		return repository.save(entity);
	}

	// atualiza os dados de entity, com base no que recebeu no obj.
	private void updateData(User entity, User obj) {
		// nem todos os dados podem ser atualizados (ex.: id, senha,...)
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
