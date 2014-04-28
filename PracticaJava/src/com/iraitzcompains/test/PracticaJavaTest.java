package com.iraitzcompains.test;

import org.junit.Before;
import org.junit.Test;

import com.iraitzcompains.juegos.Juego;
import com.iraitzcompains.juegos.JuegoAdivinaImpar;
import com.iraitzcompains.juegos.JuegoAdivinaNumero;
import com.iraitzcompains.juegos.JuegoAdivinaPar;

public class PracticaJavaTest {

	Juego juego1;
	Juego juego2;
	Juego juego3;
	
	@Before
	public void setUp() throws Exception {
		juego1 = new JuegoAdivinaNumero(3,6);
		juego2 = new JuegoAdivinaPar(3,6);
		juego3 = new JuegoAdivinaImpar(3,9);
	}

	@Test
	public void test() {
		juego1.juega();
		juego2.juega();
		juego3.juega();
	}

}
