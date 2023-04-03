//12) 1부터 30까지의 정수에서 짝수만 한 줄에 3개씩 출력하라
public class 문제12 {
	public static void main(String[] args) {
		int a=0;
		for(int i=2;i<=30;i+=2)
		{
			a++;
			switch(a)
			{
			case 1:
				System.out.print(i+" ");
				break;
			case 2:
				System.out.print(i+" ");
				break;
			case 3:
				System.out.print(i+"\n");
				a=0;
				break;
				
			}
		}
		//-------------------------------------------------------------
		for(int i=2;i<=30;i+=2)
		{
			System.out.print(i+" ");
			
			if(i%3==0)
				System.out.println();
		}
	}
}
