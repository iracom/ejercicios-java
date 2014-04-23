package com.iraitzcompains.funciones;

import java.util.Scanner;
import java.util.Vector;

public class Ej22_05 {

	public static void main(String[] args) {
		
		System.out.println("Introduzca un nœmero");
		Scanner entrada = new Scanner(System.in);
		
		//Esto vale si la clase Primos no es abstracta
		Primos primos = new Primos(entrada.nextInt());
		Vector<Integer> vPrimos = primos.numerosPrimos();
		
		//Si la clase Primos es abstracta, no hay que crear una instancia
		//Vector<Integer> vPrimos = Primos.numerosPrimos();
		
		System.out.println(vPrimos.toString());
		
	}

}
