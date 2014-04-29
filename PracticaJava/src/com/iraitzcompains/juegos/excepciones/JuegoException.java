package com.iraitzcompains.juegos.excepciones;

public class JuegoException extends Exception {

	/**
	 * ID que pide Eclipse
	 */
	private static final long serialVersionUID = 4866559362365410238L;
	
	/**
	 * Mensage que contendr‡ el error
	 */
	private String mensage;
	
	/**
	 * Constructor
	 * @param mensage
	 */
	public JuegoException(String mensage) {
		this.mensage = mensage;
	}
	
	/**
	 * Devuelve el mensage dl error.
	 * @return String
	 */
	public String getMensage() {
		return this.mensage;
	}

}
