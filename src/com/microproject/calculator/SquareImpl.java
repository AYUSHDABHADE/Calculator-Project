package com.microproject.calculator;

import java.util.Scanner;

public class SquareImpl  implements Square{//SquareImp is implements to the square interface

	@Override
	public void squareOfNum() {// this method perform to the number of square
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);// scanner class is use to the take the input
		   int firstNum=scanner.nextInt();
		  
	              int squarenum;	      
	              squarenum=firstNum*firstNum;// firstNum*firstNum multiplied by the number and stored into the  squarenum
		      System.out.println("Square of number is::"+squarenum);// and print it 
		
	}

}
