package com.sist.exception;
/*
 *     에러 => 컴파일시 (javac) / 실행시 (java)
 *            -------------   -----------
 *                Check         UnCheck => 생략
 *                  |
 *                자바문법(반드시 예외처리)
 *     에러
 *     ---
 *        = 수정이 불가능한 에러 (심각한 오류) : 메모리 부족 , 윈도우 덤프
 *          Error
 *        = 수정이 가능한 에러 (가벼운 오류) : 소스상에서 수정이 가능
 *          => 파일읽기 (파일명이 틀리다) , 배열의 인덱스를 벗어난 경우
 *          => 웹 연결 (URL이 틀리다)
 *          = Exception (예외처리)
 *     에러가 발생
 *     --------
 *        1. 프로그래머의 실수
 *           => 초기값이 없는 상태에서 비교
 *           => 배열인덱스를 틀린다
 *           => 무한 루프
 *           => 파일명 틀림...
 *        2. 사용자 입력 오류
 *           => 계산기 나누기 => 0
 *           => 정수입력 => 문자열입력...
 *           ----------------------- 웹에서 유효성 검사
 *     예외처리 : 견고한 프로그램을 만들기 위해 사용
 *             ----------- 비정상을 방지하고 정상상태 유지
 *             ----------- 사전에 에러를 방지하는 프로그램
 *     1. 예외처리 방식
 *        = 고려할 점 : if => 예외처리
 *        = 예외처리 : 복잡한 에러 , if문으로 해결 불가능한 것
 *          웹 : 404 , 500(소스오류) , 415(한글변환) , 400(값을 잘못받는 경우) ,403(접속거부)...
 *                                   UTF-8
 *              404 : 파일이 없는 경우
 *     2. 예외처리 종류
 *        = 예외발생시 => 복구
 *          try ~ catch
 *          형식)
 *              try
 *              {
 *              	정상수행하는 문장
 *              	int a=10;
 *              	int b=0;
 *              	double d=a/(double)b; ==> 오류발생 ==> catch로 이동
 *              	System.out.println(d); ==> 수행 못함
 *              }catch(exception e)
 *              {
 *              	예외발생시 처리하는 영역
 *              	
 *              }
 *              ---
 *              ---
 *              ---
 *              사용자로부터 문자열을 받아서 정수 변경후
 *                       ------------------ 
 *              배열에 저장
 *              -------
 *              나누기를 한 후에 출력
 *              ----
 *        = 예외발생시 => 회피
 *          throws
 *        = 예외발생 => 테스트
 *          throw
 *        = 사용자 정의 예외
 *          => 지원하지 않는 예외가 존재
 *          
 *        예외처리의 계층구조
 *                 Object
 *                   |
 *               Throwalbe
 *                   |
 *     ---------------------------------
 *     |						       |
 *     Error                       Exception
 *                                     |
 *                      ---------------------------------
 *                      |								|
 *                  CheckException(존재x)           UnCheckException
 *                      |반드시 예외처리						|
 *                      						   RuntimeException
 *                                                      |
 *                                                 NumberFormatException
 *                                                  문자열 => 정수형으로 변경
 *                                                  윈도우 / 웹 =>
 *                                                  => 주소란
 *                                                  main.jsp?page=1
 *                                                  ------------------
 *                                                    => 오류 " 1"
 *                                                  NullPointerException
 *                                                   => 객체 초기화가 안된 상태
 *                                                   => 참조할 주소가 없는 경우 (선언)
 *                                                  ArrayIndexOfOutBoundsException
 *                                                   => 배열범위 초과시 발생
 *                                                  ArithmeticException
 *                                                   => 0으로 나눈 경우
 *                                                  ClassCastException
 *                                                   => 클래스 형변환이 잘못됐을때
 *                                                  IllegalArgumentException
 *                                                   => 부적적한 인자 전달
 *                                                  IndexOfOutBoundsException
 *                                                   => 문자열 관련
 *                                                   
 *                                                   
 *                                                   
 *                                                   
 *                  IOException(입출력)   => 메모리 입출력 , 파일 입출력 , 네트워크 입출력
 *                      java.io => 클래스가 동일
 *                  SQLException(오라클 연동)
 *                      java.sql => 네트워크 통신
 *                      자바응용프로그램 <==============> 오라클
 *                           (C)				     (S)
 *                           Client					Server
 *                           => 웹에 출력하는 모든 데이터 => 오라클
 *                           => 자바 ============== 오라클
 *                                   자바전송 (X)
 *                                   오라클이 인식하는 언어전송(SQL)
 *                                   SELECT * FROM 테이블명
 *                   브라우저 ==== 자바 ==== 오라클
 *                    HTML                SQL     ==> JSP
 *                  ClassNotFoundException
 *                   => 클래스명이 틀린 경우
 *                   Class.forName("com.sost.eception.예외처리_1");
 *                  ...
 *                  MalformedURLException
 *                  => URL주소가 틀릴경우
 *                  =>Jsoup
 *                  InterruptedException
 *                  => 쓰레드 충돌
 *     263page
 *     -------
 *     예외의미 => 프로그램에서 돌발적으로(의도하지 않은 상황)에서 문제가 발생시
 *                               -------------
 *              처리를 어떻게 할지
 *              -------------
 *              프로그램은 에러시에 비정상으로 종료 => 방지하고
 *              정상적으로 종료가 가능하게 만드는 과정 (예외처리)
 *              
 *        String s="SELECT * FROM "
 *                +"emp";      
 *              
 *     
 */
class AAAAA
{
	public void display()
	{
		System.out.println("A:display Call...");
	}
}
class BBBBB
{
	
}
class CCCCC extends BBBBB
{
	public void disp(int a,int b,int c)
	{
		System.out.println("1");
	}
	public void disp(int a,char b,byte c)
	{
		System.out.println("1");
	}
	public void disp(char a,char b,int c)
	{
		System.out.println("1");
	}
}
public class 예외처리_1 {
	static String s="Hello";
	static AAAAA a;
	public static void main(String[] args) {
		String ss="Hello Java";
		System.out.println(ss.substring(ss.indexOf("K"),ss.lastIndexOf("J")));
		CCCCC cc=new CCCCC();
		cc.disp('A', 10, 'B');
		System.out.printf("%d %c %s\n",10,65,"30");
//		int[] arr=new int[2]; // 0,1
//		arr[2]=10;
//		System.out.println(10/0);
//		a.display();
		if(s.equals("Hello"))
		{
			System.out.println("Ok");
		}
		int a=10;
		int b=0;//사용자로부터 값을 받았을때
		// 처리
		if(b!=0) // 정상수행 ==> try
		{
		int c=a/b;
		System.out.println("c="+c);
		}
		else // 예외처리 ==> catch
		{
			System.out.println("0으로 나눌 수 없다");
		}
		// 1. 정상적으로 종료가 되게 만든다
		// 2. 우선적 => if문으로 처리가 가능한지 여부 => 자바에 제공하는 예외처리를 이용한다
		// 3. if는 주로 사용하는데 ==> 검색용도 , 사용자 입력 제한...
//		int i=System.in.read();
//		String page=" 1";
//		System.out.println(Integer.parseInt(page));

	}

	
}

