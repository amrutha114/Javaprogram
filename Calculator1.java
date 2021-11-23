package conditionalProgramming;

import java.util.Scanner;

public class Calculator1 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a,b values");
	int a=scan.nextInt();
	int b=scan.nextInt();
	System.out.println("Select Operator:\nADD +\nSUB -\nMul *");
	char operator=scan.next().charAt(0);
	
	if(operator=='+')
		System.out.println("Sum= "+(a+b));
	else if(operator=='-')
		System.out.println("Sub= "+(a-b));
	else if(operator=='*')
		  System.out.println("Mul= "+(a*b));
	else
		System.out.println("Invalid operator");
}
}
