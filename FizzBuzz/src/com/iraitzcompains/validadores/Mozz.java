package com.iraitzcompains.validadores;

import com.iraitzcompains.excepciones.NumeroNoValidoExcepcion;

public class Mozz extends ValidadorAbstract{
	
	private static int numero=7;
	
	public boolean validate(int num) throws NumeroNoValidoExcepcion{
		this.validException(num);
		
		return num%numero==0;
	}
	
}