package demo.test;
import java.util.Scanner;


public class FunctionCalculator {

	public static void Calc(float a, float b)
	{
		float sum = a + b;
		System.out.print("The sum is :" + sum);
	}
	
	public static void main(String[] args)
	{
		System.out.print("Enter 1st values :");
		Scanner sc = new Scanner(System.in);
		float a = sc.nextInt();
		System.out.print("Enter 2nd values :");
		float b = sc.nextInt();
		
		Calc(a,b);

	}
}