package com.SeleniumPractice.javaProgrammes;

public class SwitchCaseEg {

	public static void main(String[] args) {
		
		String course = "Selenium";

		switch(course){
		case "Selenium":
			System.out.println("You are selected Selenium");
			break;
		case "UFT":
			System.out.println("You are selected UFT");
			break;
		case "Manual":
			System.out.println("You are selected Manual");
			break;
		default:
			System.out.println("Select a proper course");
			break;
		}
	}

}
