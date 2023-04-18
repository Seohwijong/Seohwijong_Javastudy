package com.sist.main2;
class Common
{
	int a=10;
	int b=20;
}
class Child extends Common
{
	//a,b
}
class Child2
{
	Common c=new Common(); // a,b
}
public class MainClass2 {

	public static void main(String[] args) {
		Child c1=new Child();
		System.out.println(c1.a);
		System.out.println(c1.b);
		Child2 c2=new Child2();
		System.out.println(c2.c.a);
		System.out.println(c2.c.b);
	}
}
