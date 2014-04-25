package com.iraitzcompains.fizzbuzz;

import java.util.ArrayList;

import com.iraitzcompains.validadores.Buzz;
import com.iraitzcompains.validadores.Fizz;
import com.iraitzcompains.validadores.Mozz;
import com.iraitzcompains.validadores.ValidadorAbstract;

public class FizzBuzz {
	
	ArrayList<ValidadorAbstract> validadores; 
	
	
	public FizzBuzz(){
		validadores = new ArrayList<ValidadorAbstract>();
		validadores.add( new Fizz());
		validadores.add( new Buzz());
		validadores.add( new Mozz());
	}
	
	public String calcular(int num) {
		/*
		String s = "";
		for(int i=1;i<=num;i++) {
			if(i != 1)
				s += " ";
			if(i % 15 == 0)
				s += "FizzBuzz";
			else if(i % 3 == 0)
				s += "Fizz";
			else if(i % 5 == 0)
				s += "Buzz";
			else
				s += i;
		}
		return s;
		*/
		
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
		 		ValidadorAbstract val;
		 		for(int i=0; i<validadores.size();i++){
		 			val=validadores.get(i);
		 			if(val.validate(num)){
			 			pal+=val.getOutput();
			 		}
		 		}
			
		 		if(pal.length()==0){
		 				pal=String.valueOf(num);
		 		}
		 		return pal;
		 	}
}
