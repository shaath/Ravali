package com.SeleniumPractice.javaProgrammes;

public class DynamicArrayEg {

	public static void main(String[] args) {
		
		Object[] x = new Object[5];

		System.out.println(x.length);
		
		x[1] = "Selenium";
		x[3] = 5463436;
		x[1] = "UFT";
		x[2] = "Boll";
		
		for(Object data: x){
			System.out.println(data);
		}
	}

}
