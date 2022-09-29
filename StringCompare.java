package demo.test;

public class StringCompare {
	  
		 public static void main(String args[])
		 {  
		   String s1="Sachin"; 
		   
		   String s2="Sachin";  
		   
		   String s3=new String("Sachin"); 
		   
		   String s4="Saurav";  
		   
		   String s5="SACHIN";
		   
		   String s6="Ratan"; 
		   
		   
		   //Equals to
		   System.out.println(s1.equals(s2));  
		   System.out.println(s1.equals(s3)); 
		   System.out.println(s1.equals(s4));
		   
		   // == Operator
		   System.out.println("-------------------------------------------");
		   System.out.println(s1==s2);
		   System.out.println(s1==s3); 
		   System.out.println("-------------------------------------------");
		   System.out.println(s1.equalsIgnoreCase(s5));
		   
		   //compareTo() method
		   		/*Suppose s1 and s2 are two String objects. If:
			   	s1 == s2 : The method returns 0.
			   	s1 > s2 : The method returns a positive value.
			   	s1 < s2 : The method returns a negative value.*/
		   System.out.println("-------------------------------------------");
		   System.out.println(s1.compareTo(s2));//0  
		   System.out.println(s1.compareTo(s6));//1(because s1>s6)  
		   System.out.println(s6.compareTo(s1));//-1(because s6< s1 )  
		 }  
		}  


