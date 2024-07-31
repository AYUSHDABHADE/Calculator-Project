package com.microproject.calculator;

import java.util.Scanner;

public class FactorsImpl implements Factors {// FactorsImpl is class implements factors

	@Override
	public void factoresOfNum() {//factoresOfNum perform to the value
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);// scanner class is use to take the input from user 
		int number = scanner.nextInt();

		for (int i = 1; i <= number; i++) { // for loop is use to find out given number fact
			if (number % i == 0) {// number % i we will get 0 reminder thats is factorial number
				System.out.println("Number of factors is::"+i); // Then print it
			}
		}

	}

}
