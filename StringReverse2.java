package demo.test;
import java.util.Scanner;

public class StringReverse2 
{
	static String reverse(String inputString)
	{
        String[] strarray = inputString.split(" ");  // Spilt String by Space
        StringBuilder sb = new StringBuilder(); //using string builder
        for(String s:strarray)
        {
            if(!s.equals(""))
            {
               StringBuilder strB = new StringBuilder(s);
               String rev = strB.reverse().toString();
               sb.append(rev+" "); 
            }    
        }
        return  sb.toString();
        
    }
    
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enput String : ");
        String str = sc.nextLine();
        System.out.println("Input String : "+str);
        System.out.println("String with Reverese Word : "+ reverse(str));
    }
    
}


