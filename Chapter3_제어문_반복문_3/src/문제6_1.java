import java.util.Scanner;

//6. 사용자로부터 두개의 정수(시작,끝)를 입력받아 시작(포함)해서 
//   끝(포함)까지의 곱을 출력하는 프로그램을 작성하시오.




public class 문제6_1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("입력 2개 (시작 끝):");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=a;
		for(int i=a;i<=b;i++)
			{
			c=c*i;
			System.out.println(c);
			}
	}
}
