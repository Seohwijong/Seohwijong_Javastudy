//4) 년도를 입력 받아 윤년인지 아닌지를 판별하는 방법을 if~else문으로 사용하라
import java.util.Scanner;
public class 문제4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("년도를 입력:");
		int num=scan.nextInt();
		if((num%4==0 && num%100!=0) || (num%400==0))
			System.out.println(num+"년은 윤년 입니다.");
		else
			System.out.println(num+"년은 윤년이 아닙니다.");
		
	}
}
