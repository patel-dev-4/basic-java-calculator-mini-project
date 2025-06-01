package com.calculator;
import java.util.Scanner;
public class BasicCalculator {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String again;
	do{
		
		
		System.out.println("what do you want to do?");
		System.out.println("1.ADDITION");
		System.out.println("2.SUBSTRACTION");
		System.out.println("3.MULTIPLICATION");
		System.out.println("4.DIVISION");
		

		int Choice = sc.nextInt();
		int a,b;
		
		switch (Choice) {
		
		case 1:
			System.out.println("You choose Addition.");
			System.out.println("Add first number :");
			a = sc.nextInt();
			System.out.println("ADD second number :");
			b = sc.nextInt();
			System.out.println("Result : "+(a+b));
			break;
		
		case 2:
			System.out.println("You choose Substraction.");
			System.out.println("Enter first number :");
			a = sc.nextInt();
			System.out.println("Enter second number :");
			b = sc.nextInt();
			System.out.println("Result : "+(a-b));
			break;
			
		case 3:
			System.out.println("You choose Multiplication.");
			System.out.println("Enter first number :");
			a=sc.nextInt();
			System.out.println("Enter second number :");
			b=sc.nextInt();
			System.out.println("Result : "+ (a*b));
			break;
			
		case 4:
			System.out.println("You choose Division.");
			System.out.println("Enter first number :");
			a= sc.nextInt();
			System.out.println("Enter second number :");
			b= sc.nextInt();
			System.out.println("Result :"+(a/b));
			break;
			
		default:
			System.out.println("Please choose appropriate number ");
			
		}
		
		System.out.println("Do you want to perform another operation"+ ("(yes/no)"));
		sc.nextLine();
		again =sc.nextLine();
	    }while(again.equalsIgnoreCase("yes"));
		
		
		System.out.println("THANKYOU FOR USING CALCULATOR(^^).");
		sc.close();
	}
}

