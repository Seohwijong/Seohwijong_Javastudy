import java.util.Scanner;

//11. 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇개인지 출력하는 프로그램 작성


public class 문제11_1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int b=0;
		for(;;)
		{	
			
			System.out.println("10개정수 입력:");
			int a=scan.nextInt();
			if(a%2==0)
				System.out.println("짝수");
			else
				System.out.println("홀수");
			b++;
			if(b==10)
				break;
		}	
		
	}
}
