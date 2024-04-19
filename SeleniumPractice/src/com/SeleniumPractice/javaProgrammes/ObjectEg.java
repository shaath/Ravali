package com.SeleniumPractice.javaProgrammes;

public class ObjectEg {

	public static void main(String[] args) {
		
		Object[] x = {"Selenium", 454356, 45345.5454, 'M', true};
		
		System.out.println(x.length);
		
		for(Object data: x){
			System.out.println(data);
		}

	}

}
