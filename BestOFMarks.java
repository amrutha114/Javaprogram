package conditionalProgramming;

import java.util.Scanner;

public class BestOFMarks {

	public static void main(String[] args) {
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter main exam marks:");
		int mainmarks=scan.nextInt();
		System.out.println("Did you attempted improvement exam? (yes)");
		String answer=scan.next();
		
		if(answer.equals("yes"))
		{
			System.out.println("Enter improvement exam marks:");
			int impmarks=scan.nextInt();
			
			if(impmarks>mainmarks)
				System.out.println("Final Marks: "+impmarks);
			else
				System.out.println("Final Marks: "+mainmarks);

		}
		else
			System.out.println("Final Marks: "+mainmarks);

	}

}

/*
 *  main exam: 97
 *  improvement ? : no
 *  final marks 97
 *  
 *  main exam 67
 *  improvement? : yes
 *  improvement marks: 60
 *  final marks:67
 *  
 *  main exam 60
 *  improvement? : yes
 *  improvement marks: 100
 *  final marks:100
 */
