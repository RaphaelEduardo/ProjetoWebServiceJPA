package br.com.raphael.webservice.entities.enums;

public enum OrderStatus {

	// Controle manual do codigo.
	WAITING_PAYMENT(1), PAID(2), SHIPPED(3), DELIVERED(4), CANCELED(5);

	private int code;

	private OrderStatus(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	// retorna o OrderStatus correspondente ao Codigo passado.
	public static OrderStatus valueOf(int code) {
		// Percorre todos os valores possiveis de OrderStatus
		for (OrderStatus value : OrderStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code!");
	}
}
