package com.iraitzcompains.profesor;

import java.util.Scanner;

import com.iraitzcompains.juegos.excepciones.JuegoException;

public class Teclado {

	/**
	 * M�todo est�tico, porque no hace falta crear una instancia de teclado cada vez que se quiera llamarlo,
	 * que comprueba que el dato introducido por el usuario es un n�mero.
	 * En caso de que no sea, lanza una excepci�n.
	 * @return
	 * @throws JuegoException
	 */
	public static int leeEntero() throws JuegoException {
		Integer entero = new Integer(0);
		String dato;
		try {
			Scanner entrada = new Scanner(System.in);
			dato = entrada.next();
			//Si Integer.parseInt da error, es que el dato no es un n�mero y saltar� al catch
			entero = Integer.parseInt(dato);
			return entero.intValue();
		} catch (NumberFormatException e) {
			JuegoException ex = new JuegoException("Introduzca un n�mero entero.\n");
			throw ex;
		} 
	}
}
