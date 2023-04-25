package com.sist.string;
//      String 메소드 (문자열 제어하는 기능)
/*
 *      String은 문자열 배열
 *      ------ 문자마다 인덱스번호를 가지고 있다 (0부터 시작)
 *      String s="Hello Java"
 *                0123456789 => 오라클은 1번부터 시작
 *                자바 => == != substring(0,3) => 012
 *                오라클 => = <> substr(1,5) => 12345
 *                자바스크립트 => === !==
 *      주요기능 (310page)
 *      1) 문자열에서 문자 한개 추출 => char charAt(int index)
 */

import java.util.Scanner;

public class 라이브러리_String_3 {

	public static void main(String[] args) {
//		String s1="Hello ";
//		System.out.println(s1.hashCode());
//		s1=s1+"Java";
//		System.out.println(s1.hashCode());
		String msg="Hello Java";
//		for(int i=0;i<msg.length();i++)
//		{
//			System.out.println((i+1)+"번째 문자"+msg.charAt(i));
//		}
//		for(int i=msg.length()-1;i>=0;i--)
//		{
//			System.out.print(msg.charAt(i));
//		}
		// 알파벳 문자열을 입력받아서 대문자 몇개 , 소문자 몇개를 출력하는 프로그램
		Scanner scan=new Scanner(System.in);
		System.out.print("단어입력:");
		String pw=scan.nextLine();
		int a=0;
		int b=0;
		for(int i=0;i<pw.length();i++)
		{
			
			if(pw.charAt(i)<='Z' && pw.charAt(i)>='A')
			{
				a++;
			}
			else if(pw.charAt(i)<='z' && pw.charAt(i)>='a')
				b++;
		}
		System.out.println("입력한 문자:"+pw);
		System.out.println("대문자:"+a+", 소문자:"+b);
	}
}
