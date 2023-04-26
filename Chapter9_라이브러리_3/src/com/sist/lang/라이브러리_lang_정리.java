package com.sist.lang;
/*
 *      java.lang => 기본 (가장 많이 사용되는 클래스의 집합)
 *      --------- import를 생략할 수 있다
 *       Object : 최상위 클래스 => 모든 클래스는 Object 상속
 *                ---------- 데이터형으로 사용 (가장 큰 데이터형)
 *                Object o=10
 *                o=10.3
 *                o=""
 *                o='A'
 *                o=true
 *                o=new 클래스
 *                ----------- 여러개의 데이터형을 묶어서 관리
 *                Object[] oo={10,10.3,'A',"aaa",...};
 *                => 라이브러리에서 제공하는 메소드
 *                   -----------------------
 *                   리턴형 / 매개변수 ==> 대부분 Object
 *                   => 형변환 ==> 제네릭스 (데이터형을 변경)
 *                   기본형 = 클래스
 *                   클래스 = 기본형값
 *                => 기능
 *                   1) clone : 복제
 *                   2) toString : 객체를 문자열화
 *                   3) finalize : 소멸자
 *                   4) equals : 비교 (기본 => 주소값 , 실제값을 비교 => 오버라이딩)
 *       String : 문자열 저장 클래스
 *       ------ 기능
 *              length()
 *              substring()
 *              trim()
 *              charAt()
 *              replace()
 *              equals()
 *              startsWith()
 *              contains()
 *              indexOf()
 *              lastIndexOf()
 *              valueOf()
 *              
 *       StringBuffer : append() 문자열 결합
 *       Wrapper
 *          기본형을 클래스화 시킨 클래스 집합
 *          --------------------------
 *            int		=> Integer
 *            long		=> Long
 *            double	=> Double
 *            boolean	=> Boolean
 *           --------------------------> 기본형을 객체형으로 저장 , 문자열을 기본형으로 변환
 *           정수 변경 =>Integer.pasrsInt("10");
 *           실수 변경 =>Double.pasrsDouble("4.5");
 *           논리 변경 =>Boolean.pasrsBoolean("true");
 *     
 *       Math : 수학
 *          = random() : 난수 발생 (0.0~0.99)
 *          = ceil() : 올림 메소드 => 총페이지 구하기
 *          = round() : 반올림 메소드 => 평균 , 통계
 *          
 *       System
 *          = System.currenTimeMillis() : 실제 시간을 => long
 *            로그파일 => 웹
 *          = System.gc() : 가비지 컬렉션 호출 (메모리 회수)
 *          = System.out : 화면 출력
 *          = System.in : 키보드 입력값 , 파일
 */
import java.util.*;
public class 라이브러리_lang_정리 {

	public static void main(String[] args) {
//		List<String> list=new ArrayList<String>();
//		list.add("aaa");
//		String a=list.get(0);
//		// Integer i=10 int ii=i
//		// int aa=new Integer(10);
//		Integer i=10; int aa=i;
//		System.out.println(aa);
	}
}
