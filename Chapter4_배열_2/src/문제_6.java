import java.util.Arrays;
import java.util.Scanner;

//양의 정수 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라

public class 문제_6 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] arr=new int[10];
		int a=0;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("정수를 입력하시오:");
			a=scan.nextInt();
			arr[i]=a;
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%3==0 && arr[i]!=0)
			{
				System.out.print(arr[i]);
			}
		}
		}
}
