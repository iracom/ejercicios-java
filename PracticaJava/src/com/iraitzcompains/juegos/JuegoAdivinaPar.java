package com.iraitzcompains.juegos;

public class JuegoAdivinaPar extends JuegoAdivinaNumero {
	
	public JuegoAdivinaPar(int vidas, int numero) {
		super(vidas,numero);
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
