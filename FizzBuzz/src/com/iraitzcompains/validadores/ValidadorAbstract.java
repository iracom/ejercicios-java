package com.iraitzcompains.validadores;

import com.iraitzcompains.interfaces.InterfazValidador;

public abstract class ValidadorAbstract implements InterfazValidador{

	public String output;
	
	public abstract boolean validate(int num);
	
	public  String getOutput(){
		return output;
	}
	
	public void setOutput(String output){
		this.output = output;
	}
}
