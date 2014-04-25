package com.iraitzcompains.validadores;

public class Mozz extends ValidadorAbstract{
	
	private static int numero=7;
	
	public boolean validate(int num){
		return num%numero==0;
	}
	
}