package demo.test;
import java.util.Iterator;
import java.util.Scanner;

public class DuplicateString
{	
	public static void main(String args[]) 
	{
		  String Original;
		  System.out.println("Enter the String: ");
		  Scanner sc = new Scanner(System.in);
		  Original = sc.nextLine().toLowerCase().trim();
		  //Original.toLowerCase().trim();
		  
		  int count[] = new int[1000];
		  for (int i = 0; i < Original.length(); i++) //for string traverse
			  {
			  count[Original.charAt(i)]++; //frequency store in arr
			  }
		  for(int i = 0; i<1000; i++) //for checking string freq
		  {
			  if(count[i] > 1)
			  {
				  System.out.println((char)(i) + " is repeated for :  "+ count[i]);
			  }
		  }
	}
}

//===============================================================================
/*public class DuplicateString
{	
	public static void main(String args[]) 
	{
		  String Original;
		  System.out.println("Enter the String: ");
		  Scanner sc = new Scanner(System.in);
		  Original = sc.nextLine();
		  
		  	  
		  int cnt = 0;
		  //int num = 0; //number of occurance
		  char[] inp = Original.toCharArray();
		  
		  System.out.println("Duplicate Characters:");
		  for (int i = 0; i < Original.length(); i++) 
		  {
		   for (int j = i + 1; j < Original.length(); j++) 
		   {
		    if (inp[i] == inp[j])
		    {
		    cnt++;
		    System.out.println(inp[j]);
		     
		     break;
		     
		    }
		   }
		  }
		 }
		}*/


