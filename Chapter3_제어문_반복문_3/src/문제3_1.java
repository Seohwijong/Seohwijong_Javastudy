import java.util.Scanner;

///3. char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식 작성

public class 문제3_1 {
 public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("입력:");
	char ch=scan.next().charAt(0);
	if(ch=='x'||ch=='X')
		System.out.println("true");
	else
		System.out.println("false");
	
}
}
