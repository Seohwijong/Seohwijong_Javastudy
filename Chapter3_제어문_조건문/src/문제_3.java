//문제3. 1학년부터 4학년까지 중간고사 시험을 보았다. 
//     4학년은 70점 이상이면 합격, 그 이외의 학년은 60점 이상이면 합격이다. 
//     이를 판단하는 프로그램을 작성해보자.
//     점수가 0미만 100초과이면 경고문구 출력!
import java.util.Scanner;
public class 문제_3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("학년과 점수를 입력(학년 점수):");
		int grade=scan.nextInt();
		int num=scan.nextInt();
		if(grade>0 && grade<=4 && num<=100 && num>0)
			if(grade==4)
				if(num>=70)
					System.out.println(grade+"학년이고"+num+"점 이므로 합격입니다.");
				else
					System.out.println(grade+"학년이고"+num+"점 이므로 불합격입니다.");
			else
				if(num>=60)
					System.out.println(grade+"학년이고"+num+"점 이므로 합격입니다.");
				else
					System.out.println(grade+"학년이고"+num+"점 이므로 불합격입니다.");
		else
			System.out.println("학년 또는 점수를 잘못 입력하셧습니다.");		
	}
}
