import java.util.Arrays;

public class 배열_9 {
	public static void main(String[] args) {
		//배열 확장
		int[] arr1={10,20,30,40,50};
		int[] arr2=new int[10];
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		System.out.println(Arrays.toString(arr2));
		
	}
}
