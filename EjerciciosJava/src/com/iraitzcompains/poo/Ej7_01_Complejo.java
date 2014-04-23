package com.iraitzcompains.poo;

public class Ej7_01_Complejo {
	
	private double pReal;
	private double pImag;
	private static int instancias = 0;
	
	//Constructores
	public Ej7_01_Complejo() {
		super();
		this.pReal = 1.0;
		this.pImag = 1.0;
		instancias++;
	}

	public Ej7_01_Complejo(double pReal, double pImag) {
		super();
		this.pReal = pReal;
		this.pImag = pImag;
		instancias++;
	}

	//Getters y Setters
	public double getpReal() {
		return this.pReal;
	}
	
	public void setpReal(double pReal) {
		this.pReal = pReal;
	}
	
	public double getpImag() {
		return this.pImag;
	}
	
	public void setpImag(double pImag) {
		this.pImag = pImag;
	}
	
	//MŽtodos
	public Ej7_01_Complejo asignar (double x, double y) {
		this.pReal = x;
		this.pImag = y;
		
		return this;
	}
	
	public void sumar(Ej7_01_Complejo b) {
		setpReal(this.pReal + b.getpReal());
		setpImag(this.pImag + b.getpImag());
	}
	
	public String toString() {
		return "Real: " + this.pReal + " Imaginario: " + this.pImag;
	}
	
	public static Ej7_01_Complejo sumar(Ej7_01_Complejo a, Ej7_01_Complejo b) {
		Ej7_01_Complejo resultado = new Ej7_01_Complejo();
		
		resultado.setpReal(a.getpReal() + b.getpReal());
		resultado.setpImag(a.getpImag() + b.getpImag());
		
		return resultado;
	}
	
	public boolean equals(Ej7_01_Complejo a){
		return a.getpReal() == this.getpReal() && a.getpImag() == this.getpImag();
	}

	public static int cuantasInstancias(){
		return instancias;
	}
}
