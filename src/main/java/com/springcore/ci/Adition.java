package com.springcore.ci;

public class Adition {
	private int a;
	private int b;
	
	public Adition(int a, int b) {
		this.a=a;
		this.b=b;
		System.out.println("contructor: int, int");
	}
	
	public Adition(double a, double b) {
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("contructor: double, double");
	}
	
	public Adition(String a, String b) {
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		System.out.println("contructor: String, String");
	}
	
	public void doSum() {
		
		System.out.println("Sum is="+ (this.a+this.b));
	}
}
