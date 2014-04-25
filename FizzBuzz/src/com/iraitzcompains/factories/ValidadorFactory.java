package com.iraitzcompains.factories;

import com.iraitzcompains.validadores.Buzz;
import com.iraitzcompains.validadores.Fizz;
import com.iraitzcompains.validadores.Mozz;

public abstract class ValidadorFactory {

	public static final Fizz getFizzValidator(){
		Fizz f = new Fizz();
		f.setOutput("Fizz");
		
		return f;
	}
	
	public static final Buzz getBuzzValidator(){
		Buzz b = new Buzz();
		b.setOutput("Buzz");
		
		return b;
	}
	
	public static final Mozz getMozzValidator(){
		Mozz m = new Mozz();
		m.setOutput("Mozz");
		
		return m;
	}
}
