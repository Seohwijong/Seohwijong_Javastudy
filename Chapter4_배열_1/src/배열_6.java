
public class 배열_6 {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		//   arr[0],arr[1],arr[2],arr[3],arr[4]
		//   arr[0] 첫번째=> 값읽기/값변경 가능
		//1.배열의 크기를 출력
		System.out.println("배열의 크기:"+arr.length);
		//2. 3번째 값을 300으로 바꾸기
		arr[2]=300;
		System.out.println("3번째 값:"+arr[2]);
		//3. 5번째를 출력
		System.out.println("5번째 값:"+arr[4]);
	}
}
