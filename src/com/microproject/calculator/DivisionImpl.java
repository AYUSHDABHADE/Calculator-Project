package com.microproject.calculator;

import java.util.Scanner;

public class DivisionImpl implements  Division{ // DivisionImpl is implemented to the division interface

	@Override
	public void divisionOfNum() { // this method perform to the  division operation 
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);// scanner through get to the two input 
		   int firstNum=scanner.nextInt(); // firstnum
		   System.out.println("Enter the second number");
		    int secondNum=scanner.nextInt();// secondnum
	              int div;	      
		      div=firstNum/secondNum;  // firstnum divided by secondnum and stored into the div
		      System.out.println("Division of number is::"+div); // then we will print it
		
	}

}
