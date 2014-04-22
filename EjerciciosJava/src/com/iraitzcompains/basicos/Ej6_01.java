package com.iraitzcompains.basicos;

import java.util.Scanner;

public class Ej6_01 {

	public static void main(String[] args) {
		double peso, altura, imc;
		
		System.out.println("Introduzca su peso en Kilos: ");
		Scanner entrada = new Scanner(System.in);
		peso = entrada.nextDouble();
		System.out.println(peso + " Kgs");
		
		System.out.println("Introduzca su altura en metros: ");
		entrada = new Scanner(System.in);
		altura = entrada.nextDouble();
		System.out.println(peso + " m");
		
		imc = peso / (altura * 2);
		System.out.println("IMC: " + imc);
		
		if(imc < 16){
			System.out.println("Criterio de ingreso en hospital");
		} else if (16 <= imc && 17 >imc)
		{
			System.out.println("Infrapeso");
		} else if (17 <= imc && 18 >imc)
		{
			System.out.println("Bajo peso");
		} else if (18 <= imc && 25 >imc)
		{
			System.out.println("Peso normal (saludable)");
		} else if (25 <= imc && 30 >imc)
		{
			System.out.println("Sobrepeso");
		} else if (30 <= imc && 35 >imc)
		{
			System.out.println("Sobrepeso cr—nico");
		} else if (35 <= imc && 40 >imc)
		{
			System.out.println("Obesidad prem—rbida");
		} else
		{
			System.out.println("Obesidad m—rbida");
		}
	}

}
