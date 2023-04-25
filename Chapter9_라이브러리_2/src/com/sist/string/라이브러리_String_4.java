package com.sist.string;

import java.util.Scanner;

//      charAt
//      코테
//      문자열을 입력해서 좌우 대칭인지 확인
public class 라이브러리_String_4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.print("문자열 입력:");
			String a=scan.nextLine();
			if(a.length()%2!=0)
			{
				System.out.println("짝수개만 입력가능");
				continue;
			}
		boolean bCheck=true;
		int b=a.length()/2;
		int j=a.length()-1;
		for(int i=0;i<b;i++)
		{
			if(a.charAt(i)!=a.charAt(j))
			{
				bCheck=false;
				break;
			}
			j--;
		}
		if(bCheck==true)
		{
			System.out.println(a+"는(은) 좌우대칭입니다");
		}
		else
		{
			System.out.println(a+"는(은) 좌우대칭이 아닙니다");
		}
		break;
		}
	}
}
