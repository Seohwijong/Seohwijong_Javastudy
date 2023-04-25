package com.sist.lib;
//      equals => Object에서는 객체 비교 String에서는 문자열 비교
class Student2
{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Student2(String name)
	{
		this.name = name;
	}
	// if(s1.equals(s2))
	// ((Student2)obj) ==> 형변환
	// Object => String name
	// . 형변환보다 우선순위다
	// (10+2)*5 20
	// 재정의를 하지 않는 경우는 == 동일하다
	// Object => equals는 사용빈도가 많지 않다 => 오버라이딩을 사용해야 한다
	// => String ... equals가
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student2)
		{
			Student2 s=(Student2)obj;
			// ((Student2)obj).name;
			return name==s.name; //문자열비교
		}
		else
			return false;
	}
	public void print()
	{
		System.out.println("이름:"+name);
	}
	/*
	 *  String s="Hello";
	 *  s.length();
	 *  "Hello".length();
	 */
}
// == (객체 => 주소) , equals (객체 가지고 있는 변수값 비교)
public class 라이브러리_Object_3 {

	public static void main(String[] args) {
		Student2 s1=new Student2("홍길동");
		Student2 s2=new Student2("홍길동");
		
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		/*
		 * s1=com.sist.lib.Student2@1e7c7811
		 * s2=com.sist.lib.Student2@77ec78b9
		 */
		// 
		// 
		if(s1==s2)
		{
			System.out.println("s1과 s2는 같다");
		}
		else
		{
			System.out.println("s1과 s2는 다르다");
		}
		
		if(s1.equals(s2))
		{
			System.out.println("s1과 s2는 같다");
		}
		else
		{
			System.out.println("s1과 s2는 다르다");
		}
		s1.print();
		new Student2("박문수").print();
		
		"Hello".length();
	}
}
