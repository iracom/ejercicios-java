package com.iraitzcompains.funciones;

import java.util.Vector;

public class Primos {

	private int numero;
	
	public Primos (int num)
	{
		numero = num;
	}
	
	public Vector<Integer> numerosPrimos(){
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
	
	private boolean esPrimo(int num)
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
