package com.iraitzcompains.clasesestandar;

import java.util.Scanner;

public class Ej6_01 {

	public static void main(String[] args) {
		
		System.out.println("Introduzca el DNI:");
		Scanner entrada = new Scanner(System.in);
		
		VerificarDNI dni = new VerificarDNI(entrada.next());

		if(dni.comprobarDNI())
		{
			System.out.println(dni.getNumeros());
		} else {
			System.out.println("NIF no valido");
		}
	}

}
