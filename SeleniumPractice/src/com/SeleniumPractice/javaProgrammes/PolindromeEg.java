package com.SeleniumPractice.javaProgrammes;

public class PolindromeEg {

	public static void main(String[] args) {
		
		String course = "Malayalam";
		
		String rev = "";

		for(int i = course.length() - 1; i >= 0; i--)
		{
			rev = rev + course.charAt(i);
		}
		System.out.println(rev);
		
		if(course.equalsIgnoreCase(rev)){
			System.out.println("Given String is Polindrome");
		}else{
			System.out.println("Given String is not a polindrome");
		}
	}

}
