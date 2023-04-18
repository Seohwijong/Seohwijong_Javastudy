package com.sist.main2;
// => 데이터를 은닉화 (private) / 메소드를 통해서 접근이 가능(다른 클래스 연결 => public)
// 사용자 정의 데이터형 => 필요에 의해서 데이터를 묶어서 관리할 목적으로 만든다
// 사용자 정의 데이터형 => ~VO(value object)
class SutdaCard //1
{
	private int num;
	private boolean isKwang;
	// getter => 읽기
	// setter => 저장
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public boolean isKwang() {
		return isKwang;
	}
	public void setKwang(boolean isKwang) {
		this.isKwang = isKwang;
	}
	
	
}
class Student //2
{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
}
class PlayingCard //3 
{ 
	int kind; //인스
	int num; //인스
	static int width; //공유 
	static int height; //공유
	PlayingCard(int k, int n) { 
	kind = k; //지역
	num = n; //지역
	}
}
/*
 *   인스턴스 변수 : 데이터를 각각 저장시에 사용
 *   정적변수(공유변수) : 공통으로 사용되는 변수 => 메모리가 1개만 생성
 *   ------------------------------- 프로그램 종료시까지 메모리 유지(자동 초기화)
 *   지역변수 : 메소드에서 선언되느 변수 (지역변수 , 매개변수)
 *           => 메소드안에서만 사용 ({}를 벗어나면 사라진다)
 *           => 반드시 초기화후에 사용
 *           => k,n
 */
/*
 * 다음 중 생성자에 대한 설명으로 옳지 않은 것은? (모두 고르시오) b c 
 * a. 모든 생성자의 이름은 클래스의 이름과 동일해야한다.
 * b. 생성자는 객체를 생성하기 위한 것이다.(X) =>new
 * c. 클래스에는 생성자가 반드시 하나 이상 있어야 한다.(X) 
 * => 없어도 됨(컴파일러가 기본생성자 추가해줌)
 * d. 생성자가 없는 클래스는 컴파일러가 기본 생성자를 추가한다.
 * e. 생성자는 오버로딩 할 수 없다. (X)
 *          ------같은 이름의 메소드를 여러개 만들어서 사용
 *          = 여러개 만들 수 있다
 *    *** 오버로딩의 조건
 *    = 한개의 클래스나 상속 관계의 클래스
 *    = 메소드명 동일
 *    = 매개변수의 갯수나 데이터형이 다르다
 *    = 리턴형은 관계없다
 *    
 *    class A
 *    {
 *       public void display(){}
 *       public int display(int a){}
 *    }
 *    class B extends A
 *    {
 *       public int display(int a,int b){}
 *    }
 */
/*
 * 다음 중 this에 대한 설명으로 맞지 않은 것은? (모두 고르시오)
 * a. 객체 자신을 가리키는 참조변수이다.
 * b. 클래스 내에서라면 어디서든 사용할 수 있다.
 * c. 지역변수와 인스턴스변수를 구별할 때 사용한다.
 * d. 클래스 메서드 내에서는 사용할 수 없다.
 * 
 * this
 * ----
 * 1) 모든 클래스는 this를 가지고 있다
 * 2) 객체 자신을 가리키는 참조변수 (static Object this) => new
 *    => this는 생성자 , 인스턴트 메소드에서 사용이 가능
 *    class A
 *    {
 *        public A(A this)
 *        {
 *        
 *        }
 *        public void display(A this)
 *        {
 *        
 *        }
 *        public static void aaa()
 *        {
 *        
 *        }
 *    }
 * 3) 클래스 내 어디서든 사용 가능(X)
 * 4) 지역변수와 인스턴스 변수를 구분할때 사용한다
 *    class A
 *    {
 *        private String name; => heap
 *        public void display(String name) => stack
 *        {
 *            this.name=name(매개변수)
 *            ---------
 *            A클래스에 설정된 변수
 *        }
 *    }
 *    5) 클래스 메소드(static)내에서는 사용할 수 없다.
 *       인스턴스 메소드 , 객체메소드
 *          객체명.메소드
 *       정적 메소드 , 공유 메소드 , 클래스 메소드
 *          클래스명.메소드
 *    ----------------------------------------
 *    오버로딩 조건
 *    1) 메소드명이 동일 (한개의 이름으로 여러개의 새로운 기능을 추가)
 *    2) 매개변수의 갯수나 데이터형이 달라야 한다
 *    3) 리턴형은 관계없다
 *    4) 매개변수의 이름이 달라야 한다
 */
//5 c, d
//6 c, d
//7 메소드 , 매개변수 , 데이터형
//8 a, d
//9 d e
//10 b
//11 a c d
//12 a
//13 멤 , 메 , 생 , 클
//14 d , e

/*
 * 4bce
 * 5b
 * 6cd
 * 7메소드  매개변수 매개변수명 
 * 8bc
 * 9a
 * 10a
 * 11ae
 * 12a
 * 13 
 * 14c
 */
public class 문제 {

	public static void main(String[] args) {
		
	}
}
