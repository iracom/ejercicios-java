package com.iraitzcompains.profesor;

import java.util.Scanner;

import com.iraitzcompains.juegos.excepciones.JuegoException;

public class Teclado {

	public static int leeEntero() throws JuegoException {
		Integer entero = new Integer(0);
		String dato;
		try {
			Scanner entrada = new Scanner(System.in);
			dato = entrada.next();
			entero = Integer.parseInt(dato);
			return entero.intValue();
		} catch (NumberFormatException e) {
			JuegoException ex = new JuegoException("Introduzca un número entero.\n");
			throw ex;
		} 
	}
}
