package com.iraitzcompains.test;

import java.util.Scanner;
import java.util.Vector;

import org.junit.Before;
import org.junit.Test;

import com.iraitzcompains.juegos.numeros.JuegoAdivinaImpar;
import com.iraitzcompains.juegos.numeros.JuegoAdivinaNumero;
import com.iraitzcompains.juegos.numeros.JuegoAdivinaPar;
import com.iraitzcompains.juegos.excepciones.JuegoException;
import com.iraitzcompains.juegos.interfaces.Jugable;
import com.iraitzcompains.profesor.Teclado;

public class PracticaJavaTest {

	Vector<Jugable> vJuegos;
	Jugable juego;

	@Before
	public void setUp() throws Exception {

	}

	public Jugable eligeJuego() throws JuegoException {
		vJuegos = new Vector<Jugable>(3, 2);
		this.infoVector(vJuegos);

		System.out.println("Preparando juegos...\n");
		JuegoAdivinaNumero juego1 = new JuegoAdivinaNumero(3);
		JuegoAdivinaPar juego2 = new JuegoAdivinaPar(3);
		JuegoAdivinaImpar juego3 = new JuegoAdivinaImpar(3);

		vJuegos.add(juego1);
		vJuegos.add(juego2);
		vJuegos.add(juego3);
		this.infoVector(vJuegos);

		System.out.println("0.Adivina un nœmero");
		System.out.println("1.Adivina un nœmero par");
		System.out.println("2.Adivina un nœmero impar");
		boolean seleccionado = false;
		int opcion = 0;
		while (!seleccionado) {
			System.out.println("Seleccione un juego:");
			opcion = Teclado.leeEntero();
			if (opcion > -1 && opcion < 3)
				seleccionado = true;
			else
				System.out.println("Seleccione entre 0 y 2");
		}
		return vJuegos.get(opcion);
	}

	@Test
	public void test() {
		try {
			juego = this.eligeJuego();
			juego.muestraNombre();
			juego.muestraInfo();
			juego.juega();
			boolean respondido = false;
			System.out.println("Desea jugar denuevo? S= Sí, N= No");
			while (!respondido) {
				Scanner entrada = new Scanner(System.in);
				String respuesta = entrada.next();
				System.out.println("Su respuesta: " + respuesta.toUpperCase());
				if (respuesta.toUpperCase().equals("S")) {
					this.test();
					respondido = true;
				} else if (respuesta.toUpperCase().equals("N"))
					respondido = true;
				else
					System.out.println("Responda S para S’ o N para No");
			}
		} catch (JuegoException je) {
			System.out.println(je.getMensage());
			this.test();
		}
	}

	private void infoVector(Vector<Jugable> v) {
		System.out.println("Capacidad: " + v.capacity() + ", Tamaño: "
				+ v.size());
	}

}
