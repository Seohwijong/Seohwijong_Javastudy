// 성적 계산 ==> A+(97) , A(90)
/* 
 * 
 */
import java.util.Scanner;
public class 다중조건문_4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("점수를 세개를 입력하세요(10 20 30):");
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		int avg=(kor+eng+math)/3;
		System.out.println("국어점수"+kor);
		System.out.println("영어점수"+eng);
		System.out.println("수학점수"+math);
		System.out.println("총점"+(kor+eng+math));
		System.out.printf("총점은 %.2f\n",(kor+eng+math)/3.0);
		// 학점 ==> 학점, 옵션 (+ , - , 0)
		char score='F';
		char op='+';
		if(avg>=90)
		{
			score='A';
			if(avg>=97)
				op='+';
			else if(avg>=94)
				op='0';
			else
				op='-';
		}
		else if(avg>=80)
		{
			score='B';
			if(avg>=87)
				op='+';
			else if(avg>=84)
				op='0';
			else
				op='-';
		}
		else if(avg>=70)
		{
			score='C';
			if(avg>=77)
				op='+';
			else if(avg>=74)
				op='0';
			else
				op='-';
		}
		else if(avg>=60)
		{
			score='D';
			if(avg>=67)
				op='+';
			else if(avg>=64)
				op='0';
			else
				op='-';
		}
		else
		{
			score='F';
			op=' ';
		}
		System.out.println("학점:"+score+op);
		
			
	}
}
