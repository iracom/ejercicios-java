package com.iraitzcompains.validadores;

import com.iraitzcompains.excepciones.NumeroNoValidoExcepcion;
import com.iraitzcompains.interfaces.InterfazValidador;

public abstract class ValidadorAbstract implements InterfazValidador{

	public String output;
	
	public abstract boolean validate(int num) throws NumeroNoValidoExcepcion;
	
	//Lo ponemos protected, para que lo puedan llamar las clases que heredan de aqu’.
	//Pero para el resto de las clases es privada y no pueden acceder.
	protected void validException(int num) throws NumeroNoValidoExcepcion{
		if(num < 1 ){
			throw new NumeroNoValidoExcepcion("Nœmero no v‡lido: es menor que 1.");
		}
	}
	
	public  String getOutput(){
		return output;
	}
	
	public void setOutput(String output){
		this.output = output;
	}
}
