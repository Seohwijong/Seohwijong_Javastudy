//7) 정수 2개와 연산자(+,-,*,/)를 입력 받아 사칙 연산하는 프로그램을 만들어라 
//   (switch~case 사용) 
import java.util.Scanner;
public class 문제7 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("정수를 입력:");
		int num1=scan.nextInt();
		System.out.print("사칙연산을 입력(+,-,*,/:");
		char op=scan.next().charAt(0);
		System.out.print("정수를 입력:");
		int num2=scan.nextInt();

		switch(op)
		{
		case'+':
			System.out.println(num1+"+"+num2+"="+(num1+num2));
			break;
		case'-':
			System.out.println(num1+"-"+num2+"="+(num1-num2));
			break;
		case'*':
			System.out.println(num1+"*"+num2+"="+(num1*num2));
			break;
		case'/':
			if(num2!=0)
			{
				System.out.println(num1+"/"+num2+"="+(num1/num2));
			}
			else
				System.out.println("0으로는 나눌 수 없습니다.");
			break;
		}

				
	}
}
