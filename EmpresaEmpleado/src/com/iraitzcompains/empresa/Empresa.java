package com.iraitzcompains.empresa;

import com.iraitzcompains.interfaces.IEmpleado;
import com.iraitzcompains.interfaces.IEmpresa;

public class Empresa implements IEmpresa {
	
	private String nombre;
	private int tam;
	private IEmpleado empleados[];
	private int contador;
	
	public Empresa(String nombre, int tam){
		this.nombre = nombre;
		this.tam = tam;
		this.empleados = new IEmpleado[tam];
		contador = 0;
	}

	@Override
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public int getTamanyo() {
		return this.tam;
	}

	@Override
	public IEmpleado getEmpleado(int num) throws ArrayIndexOutOfBoundsException{
		return this.empleados[num];
	}

	@Override
	public void despideEmpleado(int num) throws ArrayIndexOutOfBoundsException{
		this.empleados[num] = null;
	}
	
	public int getContador(){
		return this.contador;
	}

}
