package com.sist.util;

import java.util.StringTokenizer;

/*
 *      StringTokenizer : 문자열 분리
 *      1) split() => 대체
 *      2) 빅데이터 / 네트워크 / 웹
 *      -----------------------
 *      기능 
 *       = 생성자
 *         String s1="애니메이션/어드벤처/코미디";
 *         String s2="박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬";
 *         StringTokenizer st=new StringTokenizer(s1,"/")
 *         StringTokenizer st=new StringTokenizer(s2) => 공백별로 분리
 *       = 기능
 *         1) countTokens() : 분리된 데이터 갯수
 *         2) nextToken() : 분리된 데이터 읽기
 *         3) hasMoreTokens() : 분리 갯수만큼 루프수행
 */
public class 라이브러리_StringTokenizer_1 {

	public static void main(String[] args) {
//		String s1="애니메이션/어드벤처/코미디";
//        StringTokenizer st1=new StringTokenizer(s1,"/"); 
//        System.out.println(st1.countTokens());
//        System.out.println(st1.nextToken()); // 첫번째 값
//        System.out.println(st1.nextToken()); // 두번째 값
//        System.out.println(st1.nextToken()); // 세번째 값
        String s2="박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "
        		 +"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "
        		 +"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "
        		 +"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "
        		 +"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "
        		 +"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "
        		 +"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "
        		 +"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "
        		 +"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 ";
        StringTokenizer st2=new StringTokenizer(s2);
        while(st2.hasMoreTokens())
        {
        	System.out.println(st2.nextToken());
        }
//        int a=st2.countTokens();
//        for(int i=1;i<=a;i++)
//        {
//        	System.out.println(st2.nextToken());
//        }
//        System.out.println(a);
//        System.out.println(st2.nextToken()); // 1번 값
//        System.out.println(st2.nextToken()); // 2번 값
//        System.out.println(st2.nextToken()); // 3번 값
//        System.out.println(st2.nextToken()); // 4번 값
//        System.out.println(st2.nextToken()); // 5번 값
//        System.out.println(st2.nextToken()); // 6번 값
//        System.out.println(st2.nextToken()); // 7번 값
//        System.out.println(st2.nextToken()); // 8번 값
//        System.out.println(st2.nextToken()); // 9번 값
//        System.out.println(st2.nextToken()); // 10번 값
	}
}
