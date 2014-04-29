package com.iraitzcompains.juegos.numeros;

import java.util.Date;
import java.util.Random;

import com.iraitzcompains.juegos.numeros.JuegoAdivinaNumero;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero {

	/**
	 * Constructor.
	 * Crea un n�mero impar de forma aleatoria
	 * @param vidas
	 */
	public JuegoAdivinaImpar(int vidas) {
		super(vidas);
		boolean esImpar = false;
		//Mientras no se consiga un n�mero impar, seguir intentadolo
		while (!esImpar) {
			Date fecha = new Date();
			Random aleatorio = new Random();
			aleatorio.setSeed(fecha.getTime());
			this.numeroProgramador = aleatorio.nextInt(11);
			if(this.validaNumero(this.numeroProgramador))
				esImpar = true;
		}
	}

	/**
	 * Comprueba que el n�mero sea impar
	 * @return boolean
	 */
	@Override
	public boolean validaNumero(int numero) {
		return numero % 2 != 0;
	}

	/**
	 * Muestra el nombre del juego
	 */
	@Override
	public void muestraNombre() {
		System.out.println("Adivina un n�mero impar");
	}

	/**
	 * Muestra la informaci�n del juego.
	 */
	@Override
	public void muestraInfo() {
		System.out.println("Debe de acertar un n�mero impar entre el 0 y el 10. Tiene 3 intentos.");
	}

}