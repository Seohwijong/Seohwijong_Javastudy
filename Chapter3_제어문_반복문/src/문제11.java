import java.util.Scanner;

//11) 한 개의 정수를 입력 받아 1부터 입력 받은 정수까지의 합을 출력하라
public class 문제11 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("정수를 입력:");
		int sum=0;
		int a=scan.nextInt();
		for(int i=a;i>=1;i--)
		{
			sum+=i;
		}
		System.out.println("1~10까지의 합:"+sum);
	}
}
