package com.iraitzcompains.validadores;


import com.iraitzcompains.interfaces.InterfazValidador;

public  class Mozz implements InterfazValidador{
	
	private static String output="Mozz";
	private static int numero=7;
	
	public  boolean validate(int num){
		return num%numero==0;
	}
	
	public  String getOutput(){
		return output;
	}

}