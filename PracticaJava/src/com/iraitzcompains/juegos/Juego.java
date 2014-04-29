package com.iraitzcompains.juegos;

public abstract class Juego {
	
	/**
	 * Atributos
	 */
	private int vidas;
	private int vidasInicio;
	private static int record = 0;
	
	/**
	 * Constructor
	 * @param vidas
	 */
	public Juego(int vidas) {
		this.vidas = vidas;
		this.vidasInicio = vidas;
	}
	
	/**
	 * Getters y Setters
	 * @return
	 */
	public int getVidas() {
		return vidas;
	}
	
	public int getVidasInicio() {
		return this.vidasInicio;
	}
	
	public int getRecord() {
		return record;
	}
	
	/**
	 * Resta una vida del juego. Devuelve false si se ha quedado sin vidas y true si le queda alguna.
	 * @return boolean
	 */
	public boolean quitaVida() {
		this.vidas--;
		if (this.vidas == 0) {
			System.out.println("Juego Terminado");
			return false;
		} else {
			return true;
		}
	}
	
	/**
	 * Inicializa las vidas
	 */
	public void reiniciaPartida() {
		this.vidas = this.vidasInicio;
	}
	
	/**
	 * Comprueba si se ha alcanzado o ha batido el record. Si es as’ se escribe un mensage y en el segundo caso se actualiza el record.
	 */
	public void actualizarRecord() {
		if(this.vidas == record) {
			System.out.println("Has alcanzado el record!!");
		} else if(this.vidas > record) {
			record = this.vidas;
			System.out.println("Se ha batido el recor!! Record actual: " + String.valueOf(this.vidas));
		}
	}
	
	/**
	 * Escribe un mensage con las vidas que quedan.
	 */
	public void muestraVidasRestantes() {
		System.out.println("Vidas restantes: " + this.vidas);
	}

}
