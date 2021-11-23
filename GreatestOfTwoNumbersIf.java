package conditionalProgramming;

import java.util.Scanner;

public class GreatestOfTwoNumbersIf {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a,b values");
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(a>b){
		System.out.println("A is greater");	
		System.out.println("Welcome");
		}
		else
		{
			System.out.println("B is greater");
		}
		
		
		
	
		
	}
	/*
	      if(condition);
	      {
	      
	      logic
	      }
	      
	      if condition is true control go inside if body{} and execute instruction otherwise if body is skip
	      
	      if is a keyword follow with round brace inside condition and do not follow with semicolon, follow with body
	       
	 */

}
