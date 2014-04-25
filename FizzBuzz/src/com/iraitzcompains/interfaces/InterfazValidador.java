package com.iraitzcompains.interfaces;

import com.iraitzcompains.excepciones.NumeroNoValidoExcepcion;

public interface InterfazValidador {
	
	public boolean validate(int num) throws NumeroNoValidoExcepcion;
	
	public  String getOutput();

}
