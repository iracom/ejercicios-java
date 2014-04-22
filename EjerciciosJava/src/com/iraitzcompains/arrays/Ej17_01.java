package com.iraitzcompains.arrays;

import java.util.Scanner;

public class Ej17_01 {

	public static void main(String[] args) {
		int numeros[] = new int[5];
		boolean esCapicua = true;
		int j = 0;
		int ultimoInd, mitad;
		
		for (int i = 0; i < numeros.length; i++)
		{
			System.out.println("Introduzca un nœmero entero:");
			Scanner entrada = new Scanner(System.in);
			numeros[i] = entrada.nextInt();
		}
		
		if(numeros.length % 2 == 0)
		{
			mitad = numeros.length / 2;
		}
		else
		{
			mitad = (numeros.length / 2) + 1;
		}
		
		ultimoInd = numeros.length - 1;
		
		while (esCapicua && j < mitad)
		{
			if(numeros[j] != numeros[ultimoInd-j])
			{
				esCapicua = false;
			}
			j++;
		}
		
		if(esCapicua)
		{
			System.out.println("Es capicœa");
		} else
		{
			System.out.println("No es capicœa");
		}
	}

}
