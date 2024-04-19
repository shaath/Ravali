package com.SeleniumPractice.javaProgrammes;

public class StaticArrayEg {

	public static void main(String[] args) {
		
		String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun"};
		
		int len = month.length;
		System.out.println(len);
		
//		System.out.println(month[2]);
		
//		for(int i = 0; i < len; i++){
//			System.out.println(month[i]);
//			}
		
		for(String data: month){
			System.out.println(data);
		}

	}

}
