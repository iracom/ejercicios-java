package com.iraitzcompains.juegos;

public class JuegoAdivinaPar extends JuegoAdivinaNumero {
	
	public JuegoAdivinaPar(int vidas, int numero) {
		super(vidas,numero);
	}
	
	@Override
	public boolean validaNumero (int numero) {
		return numero % 2 == 0;
	}

}
