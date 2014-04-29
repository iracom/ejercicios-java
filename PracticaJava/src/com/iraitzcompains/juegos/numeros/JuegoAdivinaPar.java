package com.iraitzcompains.juegos.numeros;

import java.util.Date;
import java.util.Random;

import com.iraitzcompains.juegos.numeros.JuegoAdivinaNumero;

public class JuegoAdivinaPar extends JuegoAdivinaNumero {

	/**
	 * Constructor
	 * Crea un nœmero par de forma aleatoria
	 * @param vidas
	 */
	public JuegoAdivinaPar(int vidas) {
		super(vidas);
		boolean esPar = false;
		//Genrerar‡ nœmeros aleatorios hasta que consiga un nœmero par
		while (!esPar) {
			Date fecha = new Date();
			Random aleatorio = new Random();
			aleatorio.setSeed(fecha.getTime());
			this.numeroProgramador = aleatorio.nextInt(10);
			if(this.validaNumero(this.numeroProgramador))
				esPar = true;
		}
	}

	/**
	 * Comprueba que el nœmero es par
	 */
	@Override
	public boolean validaNumero(int numero) {
		return numero % 2 == 0;
	}

	/**
	 * Muestra el nombre del juego
	 */
	@Override
	public void muestraNombre() {
		System.out.println("Adivina un nœmero par");
	}

	/**
	 * Muestra la informaci—n del juego.
	 */
	@Override
	public void muestraInfo() {
		System.out
				.println("Debe de acertar un nœmero par entre el 0 y el 10. Tiene 3 intentos.");
	}

}
