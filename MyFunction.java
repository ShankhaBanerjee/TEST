package demo.test;

import java.util.Scanner;

// Function to print my name
public class MyFunction 
{
	// Declaring Function
	public static void printName(String name)
	{
		System.out.println(name);
		return;
	}
	
// Declaring Main
public static void main (String args[])
{
	System.out.println("Enter name: ");
	Scanner sc = new Scanner(System.in);
	String name = sc.nextLine();
	printName(name);
}
}
