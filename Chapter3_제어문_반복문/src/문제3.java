//3) Scanner 클래스를 이용하여 한 개의 정수를 입력 받아 정수의 절대값을 출력하라
import java.util.Scanner;
public class 문제3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("정수를 입력하세요.:");
		int num=scan.nextInt();
		if(num>0)
		{
			System.out.println("입력한 정수의 절댓값은:"+num);
		}
		else if(num<0)
		{
			System.out.println("입력한 정수의 절댓값은:"+(-num));
		}
		else
		{
			System.out.println("입력한 정수는 0 입니다");
		}
	}
}
