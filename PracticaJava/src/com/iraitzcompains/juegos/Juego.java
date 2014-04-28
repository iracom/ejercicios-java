package com.iraitzcompains.juegos;

public abstract class Juego {
	
	private int vidas;
	private int vidasInicio;
	private static int record = 0;
	
	public Juego(int vidas) {
		this.vidas = vidas;
		this.vidasInicio = vidas;
	}
	
	public int getVidas() {
		return vidas;
	}
	
	public int getVidasInicio() {
		return this.vidasInicio;
	}
	
	public int getRecord() {
		return record;
	}
	
	public boolean quitaVida() {
		this.vidas--;
		if (this.vidas == 0) {
			System.out.println("Juego Terminado");
			return false;
		} else {
			return true;
		}
	}
	
	public void reiniciaPartida() {
		this.vidas = this.vidasInicio;
	}
	
	public void actualizarRecord() {
		if(this.vidas == record) {
			System.out.println("Has alcanzado el record!!");
		} else if(this.vidas > record) {
			record = this.vidas;
			System.out.println("Se ha batido el recor!! Record actual: " + String.valueOf(this.vidas));
		}
	}
	
	public void muestraVidasRestantes() {
		System.out.println("Vidas restantes: " + this.vidas);
	}
	
	public abstract void juega();

}
