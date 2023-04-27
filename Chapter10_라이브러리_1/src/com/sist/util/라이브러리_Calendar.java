package com.sist.util;
/*
 *      라이브러리
 *        = 자바에서 지원
 *          java.lang , java.util , java.io , java.net , java.text , java.sql
 *        = 외부업체에서 지원
 *          Jsoup (HTML parse) , 셀레니움
 *          MyBatis , Spring , DBCP...
 *        = java.lang
 *          = Object , String , System , Math , StringBuffer
 *          = import 생략
 *          = Object => 최상위 클래스 , 모든 데이터형을 받을 수 있다
 *            저장 => 일반 기본형 , 사용자정의 클래스 => 기본적으로 설정 Object
 *            형변환
 *            => 주요기능
 *               clone() : 복제 (새로운 메모리 생성) => 디자인패턴 (GOF 23)
 *               finalize() : 소멸자 (메모리 해제시 => 자동호출)
 *               toString() : 객체를 문자열화
 *               equals() : 객체 비교 (기본은 객체의 주소값 비교)
 *        = System : gc()
 *                   System.out , System.in => 표준 입출력
 *        = Math : 수학
 *                 = round() : 반올림
 *                 = ceil() : 올림
 *                 = random() : 난수발생
 *        = StringBuffer : 문자열이 많은 경우 (제어)
 *                 = append() : 문자열 결합 (속도가 빠름)
 *                 = delete() : 문자 제거
 *                 = insert() : 문자열 추가
 *                 ---------------------- String에 존재하지 않는다
 *        = String : 문자열을 쉽게 제어가 가능하게 만든 클래스
 *                   => 웹 , 윈도우 , 빅데이터 (AI)
 *                   => equals() , trim() , substring() , length() , valueOf() , contains() , 
 *                        비교       공백        자름          길이      문자열로 변환   포함인지 확인             
 *                      startsWith() ,    split()    ,   replace()  ,   replaceAll()
 *                      시작문자열 같은경우  기준으로 자르기   문자 / 문자열 변경  
 *      java.util : 사용빈도가 높다
 *      ---------
 *          = StringTokenizer : 문자열 분리 (쉽게 분리)
 *            = counterToken() => 분리된 단어의 갯수
 *            = hasMoreTokens() => 분리된 갯수만큼 반복문 수행
 *            = nextToken() => 실제 분리된 단어 읽기
 *          = Wrapper : 기본형을 클래스화 (기능을 수행)
 *            -------
 *              Integer	=> int
 *              Double	=> double
 *              Boolean => boolean
 *              Long	=> long
 *              ----------------------- parseInt() , parseDouble() , parseBoolean() , parseLong()
 *                      => 웹은 무조건 데이터가 String
 *                              String
 *                      => 요청  =====> 요청처리 (응답)
 *                              String
 *            => 기본형 / Wrapper는 호환
 *               Integer i=10 ====> 실제값 (리터럴) 대입
 *               ------------ 오토박싱(박싱)
 *               int a=new Integer(10) ==> 기본형에서 클래스 객체값을 받는다
 *               --------------------- 언박싱
 *          = Random
 *            => nextInt (int bound)
 *               nextInt(10) => 0~9
 *          = Arrays : 배열을 쉽게 관리할 수 있다
 *            => sort() : 정렬
 *            => toString() : 배열 출력
 *            => asList() : List형 변환
 *          = 날짜 관련
 *            Date : 기능이 없다 => 다른 프로그램과 호환
 *                   오라클 / MySQL에서 전송된 날짜 데이터를 받는 경우에 사용
 *                   날짜 저장용으로 주로 사용
 *            Calendar : 날짜에 대한 기능이 필요시 사용 
 *                       Date를 보완한 클래스
 *                       날짜 설정 
 *                       = set() => 값 설정시 사용 ==>   년도 / 월 / 일 / 시간 / 분 / 초
 *                       = get() => 설정된 값 사용시
 *                       = 요일 읽기 => get(Calendar.DAY_OF_WEEK)
 *                       = 각 달의 마지막 날 => getActualMaximum()
 *          = 배열을 대체
 *              String page="2" ; (page*10)-10
 *              				  (page-1)*10
 *              int page=Integer.parseInt(page);
 *            = 웹에서의 3대 클래스 (모르면 퇴사 추천)
 *              = String , Integer , List
 *            컬렉션 (데이터를 쉽게 관리) => 10개 (자동으로 저장공간이 설정 (한번에 10개씩증가))
 *                    Collection
 *                        |
 *                ------------------
 *                |				   |
 *              List              Set          Map => 인터페이스
 *                |				   | 			|
 *            ArrayList(O)      HashSet(O)    HashMap(O)
 *            Vector			TreeSet		  Hashtalbe
 *            LinkedList-Queue
 *            ==> 제네릭스
 *            ------------------------------------------------
 *              
 */
// Calendar 응용
import java.util.*; // Calendar / Scanner
public class 라이브러리_Calendar {

	public static void main(String[] args) {
		// 사용자로부터 년도 / 월 받기
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		int year=scan.nextInt();
		System.out.print("월 입력:");
		int month=scan.nextInt();
		// 1일자의 요일을 가지고 온다 (4=> 4월1일)
		Calendar cal=Calendar.getInstance();
		// 추상클래스는 미완성된 클래스 (메소드가 구현이 안된 상태)
		// 구현할 클래스를 이용한다 , 싱글턴 (newInstance() , getInstance())
		/*
		 *  static => 클래스명.메소드명()
		 *  Math.random()
		 *  클래스명 객체명 = new 생성자() => 추상클래스 , 상속 , 인터페이스
		 *  -----
		 *  클래스명 객체명 = 메소드() => 추상클래스
		 */
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE,1);
		// 요일
		int week=cal.get(Calendar.DAY_OF_WEEK)-1;
		// 마지막날
		int lastday=cal.getActualMaximum(Calendar.DATE);
		String[] strWeek= {"일","월","화","수","목","금","토"};
		System.out.println(year+"년도 "+month+"월");
		System.out.println("\n");
		for(String s:strWeek)
		{
			System.out.print(s+"\t");
		}
		System.out.println();
		for(int i=1;i<=lastday;i++)
		{
			if(i==1)
			{
				for(int j=1;j<=week;j++)
				{
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week>6)
			{
				week=0;
				System.out.println();
			}
		}
	}
}
