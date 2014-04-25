package com.iraitzcompains.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.iraitzcompains.empresa.Empleado;
import com.iraitzcompains.empresa.Empresa;

public class EmpresaEmpleadoTest {

	Empresa empresa;
	Empleado empleado;

	String nombreEmpresa;

	String nombreEmpleado;
	int sueldo;

	@Before
	public void setUp() throws Exception {
		nombreEmpresa = "Empresa";

		nombreEmpleado = "Empleado";
		sueldo = 18000;

		empresa = new Empresa(nombreEmpresa, 3);

		empleado = new Empleado(empresa, nombreEmpleado, sueldo);
	}

	@Test
	public void testEmpresa() {
		assertEquals("Empresa 1", "Empresa", empresa.getNombre());
		assertEquals("Empresa 2", 3, empresa.getTamanyo());
		assertNull("Empresa 3", empresa.getEmpleado(2));
		try {
			assertNull("Empresa 4", empresa.getEmpleado(4));
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	@Test
	public void testEmpleado() {
		assertEquals("Empleado 1", "Empleado", empleado.getNombre());
		assertEquals("Empleado 2", 18000, empleado.getSueldo());
		assertEquals("Empleado 3", 0, empleado.getNumEmpleado());
		assertEquals("Empleado 4", "0 Empleado 18000", empleado.toSrting());

		empleado.setNombre("MiEmpleado");
		assertEquals("Empleado 11", "MiEmpleado", empleado.getNombre());

		empleado.setSueldo(21000);
		assertEquals("Empleado 12", 21000, empleado.getSueldo());
	}

	@Test
	public void testEmpresaEmpleado() {
		try {
			empresa.nuevoEmpleado("Empleado 1", 20000);
			empresa.nuevoEmpleado("Empleado 2", 22000);
			empresa.nuevoEmpleado("Empleado 3", 19000);
			empresa.nuevoEmpleado("Empleado 2", 21000);
			
			assertEquals("EmpresaEmpleado 1","Empleado 1",empresa.getEmpleado(1).getNombre());
			assertEquals("EmpresaEmpleado 2",22000,empresa.getEmpleado(2).getSueldo());
			assertEquals("EmpresaEmpleado 3","3 Empleado 3 19000",empresa.getEmpleado(3).toSrting());
			
			
		} catch (Exception e) {

		}

	}

}
