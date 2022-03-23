package com.simplilearn.demoproject;
import java.util.Scanner;

public class SimpleCalculator {
	
	  public static void main(String[] args) {

	    char op;
	    Double number1, number2, result;

	    // create an object of Scanner class
	    Scanner sc = new Scanner(System.in);

	    // ask users to enter operator
	    do
	    {
	    System.out.println("Choose an Arithmetic operation: enter '+' for addition , '-' for substraction , '*' for multiplication ,'/' for division and 'e' to exit ");
	    op = sc.next().charAt(0);

	    // ask users to enter numbers
	    System.out.println("Enter first number");
	    number1 = sc.nextDouble();

	    System.out.println("Enter second number");
	    number2 = sc.nextDouble();

	    switch (op) {

	      // performs addition between numbers
	      case '+':
	        result = number1 + number2;
	        System.out.println(number1 + " + " + number2 + " = " + result);
	        break;

	      // performs subtraction between numbers
	      case '-':
	        result = number1 - number2;
	        System.out.println(number1 + " - " + number2 + " = " + result);
	        break;

	      // performs multiplication between numbers
	      case '*':
	        result = number1 * number2;
	        System.out.println(number1 + " * " + number2 + " = " + result);
	        break;

	      // performs division between numbers
	      case '/':
	        result = number1 / number2;
	        System.out.println(number1 + " / " + number2 + " = " + result);
	        break;
	      case 'e':
				 System.exit(0);
				 break;
	      default:
	        System.out.println("Invalid operation!");
	        break;
	    }
	   
	  }while(op!='e');

}
}
