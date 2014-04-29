package com.iraitzcompains.juegos.numeros;

import java.util.Date;
import java.util.Random;

import com.iraitzcompains.juegos.Juego;
import com.iraitzcompains.juegos.excepciones.JuegoException;
import com.iraitzcompains.juegos.interfaces.Jugable;
import com.iraitzcompains.profesor.Teclado;

public class JuegoAdivinaNumero extends Juego implements Jugable {

	/**
	 * Atributos
	 */
	protected int numeroProgramador;

	/**
	 * Constructor
	 * Genera un número aleatorio entre 0 y 10. Este será el número a acertar.
	 * @param vidas
	 */
	public JuegoAdivinaNumero(int vidas) {
		super(vidas);
		Date fecha = new Date();
		Random aleatorio = new Random();
		aleatorio.setSeed(fecha.getTime());
		this.numeroProgramador = aleatorio.nextInt(10);
	}

	/**
	 * Metodo que ejecuta el juego
	 */
	public void juega() {
		try {
			//Se inicializan las vidas
			this.reiniciaPartida();
			boolean terminado = false;
			//Mientras no se haya terminado el juego, pedir un número del 0 al 10 y comprobar si se ha acertado.
			//El bucle terminará cuando se acierte o cuando se quede sin vidas.
			do {
				int numeroJugador;
				boolean valido = false;
				//Mientras el número no sea válido (que el número esté entre el 0 y el 10 o en el juego par, que sea par y en el juego impar, que sea impar),
				//Se pedirá al usuario que introduzca un número.
				do {
					System.out.println("Adivine un número entre 0 y 10:");
					numeroJugador = Teclado.leeEntero();
					valido = validaNumero(numeroJugador);
				} while (!valido);
				//Si el número introducido es el mismo que se ha generado, terminarlo.
				if (numeroJugador == this.numeroProgramador) {
					System.out.println("Acertaste!!");
					this.actualizarRecord();
					terminado = true;
				} else { //Si no se ha acertado
					boolean quedanVidas = true;
					//Si no se ha acertado y el número es válido se resta una vida.
					if (valido) {
						quedanVidas = this.quitaVida();
					}
					//Si quedan vidas, dar pista al jugador y no terminar la partida
					if (quedanVidas) {
						if (numeroJugador > this.numeroProgramador) {
							System.out
									.println("El número a acertar es menor. Sigue intentando...");
						} else {
							System.out
									.println("El número a acertar es mayor. Sigue intentando...");
						}
					} else { //Si no quedan vidas, terminar el juego.
						terminado = true;
					}
				}
			} while (!terminado);
		} catch (JuegoException je) {
			//Esta excepción se lanzará si lo introducido por el jugador no es un número.
			System.out.println(je.getMensage());
		} finally {
			System.out.println("Juego finalizado");
		}
	}

	/**
	 * Comprueba el número. Este método tiene más sentido en los juegos Par e Impar.
	 * @param numero
	 * @return
	 */
	public boolean validaNumero(int numero) {
		return true;
	}

	/**
	 * Muestra el nombre del juego.
	 */
	public void muestraNombre() {
		System.out.println("Adivina un número");
	}

	/**
	 * Muestra la información del juego
	 */
	public void muestraInfo() {
		System.out
				.println("Debe de acertar un número entre el 0 y el 10. Tiene 3 intentos.");
	}

}
