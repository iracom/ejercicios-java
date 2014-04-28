package com.iraitzcompains.juegos;

import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {

	private int numeroProgramador;

	public JuegoAdivinaNumero(int vidas, byte numero) {
		super(vidas);
		this.numeroProgramador = numero;
	}

	@Override
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
				if (!valido)
					quedanVidas = this.quitaVida();
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

}
