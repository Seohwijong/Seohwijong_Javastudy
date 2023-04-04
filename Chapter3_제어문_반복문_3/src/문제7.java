import java.util.Scanner;

//7.	정수 입력을 받아서 60이상 합격 =>불합격  if~else
public class 문제7 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("점수입력:");
		int a=scan.nextInt();
		if(a>=60 &&a<=100)
			System.out.println("합격");
		else if(a<60 && a>=0)
			System.out.println("불합격");
		else
			System.out.println("다시입력");
	}
}
