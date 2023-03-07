package br.com.raphael.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.raphael.webservice.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
