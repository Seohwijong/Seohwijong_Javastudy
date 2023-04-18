package com.sist.main;
//  상속이 있는 경우 => 객체 생성 방법
//  double d=10; => d=10.0
/*
 *   class A
 *   class B extends A
 *   
 *       A (상위 클래스)
 *       ↑
 *       B (하위 클래스)
 *       
 *       ==> 크기 (범위)    상위 > 하위
 *           -------- 상속 , 포함
 *           A > B
 *           ------ float > long
 *           
 *           
 *       A a=new A();
 *       A b=new B();
 *       B c=new B();
 *       B d=new A(); 	 ==> X
 *       B e=(B)new A(); ==> X
 *       **** 형변환
 *       (int)10.5
 *       
 *       상속
 *       1. 형식
 *          class A extennds B => 단일 상속
 *       2. 클래스 크기
 *          상속을 내리는 클래스 > 상속을 받는 클래스
 *       3. 형변환
 *          작은 클래스 = 큰 클래스
 *       4. 자바의 최상위 클래스 => Object
 *       5. 상속의 예외 : static => 공유 , 초기화블록 , 생성자 , private(상속은 가능하지만 접근이 안된다)
 *       -----------
 *   
 */
class Human
{
	int a=10;
	int b=20;
	static int c=30;
	public void display()
	{
		System.out.println("Human:display() Call...");
	}
}
class Student extends Human
{
	int d=40;
	int e=50;
//	int a=10;
//	int b=20; 안보여도 상속받아 a,b가 들어있다
//	static int c=30; static이라 공통으로 사용가능하다
	// 오버라이딩
	/*
	 *  1. 상속 => 재정의
	 *  2. 메소드명 동일
	 *  3. 매개변수 동일
	 *  4. 리턴형 동일
	 *  5. 접근지정어는 확장이 가능 / 축소하면 오류남
	 */
	public void display()
	{
		System.out.println("Student:display() Call...");
	} 
}
public class MainClass2 {

	public static void main(String[] args) {
		/*
		 *  클래스명 변수명=new 생성자()
		 *  -----		   ------
		 *     Human h2=new Student();
		 *  1) 변수 제어 ==> 클래스타입 따라감 Human
		 *  2) 메소드 제어 ==> 생성자 따라감 Student
		 */
		Human h=new Human();//a,b,c
		h.display();
		Student s=new Student();//a,b,c,d,e
		s.display();
		Human h2=new Student();
		h2.display();
//		Student s2=new Human(); (x)
//		Student s2=(Student)new Human();  (X) 실행시 오류
		Student s2=(Student)h2; // 형변환은 생성자가 동일해야 한다
//		Student s3=(Student)h; h의 생성자가 Human이기때문에 불가 (ClassCastException => 형변환 오류)
		
		// 사용 범위 ==> 상위 클래스는 하위 클래스의 추가된 내용에 접근이 불가능하다
		// 변수 접근 ==> 선언된 클래스에 등록 변수까지만 접근이 가능
		
	}
}
