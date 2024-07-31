package com.microproject.calculator;

import java.util.Scanner;

public class AverageImpl implements Average{

	@Override
	public void averageOfNum() { //This is averageOfNum this method through  get to the input from user Scanner class help for that
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in); 
		int sumall=0;
		int avg;
		for(int i=1;i<=3;i++) {// for loop is use to take multiple input form user
			  int number=scanner.nextInt();//nextInt method for get to the int value 
			   sumall=number+sumall;  // first number sum all stored into the sumall 
		}
		   avg=sumall/3;// all sum value divided by 3 then we will get average
		   System.out.println("Sum of all number::"+sumall); // print sum of number
		  System.out.println("Average of number is::"+avg); // avg of number
		   
		
	}

}

