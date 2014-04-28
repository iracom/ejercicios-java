package com.iraitzcompains.empresa;

import java.util.ArrayList;

import com.iraitzcompains.excepciones.TamanyoDeListaExcedido;
import com.iraitzcompains.interfaces.IEmpleado;
import com.iraitzcompains.interfaces.IEmpresa;

public class Empresa implements IEmpresa {

	private String nombre;
	private int tam;
	private ArrayList<IEmpleado> empleados;
	private int contador;

	public Empresa(String nombre, int tam) {
		this.nombre = nombre;
		this.tam = tam;
		this.empleados = new ArrayList<IEmpleado>(tam);
		this.contador = 0;
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
	public IEmpleado getEmpleado(int id) {
		for (IEmpleado e : this.empleados) {
			if (e.getNumEmpleado() == id) {
				return e;
			}
		}

		return null;
	}

	@Override
	public void despideEmpleado(int id) {
		IEmpleado e = this.getEmpleado(id);

		if (this.empleados.contains(e)) {
			this.empleados.remove(e);
			e.despedir();
			contador--;
		}
	}

	public int getContador() {
		return this.contador;
	}

	@Override
	public void nuevoEmpleado(String nombre, int sueldo) throws TamanyoDeListaExcedido {
		if (contador < this.tam) {
			contador++;
			Empleado empleado = new Empleado(this, nombre, sueldo);
			this.empleados.add(empleado);
		} else {
			TamanyoDeListaExcedido e = new TamanyoDeListaExcedido("Se ha excedido el nœmero de trabajadores");
			throw e;
		}
	}
	
	public void ascender(IEmpleado e){
		this.despideEmpleado(e.getNumEmpleado());
		this.empleados.add(e);
		contador++;
	}

}
