package demo.test;
import java.util.Scanner;

// PROGRAM TO REVERSE ANY STRING

public class StringReverse
{
	public static void main(String args[])
	{
		//Using simple logic
		String original; //for user input
		String rev = ""; // for storing reverse string
	
		System.out.println("Enter String to reverse : ");
		Scanner sc = new Scanner(System.in);
		
		original = sc.nextLine();
		
		int len = original.length(); 
		
		for(int i = len -1; i >=0; i--)
			rev = rev + original.charAt(i);
			
		System.out.println("Origianl String : " + original);
		System.out.println("After Reversing : " + rev);
		
	}
	
}