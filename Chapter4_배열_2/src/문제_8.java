import java.util.Arrays;
import java.util.Scanner;

/*

10개의 정수를 입력받아 그 중 가장 큰 수를 출력하는 프로그램
입력예) 5 10 8 55 6 31 12 24 61 2출력예) 61


 */
public class 문제_8 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int[] arr1=new int[5];
		System.out.println("정수 5개 입력(5 10 9 3 2):");
		for(int i=0;i<arr1.length;i++)
		{
			int a=scan.nextInt();
			arr1[i]=a;
			System.out.print(arr1[i]+" ");
		}

		
		char[] arr2=new char[10];
		System.out.println("문자 10개 입력(A B C ... F G):");
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=scan.next().charAt(0);
				System.out.print(arr2[i]);
		}
		
   
		int[] arr3=new int[10];
		System.out.println("문자 10개 입력(1 2 3 ... 9 10):");
		for(int i=0;i<arr3.length;i++)
		{
			arr3[i]=scan.nextInt();
			if(i==3 || i==5 || i==9)
				System.out.print(arr3[i]+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(arr3));
		

		
		int[] arr4=new int[10];
		int max=arr4[0];
			System.out.println("정수 10개 입력(1 2 3...9 10):");
			for(int i=0;i<arr4.length;i++)
			{
				int a=scan.nextInt();
				arr4[i]=a;
				if(max<arr4[i])
					max=arr4[i];
					
			}
			System.out.println(max);
				
		
		
		
	}
}
