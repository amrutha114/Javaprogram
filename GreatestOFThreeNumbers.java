package conditionalProgramming;

import java.util.Scanner;

public class GreatestOFThreeNumbers {

	public static void main(String[] args) {
		
		
		
		 
			       
			
Scanner scan=new Scanner(System.in);
System.out.println("Enter a,b,c values");
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
if(a==b && b==c)
	System.out.println("A,B,C values are equal");
else if(a>b && a>c)
	System.out.println("A is greater");
else if(b>c)
	System.out.println("B is greater");
else
	System.out.println("C is greater");

	}

}
// h2 h3