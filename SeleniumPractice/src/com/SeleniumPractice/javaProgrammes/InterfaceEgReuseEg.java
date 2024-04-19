package com.SeleniumPractice.javaProgrammes;

public class InterfaceEgReuseEg {

	public static void main(String[] args) {
		InterfaceEg ie1 = new InterfaceEgImplements1Eg();
		ie1.Vehicle();
		
		InterfaceEg ie2 = new InterfaceEgImplements2Eg();
		ie2.Vehicle();

	}

}
