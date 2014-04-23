package com.iraitzcompains.clasesestandar;

import java.util.Scanner;

public class Ej6_01 {

	public static void main(String[] args) {
		
		System.out.println("Introduzca el DNI:");
		Scanner entrada = new Scanner(System.in);
		
		VerificarDNI dni = new VerificarDNI(entrada.next());

		System.out.println("El DNI introducido es " + dni.comprobarDNI());
	}

}
