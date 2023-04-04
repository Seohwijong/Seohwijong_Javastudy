//2.	100~999 사이의 4의배수가 아닌 수의 갯수,합을 출력하는 프로그램 작성
public class 문제2 {
	public static void main(String[] args) {
		int a4=0,s4=0;
		for(int i=100;i<=999;i++)
		{
			if(i%4!=0)
			
			{
				a4+=i;
				s4++;
			}
		}
		System.out.println("4의배수 아닌수 합:"+a4+", 갯수:"+s4);
	}
}
