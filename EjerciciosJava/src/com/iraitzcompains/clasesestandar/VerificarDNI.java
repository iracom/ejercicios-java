package com.iraitzcompains.clasesestandar;

public class VerificarDNI {

	private String dni;
	private char letra;
	private int numeros;
	private boolean numerosCorrectos = true;
	private char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'};

	public VerificarDNI(String dni) {
		super();
		
		if(dni.length() == 9){
			this.dni = dni;
			obtenerLetra();
			obtenerNumeros();
		}
	}
	
	private void obtenerLetra(){
		char letra = this.dni.charAt(this.dni.length()-1);
		if(Character.isLetter(letra))
			this.letra = Character.toUpperCase(letra); 
	}
	
	private void obtenerNumeros(){
		int ind = 0;
		while (this.numerosCorrectos && ind<this.dni.length()-1){
			char digito = this.dni.charAt(ind);
			if(!Character.isDigit(digito))
				this.numerosCorrectos = false;
			ind++;
		}
		if(this.numerosCorrectos){
			numeros = Integer.parseInt(this.dni.substring(0,this.dni.length()-1));
		}
	}
	
	public boolean comprobarDNI()
	{
		boolean esCorrecto = false;
		if(this.numerosCorrectos){
			int var = numeros % 23;
			if(this.letra == letras[var]){
				esCorrecto = true;
			}
		}
		return esCorrecto;
	}
	
	
}
