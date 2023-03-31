/*
 * 문제5. 사용자로 부터 정수를 입력받아서 양수인지 음수인지 확인하는 
         프로그램 작성
 */
import java.util.Scanner;
public class 문제_5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 입력:");
		int num=scan.nextInt();
		if(num>=0)
			if(num!=0)
				System.out.println(num+"은 양수입니다.");
			else
				System.out.println(num+"은 0입니다.");
		else
			System.out.println(num+"은 음수입니다.");
	}
}
