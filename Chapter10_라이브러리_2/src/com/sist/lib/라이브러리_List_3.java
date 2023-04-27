package com.sist.lib;
import java.util.*;
/*
 *     subList(int start,int end) => index번호가 start부터
 *                                   end까지 부분적으로 데이터 복사
 *                                   --- (end-1)
 *     ==> 페이지 나누기
 *     allAll() => ArrayList가 가지고 있는 모든 데이터 복사
 *     reatinAll() => 두개의 ArrayList에서 같은 값을 가지고 있는 데이터 복사
 *     Collections.sort() => ArrayList 정렬
 */
public class 라이브러리_List_3 {

	public static void main(String[] args) {
		ArrayList names1=new ArrayList();
		names1.add("홍길동");
		names1.add("심청이");
		names1.add("이순신");
		names1.add("강감찬");
		names1.add("춘향이");
		ArrayList names2=new ArrayList();
		names2.add("홍길수");
		names2.add("심청이");
		names2.add("이순이");
		names2.add("강감차");
		names2.add("성춘향");
		ArrayList temp=new ArrayList();
		for(Object i:names1)
			System.out.println(i);
		System.out.println("===========================");
		// 교집합 => retainAll
		temp.addAll(names1);
		temp.retainAll(names2);
		for(Object i:temp)
			System.out.println(i);
		
	}
}
