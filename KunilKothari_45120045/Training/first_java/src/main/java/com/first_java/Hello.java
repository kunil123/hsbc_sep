package com.first_java;

public class Hello {
	int i; static int j;
	
	public static void main(String[] args) {
		char k=97;
		Hello h = new Hello();
		Hello h2= new Hello();
		System.out.println("Hello");
		System.out.println(h.i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(h==h2);
		System.out.println(h.equals(h2));
		
	}

}
