import java.util.Arrays;
import java.util.Scanner;

/*
 * 5개의 정수를 {95, 75, 85, 100, 50}로 초기화하고 오름차순으로 정렬하는 프로그램 
출력예) 50 75 85 95 100


 */
public class 문제_9 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
//		int[] arr1=new int[10];
//		int total=0;
//		double avg=0;
//		System.out.println("정수 10개 입력:");
//		for(int i=0;i<arr1.length;i++)
//		{
//			int a=scan.nextInt();
//			arr1[i]=a;
//			total+=a;
//		}
//		avg=total/10.0;
//		System.out.println(Arrays.toString(arr1));
// 		System.out.printf("총점은 %d, 평균은 %.2f",total,avg);
		int[] arr2= {95,75,85,100,50};
		int[] rank2=arr2.clone();
		int[] rank=new int[5];
		int[] rank3=arr2.clone();
		int[] b=new int[5];
		int a=0;
		for(int i=0;i<arr2.length-1;i++)
		{
			for(int j=0;j<arr2.length-1;j++)
			{
				if(arr2[j]<arr2[j+1])
				{
					a=arr2[j];
					arr2[j]=arr2[j+1];
					arr2[j+1]=a;
				}
			}
		}
//		for(int i=0;i<arr2.length;i++)
//		{
//				a++;
//				b[i]+=a;
//				rank[i]=1;
//				rank3=arr2.clone();
//			for(int j=0;j<arr2.length;j++)
//			{
//				if(arr2[i]<arr2[j])
//				{
//					rank[i]++;
//				}
//			}
//			
//		}
//		for(int i=0;i<arr2.length;i++)
//		{
//			for(int j=0;j<arr2.length;j++)
//			{
//				if(b[i]==rank[j])
//					rank2[i]=rank3[j];
//			}
//		}
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(rank2));
	}
}
