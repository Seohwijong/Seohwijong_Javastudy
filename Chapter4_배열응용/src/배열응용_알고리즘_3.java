import java.util.Arrays;

/*
 *    버블 정렬 : 인접한 데이터끼리 비교
 *    => 선택정렬 : 앞에서부터 정렬
 *    => 버블정렬 : 뒤에서부터 정렬
 *    
 *    40 30 10 50 20 ==> ASC
 *    -- --
 *    30 40
 *       -- --
 *       10 40
 *          -- --
 *          40 50
 *             -- --
 *             20 50  ----------- 1round
 *    --------------         
 *    30 10 40 20 50
 *    -- --
 *    10 30
 *       -- --
 *       30 40
 *          -- --
 *          20 40 50 ------------- 2round
 *    --------------
 *    10 30 20 40 50
 *    -- --
 *    10 30
 *       -- --
 *       20 30 40 50 ------------- 3round
 *    --------------      
 *    10 20 30 40 50
 *    -- --
 *    10 20 30 40 50 ------------- 4round
 *    ---------------
 */
public class 배열응용_알고리즘_3 {
	public static void main(String[] args) {
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("===============정렬전==============");
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int a=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=a;
				}
			}
		}
		System.out.println("===============DESC==============");
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int a=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=a;
				}
			}
		}
		System.out.println("===============ASC==============");
		System.out.println(Arrays.toString(arr));
	}
}
