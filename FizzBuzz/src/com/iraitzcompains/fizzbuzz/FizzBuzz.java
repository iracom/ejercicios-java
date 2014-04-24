package com.iraitzcompains.fizzbuzz;

public class FizzBuzz {

	public String calcular(int num) {
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
	}
}
