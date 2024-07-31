package com.microproject.calculator;

import java.util.Scanner;

public class ModulasImpl implements Modulas{// This is ModulasImpl  implements by Modulas
	@Override
	public void modulasNum() {// This method perform to the modulas operation
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);// scanner class through get to the input
		   int firstNum=scanner.nextInt();// nextInt() method is use to take the input
		   System.out.println("Enter the second number");
		    int secondNum=scanner.nextInt();
	              int modulas;	      
		      modulas=firstNum%secondNum; //firstNum%secondNum remainder will be stored into the modulas local variable
		      System.out.println("Modulas of number is::"+modulas);// then print the result
		
	}

}
