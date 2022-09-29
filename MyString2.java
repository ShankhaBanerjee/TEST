package demo.test;

public class MyString2 {

		public static void main(String args[])
		{  
		
			String name="Hitachi Energy";  
			name = name.concat(" India");
		
			char ch=name.charAt(4);  
			String word = "";
		
			System.out.println(ch);  
			System.out.println("Is Empty :" + word.isEmpty());  
			System.out.println(name); 
			System.out.println(name.contains("India"));
			System.out.println(name.endsWith("a")); 
			
			String s1="hitachienergy";  
			String s2="hitachienergy";  
			String s3="HITACHIENERGY";  
			String s4="java";  
			System.out.println(s1.equalsIgnoreCase(s2));
			System.out.println(s1.equalsIgnoreCase(s3)); 
			System.out.println(s1.equalsIgnoreCase(s4));
		}
	}
	


