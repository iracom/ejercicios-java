package com.iraitzcompains.validadores;

import com.iraitzcompains.interfaces.InterfazValidador;

public  class Buzz implements InterfazValidador{
	
	private static String output="Buzz";
	private static int numero=5;

	public boolean validate(int num){
		return num%numero==0;
	}
	
	public String getOutput(){
		return output;
	}
}
