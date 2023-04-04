import java.util.Scanner;

//2. char형 변수 ch가 공백이고 탭이 아닐 때 true인 조건식 작성

public class 문제2_1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("입력:");
		char ch=scan.next().charAt(0);
		if(ch!=' ' && ch!='	')
			System.out.println("false");
		else
			System.out.println("true");
	}
}
