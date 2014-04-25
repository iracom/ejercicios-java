package com.iraitzcompains.interfaces;

public interface IEmpresa {
	
	public String getNombre();
	public int getTamanyo();
	public IEmpleado getEmpleado(int num) throws ArrayIndexOutOfBoundsException;
	public void despideEmpleado(int num) throws ArrayIndexOutOfBoundsException;
	public int getContador();

}
