package com.iraitzcompains.empresa;

import com.iraitzcompains.interfaces.IEmpleado;
import com.iraitzcompains.interfaces.IEmpresa;

public class Empleado implements IEmpleado {

	private IEmpresa empresa;
	protected String nombre;
	protected int sueldo;
	protected int numeroEmpleado;
	
	public Empleado(IEmpresa e, String nombre, int sueldo){
		this.empresa = e;
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.numeroEmpleado += empresa.getContador();
	}
	
	protected Empleado(IEmpresa e, String nombre, int sueldo, int numeroEmpleado){
		this.empresa = e;
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.numeroEmpleado = numeroEmpleado;
	}
	
	@Override
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public int getSueldo() {
		return this.sueldo;
	}

	@Override
	public int getNumEmpleado() {
		return this.numeroEmpleado;
	}

	@Override
	public void setNombre(String string) {
		this.nombre = string;
	}

	@Override
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toSrting() {
		return String.valueOf(this.numeroEmpleado) + " " + this.nombre + " " + String.valueOf(this.sueldo);
	}

	@Override
	public void despedir() {
		this.empresa = null;
	}
	
	public final void aumentarSueldo (int cantidad){
		this.sueldo = this.sueldo * cantidad;
	}
	
	public void ascender() {
		Ejecutivo ejecutivo = new Ejecutivo(this.empresa, this.nombre, this.sueldo, this.numeroEmpleado);
		this.empresa.ascender(ejecutivo);
	}
}
