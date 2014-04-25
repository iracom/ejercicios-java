package com.iraitzcompains.validadores;

import com.iraitzcompains.excepciones.NumeroNoValidoExcepcion;

public class Buzz extends ValidadorAbstract{
	
	private static int numero=5;

	public boolean validate(int num) throws NumeroNoValidoExcepcion{
		this.validException(num);
		
		return num%numero==0;
	}
	
}
