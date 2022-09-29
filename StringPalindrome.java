package demo.test;

import java.util.Scanner;

public class StringPalindrome {

		public static boolean isPalindrome(String str)
		{
			String rev = "";

			boolean ans = false;

			for (int i = str.length() - 1; i >= 0; i--) {
				rev = rev + str.charAt(i);
			}

			// Checking if both the strings are equal
			if (str.equals(rev)) {
				ans = true;
			}
			return ans;
		}
		public static void main(String[] args)
		{
			String str;
			System.out.println("Enter String : ");
			Scanner sc = new Scanner(System.in);
			str = sc.nextLine();

			str = str.toLowerCase(); // Convert the string to lowercase
			boolean A = isPalindrome(str);
			System.out.println(A);
		}
	}

