//문제2. 정수 한 개를 입력받아서, 그 수가 3의 배수인지 판단해보자.

import java.util.Scanner;
public class 문제_2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력:");
		int num=scan.nextInt();
		if(num%3==0)
			System.out.println(num+"는(은) 3의 배수입니다.");
		else
			System.out.println(num+"는(은) 3의 배수가 아닙니다.");
		
	}
}
