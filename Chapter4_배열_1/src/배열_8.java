import java.util.Arrays;

public class 배열_8 {
	public static void main(String[] args) {
		int[] arr1= {10,20,30,40,50};
		int[] arr2=arr1.clone();// 별칭 (참조데이터 = 주소값 => 같은메모리 사용 => 하나만 바꿔도 둘다바뀜)
		// .clone()을 쓰면 새로운 메모리를 생성 따로 사용 가능 => 값을 복사할수가 있다
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println("arr1="+Arrays.toString(arr1));
		System.out.println("arr2="+Arrays.toString(arr2));
		
		System.out.println("======== 배열값 변경 ========");
		arr2[0]=100;
		arr2[1]=200;
		arr2[2]=300;
		arr2[3]=400;
		arr2[4]=500;
		System.out.println("arr2="+Arrays.toString(arr2));
		System.out.println("arr1="+Arrays.toString(arr1));
		int[] arr3=new int[10];
		for(int i=0;i<arr1.length;i++)
		{
			arr3[i]=arr1[i];
		}
		System.out.println("arr3="+Arrays.toString(arr3));
			
	}
}
