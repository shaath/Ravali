package com.SeleniumPractice.javaProgrammes;

public class MethodsEg {

	public static void main(String[] args) {
		
		Function1();
//		
//		String res = Function2();
//		System.out.println(res);
		
//		MethodsEg me = new MethodsEg();
//		me.Function3();
//		
//		boolean flag = me.Function4();
//		System.out.println(flag);
		
//		int result = me.sum(200, 300);
//		System.out.println(result);
		
	}
	
	//Static method without returning value
	public static void Function1()
	{
		System.out.println("This is Function1 code");
	}
	
	//Static method with returning value
	public static String Function2(){
		System.out.println("This is Function2 code");
		
		return "Pass";
	}
	
	//Non static method withput returning any value
	public void Function3(){
		System.out.println("This is Function3 code");
		Function1();
		Function4();
	}
	
	//Non static method with returning value
	public boolean Function4(){
		System.out.println("This is Function4 code");
		return true;
	}

	public int sum(int a, int b)
	{
		int c = a + b;
		
		return c;
	}
	
	public int sum(int a, int b, int c)
	{
		int d = a + b + c;
		return d;
	}
}
