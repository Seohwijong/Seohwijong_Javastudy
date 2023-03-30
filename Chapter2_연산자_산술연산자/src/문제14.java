import java.util.Scanner;
public class 문제14 {
	public static void main(String[] args) {
		//두 개의 정수를 입력 받아서 첫째 수를 둘째 수로 나눈 나머지를 출력하는 프로그램을 작성해 보자.
		Scanner scan1=new Scanner(System.in);
		System.out.print("정수를 입력:");
		int user1=scan1.nextInt();
		Scanner scan2=new Scanner(System.in);
		System.out.print("정수를 입력:");
		int user2=scan2.nextInt();
		System.out.println(user1+"/"+user2+"="+(user1/user2)+"\t나머지"+(user1%user2));
		System.out.printf("%d/%d=%d\t나머지%d",user1,user2,user1/user2,user1%user2);
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("정수를 입력:");
//		int a=scan.nextInt();
//		int b=scan.nextInt();
//		System.out.printf("%d/%d=%d\t나머지%d",a,b,a/b,a%b);
	}
}

