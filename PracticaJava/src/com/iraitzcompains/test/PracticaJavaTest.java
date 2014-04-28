package com.iraitzcompains.test;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import com.iraitzcompains.juegos.JuegoAdivinaImpar;
import com.iraitzcompains.juegos.JuegoAdivinaNumero;
import com.iraitzcompains.juegos.JuegoAdivinaPar;
import com.iraitzcompains.interfaces.Jugable;

public class PracticaJavaTest {

	ArrayList<Jugable> juegos;
	Jugable juego;

	@Before
	public void setUp() throws Exception {
		juego = eligeJuego();
	}

	public Jugable eligeJuego() {
		juegos = new ArrayList<Jugable>();
		
		JuegoAdivinaNumero juego1 = new JuegoAdivinaNumero(3, 7);
		JuegoAdivinaPar juego2 = new JuegoAdivinaPar(3, 6);
		JuegoAdivinaImpar juego3 = new JuegoAdivinaImpar(2, 5);

		juegos.add(juego1);
		juegos.add(juego2);
		juegos.add(juego3);

		System.out.println("0.Adivina un nœmero");
		System.out.println("1.Adivina un nœmero par");
		System.out.println("2.Adivina un nœmero impar");
		boolean seleccionado = false;
		int opcion = 0;
		while (!seleccionado) {
			System.out.println("Seleccione un juego:");
			Scanner entrada = new Scanner(System.in);
			opcion = entrada.nextInt();
			if (opcion > -1 && opcion < 3)
				seleccionado = true;
			else
				System.out.println("Seleccione entre 0 y 2");
		}
		return juegos.get(opcion);
	}

	@Test
	public void test() {
		juego.muestraNombre();
		juego.muestraInfo();
		juego.juega();
		boolean respondido = false;
		System.out.println("Desea jugar denuevo? S= S’, N= No");
		while (!respondido) {
			Scanner entrada = new Scanner(System.in);
			String respuesta = entrada.next();
			System.out.println("Su respuesta: " + respuesta.toUpperCase());
			if(respuesta.toUpperCase().equals("S")) {
				juego = eligeJuego();
				this.test();
				respondido = true;
			}
			else if (respuesta.toUpperCase().equals("N"))
				respondido = true;
			else
				System.out.println("Responda S para S’ o N para No");
		}
	}

}
