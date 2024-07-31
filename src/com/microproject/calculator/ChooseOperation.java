package com.microproject.calculator;

import java.util.Scanner;

public class ChooseOperation {

	public void switchChoose() { // switchChoose() is method of ChooseOperation

		System.out.println("Enter the choose Yes or No");
		Scanner scanner = new Scanner(System.in);// scanner class is use to take the input from user yes or no operation
		String choose = scanner.next();// choose is depend upon the user
		// if user choose yes
		switch (choose) { // yes operation is perform
		case "yes":
			ChooseOperation chooseOperation = new ChooseOperation();
			chooseOperation.choose();
			break;
		case "no": // if user choose no does not perform any operation
			ChooseOperation chooseOperation1 = new ChooseOperation();
			chooseOperation1.unChoose();
		}

	}

	public void unChoose() {// if user choose no
		System.out.println("Terminate the operation");// then print this statement
	}

	public void choose() { // if user choose perform the other operation

		for (int i = 1; i < 10; i++) { // for loop is use to operation perform 10 it depends user which type operation
										// they want
			ConsuleMessage consuleMessage = new ConsuleMessage();
			// Creating the object of the ConsuleMessage class
			consuleMessage.testCases();// object through call to the method

		}
	}
}
