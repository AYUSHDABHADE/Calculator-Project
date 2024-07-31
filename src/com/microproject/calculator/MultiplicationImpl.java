package com.microproject.calculator;

import java.util.Scanner;

public class MultiplicationImpl implements Multiplication{
//	MultiplicationImpl is class is implements by Multiplication
	@Override
	public void multiplicationOfNum() {// multiplicationOfNum() this method perform multiplication operation
		System.out.println("Enter the number");// 
		Scanner scanner = new Scanner(System.in);// scanner class is use to take the input from user
		   int firstNum=scanner.nextInt();
		   System.out.println("Enter the second number");
		    int secondNum=scanner.nextInt();
	              int multi;	  // local variable is declare    
		      multi=firstNum*secondNum;// firstNum*secondNum is multiplied and stored into the multi
		      System.out.println("Multiplication of number is::"+multi);// and print the local variable multi
		
	}

	

}
