package demo.test;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		float a, b, sum, sub, mul, div, mod;
		
		System.out.println("Enter Numbers: ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextFloat();
		b = sc.nextFloat();
		
		sum = a + b;
		System.out.println("The sum is : " + sum);
		
		sub = a - b;
		System.out.println("The sub is : " + sub);
		
		mul = a*b;
		System.out.println("The mul is : " + mul);
		
		if(a>b)
			{
			div = a / b;
			}
		else
			{
			div = b / a;
			}
		System.out.println("The div is : " + div);
		
		mod = a % b;
		System.out.println("The mod is : " + mod);		
	}

}
