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
		System.out.println("5.MODULUS");
		System.out.println("6.POWER");
		System.out.println("7.SQUARE ROOT");
		System.out.println("8.LOG (BASE e)");
		System.out.println("9.LOG (BASE 10)");
		System.out.println("10.SINE");
		System.out.println("11.COSINE");
		System.out.println("12.TANGENT");
		System.out.println("13.ABSOLUTE VALUE");
		
		
		int Choice=0;
		if (sc.hasNextInt())
		{
			Choice = sc.nextInt();
		}
		else
		{
			System.out.println("Invalid input !! :  Please enter number!!");
		}
		

		
		double a,b;
		
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
			if (b==0)
					{
				System.out.println("Division BY ZERO ERROR!!!");
					}
			else {
			System.out.println("Result :"+(a/b));
			}
			break;
		case 5:
			System.out.println("You choose Modulus.");
			System.out.println("Enter first number :");
			a=sc.nextInt();
			System.out.println("Enter second number :");
			b=sc.nextInt();
			System.out.println("Result : "+ (a%b));
			break;
			
		case 6:
			System.out.println("You choose Power.");
			System.out.println("Enter Base :");
			a=sc.nextInt();
			System.out.println("Enter Exponent :");
			b=sc.nextInt();
			System.out.println("Result : "+ (Math.pow(a, b)));
			break;
			
		case 7:
			System.out.println("You choose Squareroot.");
			System.out.println("Enter Number :");
			a=sc.nextInt();
			if (a<0)
			{
				System.out.println(" LESS THAN ZERO ERROR!!!");
			}
			else
			{
			System.out.println("Result : "+ (Math.sqrt(a)));
			}
			break;
			
		case 8:
			System.out.println("You choose Logarithm base e.");
			System.out.println("Enter Number :");
			a=sc.nextInt();
			if (a<=0)
			{
				System.out.println("ERROR!!! : logarithm undefined for zero and negative.");
			}
			else
			{
			System.out.println("Result : "+ (Math.log(a)));
			}
			break;
			
		case 9:
			System.out.println("You choose Logarithm base 10.");
			System.out.println("Enter Number :");
			a=sc.nextInt();
			if (a<=0)
			{
				System.out.println("ERROR!!! : logarithm undefined for zero and negative.");
			}
			else
			{
			System.out.println("Result : "+ (Math.log10(a)));
			}
			break;
			
			
		case 10:
			System.out.println("You choose Sine.");
			System.out.println("Enter ANGLE in degrees :");
			a=sc.nextInt();
			System.out.println("Result : "+ (Math.sin(Math.toRadians(a))));
			break;
			
		case 11:
			System.out.println("You choose Cosine.");
			System.out.println("Enter ANGLE in degrees :");
			a=sc.nextInt();
			System.out.println("Result : "+ (Math.cos(Math.toRadians(a))));
			break;
			
		case 12:
			System.out.println("You choose Tangent.");
			System.out.println("Enter ANGLE in degrees :");
			a=sc.nextInt();
			System.out.println("Result : "+ (Math.tan(Math.toRadians(a))));
			break;
			
		case 13:
			System.out.println("You choose Absolute value.");
			System.out.println("Enter Vaue :");
			a=sc.nextInt();
			System.out.println("Result : "+ (Math.abs(a)));
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

