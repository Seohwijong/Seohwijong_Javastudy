package com.sist.main;
/*
 *    객체 => 114page
 *    클래스 => 115page
 *    인스턴스 => 117page
 *    클래스 구성요소 => 122page
 *    객체 생성 => 123page
 *    -----------------------
 *    패키지 => 132page
 *    메소드 => 140~155page
 *    멤버변수의 초기화 =>168page
 *    생성자 오버로딩 =>171page
 *    생성자 => this (173page) this => 클래스 자신의 객체명 (static)
 *    
 *    class A
 *    {
 *    }
 *    
 *    A a=new A();
 *    =>JVM => 메모리를 생성
 *      this=a;
 *    
 *    
 */
public class 정리_3 {
	정리_3()
	{
		System.out.println("this="+this);
	}
	public static void main(String[] args) {
		정리_3 a=new 정리_3();
		System.out.println("a="+a);
	}
}
