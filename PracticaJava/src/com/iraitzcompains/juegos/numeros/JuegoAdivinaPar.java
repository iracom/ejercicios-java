package com.iraitzcompains.juegos.numeros;

import com.iraitzcompains.juegos.numeros.JuegoAdivinaNumero;

public class JuegoAdivinaPar extends JuegoAdivinaNumero {
	
	public JuegoAdivinaPar(int vidas) {
		super(vidas);
	}
	
	@Override
	public boolean validaNumero (int numero) {
		return numero % 2 == 0;
	}

	@Override
	public void muestraNombre() {
		System.out.println("Adivina un nœmero par");
	}

	@Override
	public void muestraInfo() {
		System.out.println("Debe de acertar un nœmero par entre el 0 y el 10. Tiene 3 intentos.");
	}

}
