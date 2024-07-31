package com.microproject.calculator;

import java.util.Scanner;

public class AdditionImpl implements Addition{
//	AdditionImpl it is class and implements of Addition
	@Override
	public void additionOfNum() {// This is additionOfNum this method through  get to the input from user Scanner class help for that
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in); 
		   int firstNum=scanner.nextInt();  // nextInt method for get to the int value 
		   System.out.println("Enter the second number");
		    int secondNum=scanner.nextInt();
	              int sumall;	      // This is local variable is use for stored to the sum
		      sumall=firstNum+secondNum;  // FirstNum and SecondNum is addition and stored into the Sumall
		      System.out.println("Addition of number is::"+sumall); // Result will be printed
		    
	}

}
