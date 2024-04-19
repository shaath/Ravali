package com.SeleniumPractice.javaProgrammes;

public class InheritaceEg extends MethodsEg  {

	public static void main(String[] args) {
		Function1();
		
		MethodsEg me = new MethodsEg();
//		me.Function3();
		me.Function1();

	}

	public static void Function1(){
		System.out.println("This is InheritanceEg class Function1 code");
	}
}
