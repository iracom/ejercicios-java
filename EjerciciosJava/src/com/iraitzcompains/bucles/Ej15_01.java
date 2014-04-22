package com.iraitzcompains.bucles;

import java.util.Scanner;

public class Ej15_01 {

	public static void main(String[] args) {
		short num, max, intentos, prueba;
		max = 5;
		
		System.out.println("Adivine el nœmero entre 0 y 100. Intentos: " + max);
		
		num = (short) (100*Math.random()+1);
		
		for(short i = 0; i < max; i++){
			Scanner entrada = new Scanner(System.in);
			prueba = entrada.nextByte();
			intentos = (short) (max - (i + 1));
			if(prueba < num)
			{
				System.out.println("Es m‡s grande. Le quedan " + intentos + " intentos.");
			} else if (prueba > num)
			{
				System.out.println("Es m‡s peque–o. Le quedan " + intentos + " intentos.");
			} else
			{
				System.out.println("Acert— el nœmero!!!");
				intentos = max;
			}
		}

	}

}
