import java.util.Arrays;

// 정수 10개 저장 공간 => 임의로 초기화 (1~100)
// 최대값 / 최소값 ==> 위치
/*
 *    1 2 3 4 5 6 7 8 9 10
 *    ----------------------
 *    max=10 ==> 9
 *    min=1 ==> 0
 *    
 *    => 영화 ==> 같은인덱스
 *    제목
 *    포스터
 *    장르
 *    감독
 *    출연
 *    순위
 */
public class 배열응용_2 {
	public static void main(String[] args) {
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		int max=arr[0];
		int min=arr[0];
		int rank[]= new int[10];
		int a=0,b=0;
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
			if(min>arr[i])
				min=arr[i];
			for(int j=0;j<arr.length;j++)
				if(arr[j]<arr[i])
					rank[j]++;
		}
		for(int i=0;i<arr.length;i++)
		{
			if(rank[i]==0)
				a=i+1;
			if(rank[i]==9)
				b=i+1;
		}
		//강사님꺼
//		for(int i:arr)
//		{
//			if(max<i)
//				max=arr[i];
//			if(max>i)
//				max=arr[i];
//		}
//		int index1=0;
//		int index2=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]==max)
//				index1=i;
//			else if(arr[i]==min)
//				index2=i;
//		}
		System.out.println("순위:"+Arrays.toString(rank));
		System.out.println("최대값:"+max+",최소값:"+min+",최소값의 위치:"+b+",최대값의 위치:"+a);
//		System.out.println("최대값:"+max+", 최소값:"+min);
//		System.out.println("최대값 위치(index):"+index1+", "+(index1+1)+"번째 위치");
//		System.out.println("최소값 위치(index):"+index2+", "+(index2+1)+"번째 위치");
	}
}