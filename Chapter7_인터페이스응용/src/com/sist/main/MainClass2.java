package com.sist.main;
class A
{
	public A()
	{
		System.out.println("A() Call...");
	}
	public A(int a)
	{
		System.out.println("A(int a) Call...");
	}
}
class B extends A
{
	public B()
	{
		System.out.println("B() Call...");
	}
}
public class MainClass2 {
	
	public static void main(String[] args) {
		B b=new B();
		
	}
}
