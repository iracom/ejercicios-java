package com.iraitzcompains.juegos.numeros;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import com.iraitzcompains.juegos.Juego;
import com.iraitzcompains.juegos.interfaces.Jugable;

public class JuegoAdivinaNumero extends Juego implements Jugable {

	private int numeroProgramador;

	public JuegoAdivinaNumero(int vidas) {
		super(vidas);
		Date fecha = new Date();
		Random aleatorio = new Random();
		aleatorio.setSeed(fecha.getTime());
		this.numeroProgramador = aleatorio.nextInt(11);
	}

	public void juega() {
		this.reiniciaPartida();
		boolean terminado = false;
		do {
			int numeroJugador;
			boolean valido = false;
			do {
				System.out.println("Adivine un nœmero entre 0 y 10:");
				Scanner entrada = new Scanner(System.in);
				numeroJugador = entrada.nextInt();
				valido = validaNumero(numeroJugador);
			} while (!valido);
			if (numeroJugador == this.numeroProgramador) {
				System.out.println("Acertaste!!");
				this.actualizarRecord();
				terminado = true;
			} else {
				boolean quedanVidas = true;
				if (valido) {
					quedanVidas = this.quitaVida();
				}
				if (quedanVidas) {
					if (numeroJugador > this.numeroProgramador) {
						System.out
								.println("El nœmero a acertar es menor. Sigue intentando...");
					} else {
						System.out
								.println("El nœmero a acertar es mayor. Sigue intentando...");
					}
				} else {
					terminado = true;
				}
			}
		} while (!terminado);
	}

	public boolean validaNumero(int numero) {
		return true;
	}

	public void muestraNombre() {
		System.out.println("Adivina un nœmero");
	}

	public void muestraInfo() {
		System.out.println("Debe de acertar un nœmero entre el 0 y el 10. Tiene 3 intentos.");
	}

}

