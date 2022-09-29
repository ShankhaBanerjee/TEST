package demo.test;

import java.util.Scanner;

public class RemoveSpecialChar 
{
	
	public static void main(String args[])   
	{  
		//String str= "This#string%contains^special*characters&.";   
		String str;
		System.out.println("Enter String : ");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();

		str = str.toLowerCase(); 
		str = str.replaceAll("[^a-zA-Z0-9]", "");  
		System.out.println(str);  
	}  
}  