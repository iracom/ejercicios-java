package com.iraitzcompains.validadores;

public class Buzz extends ValidadorAbstract{
	
	private static int numero=5;

	public boolean validate(int num){
		return num%numero==0;
	}
	
}
