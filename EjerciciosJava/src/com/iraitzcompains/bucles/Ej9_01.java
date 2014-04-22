package com.iraitzcompains.bucles;

import java.util.Scanner;

public class Ej9_01 {

	public static void main(String[] args) {
		int num, resultado;
		
		System.out.println("Introduzca un nœmero:");
		Scanner entrada = new Scanner(System.in);
		num = entrada.nextInt();
		
		resultado = 1;
		for(int i=num;i>0;i--)
		{
			resultado = resultado * i;
		}

		System.out.println("El factorial es: " + resultado);
	}

}
