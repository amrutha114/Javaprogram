package conditionalProgramming;

import java.util.Scanner;

public class CharacterIDentification {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch=scan.next().charAt(0);
        
        if(ch>='A' && ch<='Z')
        	System.out.println("Uppercase alphabet");
        else if(ch>='a' && ch<='z')
        	System.out.println("Lowercase alphabet");
        else if(ch>='0' && ch<='9')
        	System.out.println("Numbers");
        else
        	System.out.println("Special symbols.");
	}

}
