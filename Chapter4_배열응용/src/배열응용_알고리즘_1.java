import java.util.Arrays;
/*
 *    선택정렬/ 버블정렬
 *    선택정렬(select sort)
 *    
 *    10 30 50 20 40 => 10 20 30 40 50 , 50 40 30 20 10
 *    -- --
 *    30 10
 *    --    --
 *    50    30
 *    --       --
 *    50       20
 *    --          --
 *    50          40 ----------- 1round => 0 - 4 4번
 *    --------------
 *    50 10 30 20 40
 *       -- --
 *       30 10
 *       --    --
 *       30    20
 *       --       --
 *       40       30 ----------- 2round => 1 - 4 3번
 *    --------------
 *    50 40 10 20 30
 *          -- --
 *          20 10
 *          --    --
 *          30    20 ----------- 3round => 2 - 4 2번
 *    --------------
 *    50 40 30 10 20
 *             -- --
 *             20 10 ----------- 4round => 3 - 4 1번
 *    --------------
 *    50 40 30 20 10
 */
public class 배열응용_알고리즘_1 {
	public static void main(String[] args) {
		int[] arr=new int[5];
		int a=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("============ 정렬전 ============");
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++) ////// 버블
			{
				if(arr[j]<arr[j+1])
				{
					a=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=a;
				}
			}
		}
		System.out.println("============ 정렬후(DESC) ============");
		System.out.println(Arrays.toString(arr));
		System.out.println("============ 정렬후(ASC) ===========");
		for(int i=0;i<arr.length-1;i++) /////// 선택
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					a=arr[j];
					arr[j]=arr[i];
					arr[i]=a;

				}
			}
			System.out.println("========== "+(i+1)+"회차 ==========");
			System.out.println(Arrays.toString(arr));
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
	}
}
