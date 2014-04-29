package com.iraitzcompains.test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;

import org.junit.Before;
import org.junit.Test;

import com.iraitzcompains.juegos.Aplicacion;
import com.iraitzcompains.juegos.excepciones.JuegoException;
import com.iraitzcompains.juegos.interfaces.Jugable;
import com.iraitzcompains.juegos.numeros.JuegoAdivinaNumero;

public class PracticaJavaTest {

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void testApp() {
		try {
			// JuegoAdivinaNumero
			Aplicacion.crearJuegos();
			
			ByteArrayInputStream in = new ByteArrayInputStream("0".getBytes());
			System.setIn(in);

			Jugable juego = Aplicacion.eligeJuego();
			assertTrue(juego instanceof JuegoAdivinaNumero);

			in = new ByteArrayInputStream("1".getBytes());
			System.setIn(in);

			juego = Aplicacion.eligeJuego();
			assertTrue(juego instanceof JuegoAdivinaNumero);

			in = new ByteArrayInputStream("2".getBytes());
			System.setIn(in);

			juego = Aplicacion.eligeJuego();
			assertTrue(juego instanceof JuegoAdivinaNumero);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			assertTrue(e instanceof JuegoException);
		}
	}

}
