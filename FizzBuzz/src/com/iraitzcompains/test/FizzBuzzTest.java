package com.iraitzcompains.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.iraitzcompains.fizzbuzz.FizzBuzz;
import com.iraitzcompains.interfaces.InterfazValidador;
import com.iraitzcompains.validadores.Buzz;
import com.iraitzcompains.validadores.Fizz;
import com.iraitzcompains.validadores.Mozz;

public class FizzBuzzTest {

	FizzBuzz fb;
	Fizz fizz;
	Buzz buzz;
	ArrayList<InterfazValidador> validadores;

	@Before
	public void setUp() throws Exception {
		fb = new FizzBuzz();

		validadores = new ArrayList<InterfazValidador>();
		validadores.add(new Fizz());
		validadores.add(new Buzz());
		validadores.add(new Mozz());

	}

	@Test
	public void testFizz() {
		// Fizz.eresFizz(num) dameTexto()
		assertFalse(validadores.get(0).validate(1));
		assertTrue(validadores.get(0).validate(3));
		assertEquals("Fizz 3", "Fizz", validadores.get(0).getOutput());
	}

	public void testBuzz() {
		// Fizz.eresFizz(num) dameTexto()
		assertFalse(validadores.get(1).validate(1));
		assertTrue(validadores.get(1).validate(5));
		assertEquals("Buzz 5", "Buzz", validadores.get(1).getOutput());
	}

	public void testMozz() {
		// Fizz.eresFizz(num) dameTexto()
		assertFalse(validadores.get(2).validate(1));
		assertTrue(validadores.get(2).validate(7));
		assertEquals("Mozz 7", "Mozz", validadores.get(2).getOutput());
	}

	@Test
	public void testObtener() {
		assertEquals("1", "1", fb.obtenerTexto(1));
		assertEquals("2", "2", fb.obtenerTexto(2));
		assertEquals("4", "4", fb.obtenerTexto(4));
		assertEquals("3", "Fizz", fb.obtenerTexto(3));
		assertEquals("5", "Buzz", fb.obtenerTexto(5));
		assertEquals("15", "FizzBuzz", fb.obtenerTexto(15));

	}

	@Test
	public void test() {
		assertEquals("FizzBuzz 1","1",fb.calcular(1));
		assertEquals("FizzBuzz 2","1 2",fb.calcular(2));
		assertEquals("FizzBuzz 3","1 2 Fizz",fb.calcular(3));
		assertEquals("FizzBuzz 4","1 2 Fizz 4",fb.calcular(4));
		assertEquals("FizzBuzz 5","1 2 Fizz 4 Buzz",fb.calcular(5));
		assertEquals("FizzBuzz 6","1 2 Fizz 4 Buzz Fizz",fb.calcular(6));
		assertEquals("FizzBuzz 6","1 2 Fizz 4 Buzz Fizz Mozz",fb.calcular(7));
		assertEquals("FizzBuzz 14","1 2 Fizz 4 Buzz Fizz Mozz 8 Fizz Buzz 11 Fizz 13 Mozz",fb.calcular(14));
		assertEquals("FizzBuzz 15","1 2 Fizz 4 Buzz Fizz Mozz 8 Fizz Buzz 11 Fizz 13 Mozz FizzBuzz",fb.calcular(15));
		assertEquals("FizzBuzz 22","1 2 Fizz 4 Buzz Fizz Mozz 8 Fizz Buzz 11 Fizz 13 Mozz FizzBuzz 16 17 Fizz 19 Buzz FizzMozz 22",fb.calcular(22));
		assertEquals("FizzBuzz 50","1 2 Fizz 4 Buzz Fizz Mozz 8 Fizz Buzz 11 Fizz 13 Mozz FizzBuzz 16 17 Fizz 19 Buzz FizzMozz 22 23 Fizz Buzz 26 Fizz Mozz 29 FizzBuzz 31 32 Fizz 34 BuzzMozz Fizz 37 38 Fizz Buzz 41 FizzMozz 43 44 FizzBuzz 46 47 Fizz Mozz Buzz",fb.calcular(50));
	
		
		
		/*
		 assertEquals("FizzBuzz 14","1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14",fb.calcular(14));
		assertEquals("FizzBuzz 15","1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz",fb.calcular(15));
		assertEquals("FizzBuzz 22","1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz Fizz 22",fb.calcular(22));
		assertEquals("FizzBuzz 50","1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz Fizz 22 23 Fizz Buzz 26 Fizz 28 29 FizzBuzz 31 32 Fizz 34 Buzz Fizz 37 38 Fizz Buzz 41 Fizz 43 44 FizzBuzz 46 47 Fizz 49 Buzz",fb.calcular(50)); 
		 */
		 
	}
}
