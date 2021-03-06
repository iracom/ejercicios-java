package com.iraitzcompains.fizzbuzz;

import java.util.ArrayList;

import com.iraitzcompains.excepciones.NumeroNoValidoExcepcion;
import com.iraitzcompains.interfaces.InterfazValidador;
/*import com.iraitzcompains.validadores.Buzz;
import com.iraitzcompains.validadores.Fizz;
import com.iraitzcompains.validadores.Mozz;*/

public class FizzBuzz {
	
	ArrayList<InterfazValidador> validadores; 
	
	public FizzBuzz(){
		validadores = new ArrayList<InterfazValidador>();
		/*validadores.add( new Fizz());
		validadores.add( new Buzz());
		validadores.add( new Mozz());*/
	}
	
	public String calcular(int num) {
		String s = "";
		
		for(int i=1;i<=num;i++) {
			if(i != 1){
				s += " ";
			}
			s+=obtenerTexto(i);
		}
		
		return s;
	}
	
	public String obtenerTexto(int num){
		String pal="";
		InterfazValidador val;
		
		for(int i=0; i<validadores.size();i++){
			val=validadores.get(i);
		 	try {
				if(val.validate(num)){
					pal+=val.getOutput();
				}
			} catch (NumeroNoValidoExcepcion e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(pal.length()==0){
			pal=String.valueOf(num);
		}
		
		return pal;
	}
	
	public void addValidador(InterfazValidador i){
		validadores.add(i);
	}
}
