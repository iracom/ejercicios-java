package com.iraitzcompains.validadores;

public  class Mozz extends ValidadorAbstract{
	
	private static int numero=7;
	
	public Mozz() {
		super("Mozz");
	}
	
	public  boolean validate(int num){
		return num%numero==0;
	}
	
	public  String getOutput(){
		return output;
	}
}