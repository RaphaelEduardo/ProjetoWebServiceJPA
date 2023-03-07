package br.com.raphael.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.raphael.webservice.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
