import java.util.Arrays;

//정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라.
//그리고 배열에 든 숫자들과 평균을 출력하라. 

public class 문제_7 {
	public static void main(String[] args) {
		int[] arr=new int[10];
		int total=0;
		double avg=0;
		for(int i=0;i<arr.length;i++)
		{
			int a=(int)(Math.random()*10)+1;
			arr[i]=a;
			total+=a;

		}
		avg=total/3.0;
		System.out.println(Arrays.toString(arr));
		System.out.println(total+","+avg);
		
	}
}
