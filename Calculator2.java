package conditionalProgramming;

import java.util.Scanner;

public class Calculator2 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a,b values");
	int a=scan.nextInt();
	int b=scan.nextInt();
	System.out.println("Select Operator:\nADD +\nSUB -\nMul *");
	char operator=scan.next().charAt(0);
	
	switch(operator)
	{
	default:System.out.println("Invalid operator");
    break;
	case '+':		System.out.println("Sum= "+(a+b));
	break;

	case '-':       System.out.println("Sub= "+(a-b));
	break;

	case '*':		System.out.println("Mul= "+(a*b));
   break;
	}
}
}
