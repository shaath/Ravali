package com.SeleniumPractice.javaProgrammes;

import java.util.HashSet;

public class HashSetEg {

	public static void main(String[] args) {
		
		HashSet<Object> hs = new HashSet<>();
		
		hs.add("Selenium");
		hs.add(true);
		hs.add("apple");
		hs.add("Boll");
		hs.add(3436364);
		hs.add("Selenium");
		
		
		System.out.println(hs.size());

		for(Object data: hs){
			System.out.println(data);
		}
	}

}
