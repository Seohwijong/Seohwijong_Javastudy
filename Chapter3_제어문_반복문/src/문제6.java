//6) 100점 만점으로 성적을 입력 받아 90~100이면 A,80~89이면 B,70~79이면 C, 60~69이면 D,
//   60점 이하면 F를 출력하라 (switch~case 사용)
import java.util.Scanner;
public class 문제6 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("점수를 입력 :");
		int num=scan.nextInt();
		char score=' ';
		if(num<=100 && num>=0)
		{
			switch(num/10)
			{
			case 10: case 9:
				score='A';
				break;
			case 8:
				score='B';
				break;
			case 7:
				score='C';
					break;
			case 6:
				score='D';
				break;
			default:
				score='F';
				break;	
			
			}
			System.out.println("학점은:"+score);
		}
		else
			System.out.println("잘못 입력하셧습니다.");
	}
}
