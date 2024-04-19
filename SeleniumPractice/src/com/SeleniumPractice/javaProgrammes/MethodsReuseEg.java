package com.SeleniumPractice.javaProgrammes;

public class MethodsReuseEg {

	public static void main(String[] args) {
		
//		MethodsEg.Function1();
		MethodsEg me = new MethodsEg();
		
		int res = me.sum(50, 150);
		System.out.println(res);
		
//		me.Function1();
		
		res = me.sum(20, 30, 50);
		System.out.println(res);

	}

}
