import java.util.Scanner;
// 한개의 점수를 받아서 60이상 합격 아니면 불합격
public class 선택조건문_2 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("점수 입력:");
		int num=scan.nextInt();
		if(num>=0 && num<=100)
			{
			if (num<60)
				System.out.println(num+"점은 불합격입니다.");
			else
				System.out.println(num+"점은 합격입니다.");
			}
		else
			System.out.println(num+"점은 올바르지 않은 점수입니다.");

	}
}
