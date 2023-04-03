// 성적 계산 => Rank,정렬 ...
// 세개의 정수를 받아서 평균을 구해서 => 등급출력
// 다중조건문 사용
/*
 *   >=90
 *   >=80
 *   >=70
 *   >=60
 *   -------else
 *   
 *   web 개발/호스팅 (AWS) => 운영체제와 고정ip를 빌려서(PaaS)
 *   ----------------------------------------------
 *   Java/Oracle/HTML/CSS/JavaScript/
 *   --------------------------------Spring/MyBatis/JPA
 *   Java:데이터 관리
 *   
 *   
 *   
 *   
 */
import java.util.Scanner;
public class 다중조건문_2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("세가지 점수를 입력하세요(10 10 10):");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		int total=num1+num2+num3;
		double avg=total/3.0;
		if(num1<=100 && num1>=0 && num2<=100 && num2>=0 && num3<=100 && num3>=0)
		{
			System.out.println("국어점수:"+num1);
			System.out.println("영어점수:"+num2);
			System.out.println("수학점수:"+num3);
			System.out.printf("총점은 %d 평균은 %.2f\n",total,avg);
			if(avg>=90)
			{
				System.out.println("학점은 A입니다.");
			}
			else if(avg>=80 && avg<90)
			{
				System.out.println("학점은 B입니다.");
			}
			else if(avg>=70 && avg<80)
			{
				System.out.println("학점은 C입니다.");
			}
			else if(avg>=60 && avg<70)
			{
				System.out.println("학점은 D입니다.");
			}
			else
			{
				System.out.println("학점은 F입니다");
			}
		}
		else
		{
			System.out.println("올바르지 않은 점수입니다.");
		}
		// 학점 계산
		char score='F'; // 값이 변경이 없는 경우에 처리되는 값(default)
		if(avg>=90)
			score='A';
		else if(avg>=80)
			score='B';
		else if(avg>=70)
			score='C';
		else if(avg>=60)
			score='D';
		
		System.out.println("학점:"+score);
			
	}
}
