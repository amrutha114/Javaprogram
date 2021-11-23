package conditionalProgramming;

import java.util.Scanner;

public class GreatestOfTwoNumbers {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter a,b values");
int a=scan.nextInt();
int b=scan.nextInt();

int result=a>b ? a: b;
System.out.println("Greatest number is : "+result);
	}

}
