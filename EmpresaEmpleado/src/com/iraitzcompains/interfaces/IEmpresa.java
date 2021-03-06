package com.iraitzcompains.interfaces;

import com.iraitzcompains.excepciones.TamanyoDeListaExcedido;

public interface IEmpresa {
	
	public String getNombre();
	public int getTamanyo();
	public IEmpleado getEmpleado(int num) throws ArrayIndexOutOfBoundsException;
	public void despideEmpleado(int num) throws ArrayIndexOutOfBoundsException;
	public int getContador();
	public IEmpleado nuevoEmpleado(String nombre, int sueldo) throws TamanyoDeListaExcedido;
	public void ascender(IEmpleado e);

}
