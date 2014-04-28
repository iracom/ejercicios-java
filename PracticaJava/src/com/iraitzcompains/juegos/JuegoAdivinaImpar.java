package com.iraitzcompains.juegos;

public class JuegoAdivinaImpar extends JuegoAdivinaNumero {

	public JuegoAdivinaImpar(int vidas, int numero) {
		super(vidas, numero);
	}

	@Override
	public boolean validaNumero(int numero) {
		return numero % 2 != 0;
	}
	
	

}
