package com.sist.main;
/*
 *     자바 클래스의 구성 => **객체지향 특성 (접근지정어 , 캡슐화 , 재사용 , 수정 , 추가)
 *     -------------               pubilc / protected / default / private
 *                                 1) 변수 2) 메소드 3) 생성자
 *                                 1) 캡슐화 : 데이터 보호 => 모든 변수는 private
 *                                 2) 재사용 : 변경해서 사용 , 있는 그대로
 *                                               상속 (is-a) 포함(has-a)
 *                                 3) 수정 : 오버라이딩 , 추가 : 오버로딩
 *     class ClassName             
 *     {                          
 *        ------------------------------
 *         변수
 *          1) 멤버변수 (인스턴스변수 => new 메모리에 저장할때 따로 저장되는 변수)
 *             형식) [접근지정어] 데이터형 변수명 = 값 (디폴트값)
 *                  int a;=> 0
 *                  int a=10; // 명시적인 초기화
 *                  
 *                  => int a;
 *                     a=10; => 구현   ==> 변수의 초기화 (생성자)
 *                  => 생성시점 : new를 이용해서 메모리 공간이 확보 
 *                  => 소멸시점 : 객체=null이거나 사용하지 않는 경우
 *                             ------------- 가비지 컬렉션 (메모리 회수)
 *                  => 가장 많이 사용되는 변수 (여러개를 저장)
 *                  => 사용하는 방법
 *                     class A
 *                     {
 *                         int age; //0
 *                         String name; // null
 *                     }
 *                     A a=new A(); => age,name
 *                         ---
 *                     A b=new A(); => age,name
 *                         ---
 *                       => b.age
 *                       => b.name
 *                  ==================> class는 한개만 설계 ==> 저장을 new를 이용해서 여러개
 *                  
 *                  -a-
 *                  100   => 100--------------
 *                  ---          ----------age
 *                                   25
 *                               ---------name
 *                                  홍길동
 *                               -------------
 *                              --------------
 *                  -b-
 *                  100   => 100--------------
 *                  ---          ----------age
 *                                   20
 *                               ---------name
 *                                  심청이
 *                               -------------
 *                              --------------   
 *                  b=a; => 저장된 데이터관리 위치가 변경이 될 수 있다(데이터 손실)
 *                  =======> 메모리 주소의 복구가 어렵다
 *                  A c=200
 *                  -a-
 *                  100   => 100--------------
 *                  ---          ----------age
 *                                   25
 *                               ---------name
 *                                  홍길동
 *                               -------------
 *                              --------------
 *                  -b-
 *                  100(x) => 200--------------GC 메모리 회수대상
 *                  ---          ----------age
 *                                   20
 *                               ---------name
 *                                  심청이
 *                               -------------
 *                              --------------         
 *          2) 정적변수(클래스변수 , 공유변수) => 한개의 공간만 생성
 *             => 공유변수 : 오라클
 *             형식) [접근지정어] static 데이터형 변수명 = 값(디폴트값)
 *                  int => 0
 *                  double => 0.0
 *                  boolean => false
 *                  String , 배열 , 클래스 => null (주소가 저장이 안된 상태)
 *                  => 생성시점 : 컴파일러에 의해 자동으로 메모리 저장
 *                  
 *        ------------------------------
 *         생성자 :
 *           1) 객체가 생성될때 호출 메소드
 *                A a=new A()
 *                        --- 생성자
 *           2) 특징
 *              = 클래스명과 동일
 *              = 리턴타입이 없다 (리턴값이 있으면 일반 메소드)
 *              = 생성자가 없는 경우에 추가(매개변수가 없는 생성자가 추가)
 *              					----------------
 *              						기본 생성자
 *              = 멤버변수의 초기화
 *              = 생성자는 여러개 사용이 가능 (한개의 클래스)
 *              = 데이터베이스 연결 , 네트워크 연결 , 윈도우...
 *              = 자동추가
 *                -----
 *                import java.lang.* (자동추가)
 *                       ----------- String , Math , System... java.lang에 들어가 있음
 *              class A  extends Object
 *                       --------------
 *              생성자 : 기본생성자()
 *              return : void
 *              
 *              class A
 *              {
 *                  A(){}	***
 *                  void A(){} :일반 메소드
 *                  A(int a){}	***
 *                  A(int a, int b){}	***
 *              }
 *           3) 역할
 *              = 시작과 동시에 처리
 *              예) 자동 로그인
 *                 오라클 연결
 *                 서버 연결...
 *              = 멤버변수 초기화
 *                class A
 *                {
 *                    int a;
 *                    A()
 *                    {
 *                       //파일읽기 , 크롤링...
 *                       = 구현해서 초기화
 *                    }
 *                }
 *                class  A
 *                {
 *                    int a=10;
 *                }
 *                = 필요할때마다 사용한다 (생략할 수 있다)
 *                                  ---- 컴파일러에 의해 자동추가
 *                
 *        ------------------------------
 *         메소드 :
 *           1) 역할 => 다른 클래스와 통신(연결)
 *           2) 수정 , 추가 (오버라이딩 , 오버로딩)
 *           3) 반복제거
 *           4) 구조적인 프로그램 (단락을 나눠서 처리) => 오류 , 수정
 *           5) 메소드는 호출시마다 처음부터 끝까지
 *           6) 구성요소
 *              결과값(리턴타입)
 *                => 리턴 타입으로 사용
 *                   기본형
 *                   int, double , char , boolean , long
 *                   배열 : 같은 데이터형 여러개...
 *                   int[] , double[]...
 *                   클래스 : 다른 데이터형 여러개...
 *                   String , 사용자 정의
 *                   => 클래스 => 배열로 사용이 가능(데이터형)
 *                   => 기본형 (자바에서 지원 => 지원하지 않는 것이 많다)
 *                      프로그래머가 만들어서 처리 => 클래스
 *                   => 클래스의 첫번째 기능 => 사용자 정의 데이터형
 *                      ----- 형변환 , 대입...(기본형과 동일하게 사용이 가능)
 *              메소드명 : 식별자 => 변수 , 클래스 , 인터페이스 , 메소드
 *                      => 변수 , 메소드는 소문자
 *                      => 클래스 , 인터페이스 대문잘
 *                      => 문자길이는 상관없다 (3~10) => 의미부여된 7자정도로 압축 권장
 *                      class A class B class C
 *                      class Notice class Board class Reply
 *                      class Ab~z
 *              매개변수(사용자 요청)
 *              *** 사용자의 요청값을 받아서 요청 처리 결과를 도출
 *              *** 최소화 시킨다 (3개이상 => 배열 , 클래스)
 *              예)
 *                 정수 10개를 보내주고 정렬후 달라
 *                 (int a,int b...)
 *                 (int[] arr)
 *                 회원가입
 *                 (String id, String pwd , String name ,
 *                 String sex, int age, String post, String addr1,
 *                 String addr2, String tel, String email)
 *                 (Member m) 
 *              메소드 유형
 *                => 리턴타입 (x , 한개만 존재) => 여러개(배열, 클래스)
 *                => 매개변수 (x , 한개 이상)
 *              ----------------------
 *               리턴타입			매개변수
 *              ----------------------
 *                 o              o			=> 가장 많이 사용
 *              ----------------------
 *                 o              x
 *              ----------------------
 *                 x              o
 *              ----------------------
 *                 x              x
 *              ----------------------
 *        ------------------------------
 *           메소드 형식
 *           [접근지정어][옵션] 리턴타입 메소드명(매개변수...)	선언부
 *                         ----- 결과값   --------- 요청
 *           {
 *           		옵션 : static , abstract , final
 *            		구현부
 *            		연산/제어
 *            		return 값; => void일 경우에는 생략이 가능
 *           }
 *     }
 */
public class 생성자_1 {

	public static void main(String[] args) {
		생성자_1 a=new 생성자_1();
		System.out.println(a.toString());
		
	}
}
