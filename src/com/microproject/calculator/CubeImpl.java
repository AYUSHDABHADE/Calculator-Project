package com.microproject.calculator;

import java.util.Scanner;

public class CubeImpl implements Cube{//  CubeImpl class implemented cube 

	@Override
	public void CubeOfNum() {  // this method perform to the cube operation
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);// scanner class through get to the input
		   int firstNum=scanner.nextInt();//  nextInt() to help to get user through int value 
		  
	              int cubenum;	      
	              cubenum=firstNum*firstNum*firstNum;  // number is multiplied by three time we will get cube of number stored into the
	               //cubenum
		      System.out.println("Cube of number is::"+  cubenum);// then result is print
		
	}

}
