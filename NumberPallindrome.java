package demo.test;

import java.util.Scanner;

public class NumberPallindrome 
{
	public static void main(String args[])
		 {  
		  int rem,sum=0,temp;    
		  		  
		  int n;
		  System.out.println("Enter the Number: ");
		  Scanner sc = new Scanner(System.in);
		  n = sc.nextInt();
		  
		  temp=n;    
		  while(n>0)
		  {    
		   rem=n%10;  
		   sum=(sum*10)+rem;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println(temp + " is a palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
		}

