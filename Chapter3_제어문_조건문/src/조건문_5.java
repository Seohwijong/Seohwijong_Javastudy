// 중첩 조건문  => 3개의 정수를 받아서 총점 / 평균 / 학점 (A+,A0,A-)
// 97 A+ , 94 A0 , 90 A-
import java.util.Scanner;
public class 조건문_5 {
	public static void main(String[] args) {
		int kor=0,eng=0,math=0,total=0;
		double avg=0.0;
		char score='F',option='-';
		Scanner scan=new Scanner(System.in);
		System.out.print("점수 3개를 입력(1 2 3):");
		kor=scan.nextInt();
		eng=scan.nextInt();
		math=scan.nextInt();
		total=kor+eng+math;
		avg=total/3.0;
		
		int temp=(int)avg;
		if(temp>=90 && temp<100)
		{
			score='A';
			if(temp>=97 && temp<100)
				option='+';
			if(temp>=94 && temp<97)
				option='0';
		}
		if(temp>=80 && temp<90)
		{
			score='B';
			if(temp>=87 && temp<90)
				option='+';
			if(temp>=84 && temp<87)
				option='0';
		}
		if(temp>=70 && temp<80)
		{
			score='C';
			if(temp>=77 && temp<80)
				option='+';
			if(temp>=74 && temp<77)
				option='0';
		}
		if(temp>=60 && temp<70)
		{
			score='D';
			if(temp>=67 && temp<70)
				option='+';
			if(temp>=64 && temp<67)
				option='0';
		}
		if(temp<60)
		{
			score='F';
			option=' ';
		}
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+math);
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n",avg);
		System.out.println("학점:"+score+option);
		
				
	}
}
