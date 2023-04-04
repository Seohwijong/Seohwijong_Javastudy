import java.util.Scanner;

//4. char형 변수 ch가 숫자('0' ~ '9')일 때 true인 조건식 작성
public class 문제4_1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("입력:");
		char ch=scan.next().charAt(0);
		if(ch>='0' && ch<='9')
			System.out.println("true");
		else
			System.out.println("false");
	}
}
