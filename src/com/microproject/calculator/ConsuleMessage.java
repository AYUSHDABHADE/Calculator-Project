package com.microproject.calculator;

import java.util.Scanner;

public class ConsuleMessage {
  public void conslemessage() {   // This method print welcome message and Operation
	  System.out.println(" Welcome to consule based application");
	  System.out.println("1. Addition of two number");
	  System.out.println("2. Substarction of two number");
	  System.out.println("3. Multiplication of two number");
	  System.out.println("4. Division of two number");
	  System.out.println("5. Modulas of two number");
	  System.out.println("6. Square of number");
	  System.out.println("7. Cube of number");
	  System.out.println("8. Average of number");
	  System.out.println("9. Factors of number");
	  System.out.println("10. Find even or odd");
	  
  }
  public void testCases() {
	  // This method contain Scanner class and switch cases
	    int number;
	    System.out.println("Enter the case number");
	    Scanner scanner = new Scanner(System.in);// scanner class is use to take the input from user
	         number=scanner.nextInt();
	         // switch operation is use to choose case from multiple condition and cases
	         switch(number) {   // user through get the input switch case  
	         // It consists of 1 t0 10 cases Addition to even odd number
	         case 1:
	        	 AdditionImpl  additionImpl = new AdditionImpl();// create  the object of class and call 
	        	  additionImpl.additionOfNum();// object through call to the method
	        	  break;
	        	  // same process on another case operation 
	         case 2:
	        	 SubstractionImpl substractionImpl = new SubstractionImpl();
	        	   substractionImpl.substractionOfNum();
	        	   break;
	         case 3:
	        	 MultiplicationImpl multiplicationImpl = new MultiplicationImpl();
	        	      multiplicationImpl.multiplicationOfNum();
	        	      break;
	         case 4:
	        	 DivisionImpl divisionImpl = new DivisionImpl();
	        	 divisionImpl.divisionOfNum();
	        	 break;
	         case 5:
	        	 ModulasImpl modulasImpl = new ModulasImpl();
	        	   modulasImpl.modulasNum();
	        	   break;
	         case 6:
	        	 SquareImpl squareImpl = new SquareImpl();
	        	  squareImpl.squareOfNum();
	        	  break;
	         case 7:
	        	 CubeImpl cubeImpl = new CubeImpl();
	        	 cubeImpl.CubeOfNum();
	        	 break;
	         case 8:
	        	 AverageImpl averageImpl = new AverageImpl();
	        	 averageImpl.averageOfNum();
	        	 break;
	         case 9:
	        	 FactorsImpl factorsImpl = new FactorsImpl();
	        	 factorsImpl.factoresOfNum();
	        	 break;
	         case 10:
	        	 Even_OddImpl  even_OddImpl = new Even_OddImpl();
	        	 even_OddImpl.EvenOdd();
	        	 break;
	         }
	         
	         
  
}
}
