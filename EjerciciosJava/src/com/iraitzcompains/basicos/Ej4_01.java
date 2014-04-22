package com.iraitzcompains.basicos;

import java.util.Scanner;

public class Ej4_01 {

	public static void main(String[] args) {
		int radio;
		double volumen, superficie;
		
		System.out.println("Introduzca el radio: ");
		Scanner entrada = new Scanner(System.in);
		radio = entrada.nextInt();
		
		volumen = (4/3)*Math.PI*Math.pow(radio, 3);
		superficie = 4*Math.PI*Math.pow(radio, 2);
		
		System.out.println("Volumen: " + volumen);
		System.out.println("Superficie: " + superficie);
	}

}
