package com.microproject.calculator;

public class Testall {
public static void main(String[] args) {// This is the main method for entry to jvm 
	ConsuleMessage consuleMessage = new ConsuleMessage();// Create the object of the consuleMessage class
	 consuleMessage.conslemessage();// object through call to the method consuleMessage class
	 consuleMessage.testCases();// testCases() method call from consuleMessage class
	 
	 ChooseOperation chooseOperation = new ChooseOperation();// Creating the object of ChooseOperation class
	 chooseOperation.switchChoose();// object through call to the method switchChoose()
	 
}
}
