package com.nt.test;

import com.nt.arith.ArithmaticOperations;

public class VariousOperations {

	public static void main(String[] args) {
		
		System.out.println("This main method1");
		System.out.println("method2");
		ArithmaticOperations aop=new ArithmaticOperations();
		int result1=aop.add(20, 10);
		System.out.println("addition is :"+result1);
	}

}
