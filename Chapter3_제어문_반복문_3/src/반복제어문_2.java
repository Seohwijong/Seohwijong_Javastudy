import java.util.Scanner;

// break / continue
public class 반복제어문_2 {
	public static void main(String[] args) {
		// 세자리 정수를 입력
		// 조건 : 0을 포함 할 수 없다
		// 조건 : 같은 수를 입력 할 수 없다
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.println("세자리 정수를 입력:");
			int input=scan.nextInt();
			if(input<100 || input>999)
			{
				System.out.println("세자리 정수가 아닙니다.");
				continue;// while문 처음부터 다시 수행 ==> 조건식
			}
			int a=input/100;
			int b=(input%100)/10;
			int c=(input%10);
			if(a==0 || b==0 || c==0)
			{
				System.out.println("0은 사용할 수 없습니다.");
				continue;
			}
			//같은 숫자가 있는 경우
			if(a==b || b==c || a==c)
			{
				System.out.println("같은 숫자는 사용할 수 없습니다.");
				continue;
			}
			// 정상 수행시
			System.out.println("입력값:"+input);
			break; //종료
		}
		// for => 제외
		// while => 처음부터 다시
	}
}
