//4.	1~100 3의 배수이고 5의 배수를 출력하는 프로그램 작성
public class 문제4 {
	public static void main(String[] args) {
		int a3=0,a5=0;
		for(int i=1;i<=100;i++)
		{
			if(i%3==0 &&i%5==0)
			{
				a3=i;
				System.out.print(a3+" ");
			}
			
		}
	}
}
