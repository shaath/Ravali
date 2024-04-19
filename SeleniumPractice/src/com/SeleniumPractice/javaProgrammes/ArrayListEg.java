package com.SeleniumPractice.javaProgrammes;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<>();
		
		al.add("Selenium");
		al.add("Boll");
		al.add(true);
		al.add(6346);
		al.add('M');
		al.add("Boll");
		al.add(6, "Vinay");
		al.add(2, "Siva");
		
//		al.remove(3);
//		al.clear();
//		al.clone();
//		System.out.println(al.contains("Boll"));
//		System.out.println(al.indexOf("Boll"));
//		System.out.println(al.lastIndexOf("Boll"));
//		System.out.println(al.size());
		al.set(3, false);
		System.out.println(al.get(2));
//		
		for(Object data: al)
		{
			System.out.println(data);
		}

	}

}
