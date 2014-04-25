package com.iraitzcompains.validadores;

public  class Buzz extends ValidadorAbstract{
	
	private static int numero=5;
	
	public Buzz() {
		super("Buzz");
	}

	public boolean validate(int num){
		return num%numero==0;
	}
	
	public String getOutput(){
		return output;
	}
}
