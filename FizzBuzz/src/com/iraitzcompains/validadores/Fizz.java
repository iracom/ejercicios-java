package com.iraitzcompains.validadores;

import com.iraitzcompains.interfaces.InterfazValidador;

public  class Fizz implements InterfazValidador{
	
	private static String output="Fizz";
	private static int numero=3;
	
	public  boolean validate(int num){
		return num%numero==0;
	}
	
	public  String getOutput(){
		return output;
	}

}
