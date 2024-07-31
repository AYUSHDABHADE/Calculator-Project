package com.microproject.calculator;

import java.util.Scanner;

public class SubstractionImpl implements Substraction{// SubstractionImpl class implements Subtraction interface

	@Override
	public void substractionOfNum() {// This method perform to the subtraction of number
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);// scanner class is use to take the input from user
		   int firstNum=scanner.nextInt();
		   System.out.println("Enter the second number");
		    int secondNum=scanner.nextInt();
	              int substractall;	      
	              substractall=firstNum-secondNum;// firstNum-secondNum and result stored into the  substractall local variable
		      System.out.println("Substarction of number is::"+substractall);// print the  substractall variable
	}

}
