//1.	100~999사이에 7의 배수의 갯수와 합을 출력하는 프로그램 작성
public class 문제1 {
	public static void main(String[] args) {
		int a7=0,s7=0;
		for(int i=100;i<=999;i++)
		{
			if(i%7==0)
			{
				s7++;
				a7+=i;
			}
		}
		System.out.println("7의 배수 합:"+a7+", 갯수"+s7);
	}
}
