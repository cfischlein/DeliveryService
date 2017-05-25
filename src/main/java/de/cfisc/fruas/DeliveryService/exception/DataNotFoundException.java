package de.cfisc.fruas.DeliveryService.exception;

public class DataNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = -3127507159330375277L;

	public DataNotFoundException(String message) {
		super(message);
	}
	
}
