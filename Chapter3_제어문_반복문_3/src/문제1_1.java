import java.util.Scanner;

//1.  int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식 작성 (조건문)

public class 문제1_1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("입력:");
		int x=scan.nextInt();
		if(x>=10 && x<=20)
			System.out.println("true");
		else
			System.out.println("false");
		
	}
}
