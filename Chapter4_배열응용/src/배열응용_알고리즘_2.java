import java.util.Arrays;
import java.util.Scanner;

// 선택정렬 => 문자
public class 배열응용_알고리즘_2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("몇개?");
		int input=scan.nextInt();
		if(input>0)
		{
		char[] arr=new char[input];
		char a=' ';
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(char)((Math.random()*26)+65);
		}
		System.out.println("===============정렬전==============");
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
				if(arr[i]<arr[j])
				{
					a=arr[j];
					arr[j]=arr[i];
					arr[i]=a;
				}
		}		
		System.out.println("===============DESC==============");
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
				if(arr[i]>arr[j])
				{
					a=arr[j];
					arr[j]=arr[i];
					arr[i]=a;
				}
		}
		System.out.println("===============ASC===============");
		System.out.println(Arrays.toString(arr));
		}
		else
		{
			System.out.println("똑바로적어");
		}
	}
}
