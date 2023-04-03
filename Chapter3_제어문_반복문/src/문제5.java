//5) 100점 만점으로 성적을 입력 받아 90~100이면 A,80~89이면 B,70~79이면 C, 60~69이면 D,
//   60점 이하면 F를 출력하라 (다중 if 사용)
import java.util.Scanner;
public class 문제5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("성적 입력:");
		int num=scan.nextInt();
		char score='F';
		System.out.println("입력된 점수는:"+num);
		if(num<=100 && num>=0)
		{
			if(num<=100 && num>=90)
				score='A';
			else if(num<90 && num>=80)
				score='B';
			else if(num<80 && num>=70)
				score='C';
			else if(num<70 && num>=60)
				score='D';
			else
				score='F';
			System.out.println("학점:"+score);
		}
		else
			System.out.println("점수가 잘못 입력되었습니다.");
	}
}
