package com.microproject.calculator;

import java.util.Scanner;

public class Even_OddImpl implements Even_and_Odd{
// Even_OddImpl class implements even_Odd value
	@Override
	public void EvenOdd() {// Even odd method is use to the perform find which one number is even or odd
		System.out.println("Enter first number");
		Scanner scanner = new Scanner(System.in);// scanner class through get to the any input value
		   int number=scanner.nextInt();
		      if(number%2==0) { // if conduction is use to check if number % 2 if we will get reminder 0 then it is even number
		    	  // if we get reminder 1 it is odd number
		    	  System.out.println("Number is even");// if conduction is true number is even number is printed 
		      }else {
		    	  System.out.println("Number is odd");// if conduction is not true else statement is print
		      }
		
	}

}
