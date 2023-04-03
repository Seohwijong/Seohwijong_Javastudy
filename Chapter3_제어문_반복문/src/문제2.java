//2) 한 개의 정수를 입력 받아 3의 배수인지 판별하여 출력하라
import java.util.Scanner;
public class 문제2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("정수를 입력하세요:");
		int num=scan.nextInt();
		if(num%3==0)
			System.out.println("입력한 정수"+num+"는(은) 3의배수입니다.");
		else
			System.out.println("입력한 정수"+num+"는(은) 3의배수가 아닙니다.");
	}
}
