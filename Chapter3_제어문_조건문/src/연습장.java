import java.util.Scanner;
public class 연습장 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("입력:");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		if(a<b && b<c)
			System.out.println("a b c");
		if(a<b && c<b)
			if(a<c)
				System.out.println("a c b");
			else
				System.out.println("c a b");
		if(b<a && a<c)
			System.out.println("b a c");
		if(b<a && c<a)
			if(b<c)
				System.out.println("b c a");
			else
				System.out.println("c b a");
		if(a==b || b==c || a==c)
			System.out.println("같은 수가 있습니다");
	}
}
