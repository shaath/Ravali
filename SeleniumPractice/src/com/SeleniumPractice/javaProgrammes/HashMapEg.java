package com.SeleniumPractice.javaProgrammes;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapEg {

	public static void main(String[] args) {
		
		HashMap<String, String> m = new HashMap<>();
		
		m.put("Name", "Siva");
		m.put("Desg", "Manager");
		m.put("Gender", "Male");
	
//		System.out.println(m);
		
//		System.out.println(m.get("Desg"));
		
//		for(String Key: m.keySet())
//		{
//			System.out.println(Key + " = " + m.get(Key));
//		}
		
//		for(String Value: m.values())
//		{
//			System.out.println(Value);
//		}

		for(Entry<String, String> x: m.entrySet())
		{
			System.out.println(x.getKey()+"======"+x.getValue());
		}
	}

}
