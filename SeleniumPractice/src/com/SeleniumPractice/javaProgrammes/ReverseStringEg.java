package com.SeleniumPractice.javaProgrammes;

public class ReverseStringEg {

	public static void main(String[] args) {
		String course = "Selenium";    //muineleS     
		
		int len = course.length();
		for(int i = len-1; i >= 0; i--){
			System.out.print(course.charAt(i));
		}

	}

}
