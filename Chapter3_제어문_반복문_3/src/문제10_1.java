//10. 1~100까지의 정수 중 4의 배수의 합계를 구하라
public class 문제10_1 {
	public static void main(String[] args) {
		int a=0;
		for(int i=1;i<=100;i++)
		{
			if(i%4==0)
			{
				a+=i;
			}
		}
		System.out.println(a);
	}
}
