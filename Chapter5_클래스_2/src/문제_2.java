import java.util.Scanner;

/*
 * 1. 1~10까지 출력하는 메소드 구현
 * 2. 1~10까지 합을 구하는 메소드 구현
 * 3. 1~n까지 합을 구하는 메소드 구현
 * 4. 두 정수를 나눗셈 결과를 구해주는 메소드 구현
 * 5. 문자열의 소문자를 대문자로 바꿔주는 메소드 구현
 * 6. 문자열을 거꾸로 출력하는 메소드 구현
 */
public class 문제_2 {
	static void method1()
	{
		for(int i=1;i<=10;i++)
			System.out.print(i+" ");
	}
	static void method2()
	{
		int a=0;
		for(int i=1;i<=10;i++)
			a+=i;
		System.out.println("1~10까지의 합:"+a);
	}
	static void method3()
	{
		int b=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("숫자 입력:");
		int a=scan.nextInt();
		for(int i=1;i<=a;i++)
			b+=i;
		System.out.println("1부터"+a+"까지의 합:"+b);
	}

	static void method4()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("숫자 입력:");
		int num1=scan.nextInt();
		System.out.print("숫자 입력:");
		int num2=scan.nextInt();
		System.out.printf("%d/%d=%d 나머지 %.2f",num1,num2,(num1/num2),(num1%(double)num2));
	}
	static void method5()
	{
		String a="A";
		Scanner scan=new Scanner(System.in);
		System.out.print("영어 입력:");
		char input=scan.next().charAt(0);
		if(input>='A' && input<='Z')
		{
			System.out.println((char)(input+32));
			
		}
		else
			System.out.println((char)(input-32));
	}
	static void method6()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("문자열 입력:");
		String word=scan.next();
		char[] word2=new char[word.length()];
		for(int i=0;i<word.length();i++)
		{
			word2[i]=word.charAt(i);
		}
		for(int i=word2.length-1;i>=0;i--)
		{
			System.out.print(word2[i]);
		}
		
	}
	public static void main(String[] args) {
		method1();
		System.out.println();
		method2();
		method3();
		method4();
		System.out.println();
		method5();
		method6();
		
	}
}
