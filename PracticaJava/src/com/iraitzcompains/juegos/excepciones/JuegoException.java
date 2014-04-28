package com.iraitzcompains.juegos.excepciones;

public class JuegoException extends Exception {

	private static final long serialVersionUID = 4866559362365410238L;
	
	private String mensage;
	
	public JuegoException(String mensage) {
		this.mensage = mensage;
	}
	
	public String getMensage() {
		return this.mensage;
	}

}
