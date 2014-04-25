package com.iraitzcompains.validadores;

public class Fizz extends ValidadorAbstract{
	
	private static int numero=3;

	public boolean validate(int num){
		return num%numero==0;
	}

}
