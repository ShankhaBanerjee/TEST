package demo.test;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args)
{
	float a, b, sum, sub, mul, div, mod;
	System.out.println("Enter Numbers: ");
	Scanner sc = new Scanner(System.in);
	a = sc.nextFloat();
	b = sc.nextFloat();
	
	System.out.println("Enter Button: 1.ADD , 2.SUB, 3.MUL, 4.DIV ");
	int button = sc.nextInt();
	
	switch(button)
	{
		case 1 : System.out.println("ADDITION");
		sum = a + b;
		System.out.println("The result is : " + sum);
		break;
		
		case 2 : System.out.println("SUBSTRACTION");
		sub = a - b;
		System.out.println("The result is : " + sub);
		break;
		
		case 3 : System.out.println("MULTIPLICATION");
		mul = a * b;
		System.out.println("The result is : " + mul);
		break;
		
		case 4 : System.out.println("DIVISION");
		if(a>b)
			{ 
			div = a / b;
			}
		else
		{
			div = b / a;
		}
		System.out.println("The result is : " + div);
		break;
		
		default : System.out.println("WRONG INPUT");
		}
	
	}
		

}
