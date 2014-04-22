package com.iraitzcompains.bucles;

public class Ej10_01 {

	public static void main(String[] args) {
		double celsius;
		System.out.println("Tabla de conversi—n Fahrenheit >> Celsius");
		
		for (int i = 0;i<=300;i=i+20)
		{
			celsius = (5.0/9.0) * (i-32);
			System.out.println("Fahrenheit: " + i + " >> Celsius: " + celsius);
		}

	}

}
