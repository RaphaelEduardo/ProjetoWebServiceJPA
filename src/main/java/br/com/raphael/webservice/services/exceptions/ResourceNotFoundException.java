package br.com.raphael.webservice.services.exceptions;

// Runtime o compilador nao obriga a tratar
public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	// passa o id que tentou buscar e nao encontrou
	public ResourceNotFoundException(Object id) {
		//msg padrao
		super("Resource not found. Id " + id);
	}
	
}
