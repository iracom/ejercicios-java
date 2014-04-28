package com.iraitzcompains.juegos.numeros;

import java.util.Date;
import java.util.Random;

import com.iraitzcompains.juegos.numeros.JuegoAdivinaNumero;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero {

	public JuegoAdivinaImpar(int vidas) {
		super(vidas);
		boolean esImpar = false;
		while (!esImpar) {
			Date fecha = new Date();
			Random aleatorio = new Random();
			aleatorio.setSeed(fecha.getTime());
			this.numeroProgramador = aleatorio.nextInt(11);
			if(this.numeroProgramador % 2 != 0)
				esImpar = true;
		}
	}

	@Override
	public boolean validaNumero(int numero) {
		return numero % 2 != 0;
	}

	@Override
	public void muestraNombre() {
		System.out.println("Adivina un nœmero impar");
	}

	@Override
	public void muestraInfo() {
		System.out.println("Debe de acertar un nœmero impar entre el 0 y el 10. Tiene 3 intentos.");
	}

}