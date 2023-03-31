/*
 * 문제7. 정수 3개를 입력받아서 총점과 평균을 구하고 학점을 구하는 프로그램
        작성 ( 90이상이면 A,80이상이면 B, 70이상이면 C,60이상이면 D, 
        나머지는 F)
 */
import java.util.Scanner;
public class 문제_7 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 3개를 입력(1 2 3):");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		int total=num1+num2+num3;
		double avg=total/3.0;
		if(num1<100 && num2<100 && num3<100)
		{
			System.out.println("총점은:"+total);
			System.out.printf("평균은:%.2f\n",avg);
			if(avg>=60)
			{
				if(avg>=90 && avg<=100)
					System.out.println("A");
				if(avg>=80 && avg<90)
					System.out.println("B");
				if(avg>=70 && avg<80)
					System.out.println("C");
				if(avg>=60 && avg<70)
					System.out.println("D");
			}
			else
				System.out.println("F");
		}
		else
			System.out.println("점수가 올바르지 않습니다.");
	}
}
