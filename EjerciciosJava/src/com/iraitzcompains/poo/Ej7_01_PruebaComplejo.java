package com.iraitzcompains.poo;

public class Ej7_01_PruebaComplejo {

	public static void main(String[] args) {
		
		Ej7_01_Complejo complejo = new Ej7_01_Complejo();
		System.out.println(complejo.toString());
		System.out.println(Ej7_01_Complejo.cuantasInstancias());
		
		Ej7_01_Complejo complejo1 = new Ej7_01_Complejo(4.0, 1.0);
		complejo.sumar(complejo1);
		System.out.println(complejo.toString());
		System.out.println(Ej7_01_Complejo.cuantasInstancias());
		
		//Ej7_01_Complejo complejo1 = new Ej7_01_Complejo(1.0, 1.0);
		Ej7_01_Complejo.sumar(complejo, complejo1);
		System.out.println(complejo.toString());
		
		System.out.println(Ej7_01_Complejo.cuantasInstancias());
	}

}
