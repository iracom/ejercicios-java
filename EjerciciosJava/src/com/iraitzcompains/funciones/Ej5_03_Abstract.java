package com.iraitzcompains.funciones;

import java.util.Vector;

public abstract class Ej5_03_Abstract {

	public static Vector<Integer> numerosPrimos(int numero){
		Vector<Integer> numeros = new Vector<Integer>();
		
		for(int i=0; i<numero; i++)
		{
			if(esPrimo(i))
			{
				numeros.add(i);
			}
		}
		
		return numeros;
	}
	
	private static boolean esPrimo(int num)
	{
		boolean isPrimo = true;
		int i = 2;
		
		while(i<num && isPrimo)
		{
			if(num%i==0)
				isPrimo = false;
			i++;
		}
		
		return isPrimo;
	}
}
