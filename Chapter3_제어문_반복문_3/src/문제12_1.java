import java.util.Scanner;

//12. 10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를 각각 출력하는 프로그램


public class 문제12_1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int b=0;
		for(;;)
		{	
			System.out.println("10개정수 입력:");
			int a=scan.nextInt();
			if(a!=0)
			{
				if(a%3==0)
					System.out.println("3의배수");
				if(a%5==0)
					System.out.println("5의배수");
				else
					System.out.println("3,5의배수 아님");
			}
			b++;
			if(b==10)
				break;
		}	
	}
}
