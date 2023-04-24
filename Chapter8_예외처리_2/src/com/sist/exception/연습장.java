package com.sist.exception;

import java.util.Scanner;

public class 연습장 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("숫자");
		int a=scan.nextInt();
		int b=scan.nextInt();
		try
		{
			int c=a/b;
			System.out.println(c);
		}catch(Exception e)
		{
			System.out.println("0으로 못나눔");
		}
		
	}
}
