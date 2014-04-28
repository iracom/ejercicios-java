package com.iraitzcompains.empresa;

import com.iraitzcompains.interfaces.IEmpresa;

public class Ejecutivo extends Empleado {

	private int presupuesto;
	
	public Ejecutivo(IEmpresa e, String nombre, int sueldo) {
		super(e, nombre, sueldo);
		
	}

	public Ejecutivo(IEmpresa e, String nombre, int sueldo, int numeroEmpleado) {
		super(e, nombre, sueldo, numeroEmpleado);
	}
	
	public int getPresupuesto() {
		return this.presupuesto;
	}
	
	public void asignaPresupuesto(int presupuesto){
		this.presupuesto = presupuesto;
	}
	
	@Override
	public String toString(){
		return "Ejecutivo: " + String.valueOf(this.numeroEmpleado) + " " + this.nombre + " " + String.valueOf(this.sueldo);
	}

}
