package com.iraitzcompains.clasesestandar;

import java.util.Scanner;

public class Ej6_01 {

	public static void main(String[] args) {
		
		System.out.println("Introduzca el DNI:");
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("El NIF es " + Ej6_01_Abstract.validar(entrada.next()));
	}

}
