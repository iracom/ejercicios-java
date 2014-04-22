package com.iraitzcompains.arrays;

import java.util.Scanner;

public class Ej16_01 {

	public static void main(String[] args) {
		int numeros[] = new int[5];
		int max, min;
		
		for (int i = 0; i < numeros.length; i++)
		{
			System.out.println("Introduzca un nœmero entero:");
			Scanner entrada = new Scanner(System.in);
			numeros[i] = entrada.nextInt();
		}
		
		max = numeros[0]; //Integer.MIN_VALUE
		min = numeros[0]; //Integer.MAX_VALUE
		for(int j = 1; j < numeros.length; j++)
		{
			if(numeros[j] > max)
			{
				max = numeros[j];
			}
			if(numeros[j] < min)
			{
				min = numeros[j];
			}
		}
		System.out.println ("El nœmero m‡ximo es: " + max + " y el nœmero m’nimo es: " + min);
	}

}
