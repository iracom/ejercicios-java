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
	 * Genera un n�mero aleatorio entre 0 y 10. Este ser� el n�mero a acertar.
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
			//Mientras no se haya terminado el juego, pedir un n�mero del 0 al 10 y comprobar si se ha acertado.
			//El bucle terminar� cuando se acierte o cuando se quede sin vidas.
			do {
				int numeroJugador;
				boolean valido = false;
				//Mientras el n�mero no sea v�lido (que el n�mero est� entre el 0 y el 10 o en el juego par, que sea par y en el juego impar, que sea impar),
				//Se pedir� al usuario que introduzca un n�mero.
				do {
					System.out.println("Adivine un n�mero entre 0 y 10:");
					numeroJugador = Teclado.leeEntero();
					valido = validaNumero(numeroJugador);
				} while (!valido);
				//Si el n�mero introducido es el mismo que se ha generado, terminarlo.
				if (numeroJugador == this.numeroProgramador) {
					System.out.println("Acertaste!!");
					this.actualizarRecord();
					terminado = true;
				} else { //Si no se ha acertado
					boolean quedanVidas = true;
					//Si no se ha acertado y el n�mero es v�lido se resta una vida.
					if (valido) {
						quedanVidas = this.quitaVida();
					}
					//Si quedan vidas, dar pista al jugador y no terminar la partida
					if (quedanVidas) {
						if (numeroJugador > this.numeroProgramador) {
							System.out
									.println("El n�mero a acertar es menor. Sigue intentando...");
						} else {
							System.out
									.println("El n�mero a acertar es mayor. Sigue intentando...");
						}
					} else { //Si no quedan vidas, terminar el juego.
						terminado = true;
					}
				}
			} while (!terminado);
		} catch (JuegoException je) {
			//Esta excepci�n se lanzar� si lo introducido por el jugador no es un n�mero.
			System.out.println(je.getMensage());
		} finally {
			System.out.println("Juego finalizado");
		}
	}

	/**
	 * Comprueba el n�mero. Este m�todo tiene m�s sentido en los juegos Par e Impar.
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
		System.out.println("Adivina un n�mero");
	}

	/**
	 * Muestra la informaci�n del juego
	 */
	public void muestraInfo() {
		System.out
				.println("Debe de acertar un n�mero entre el 0 y el 10. Tiene 3 intentos.");
	}

}
