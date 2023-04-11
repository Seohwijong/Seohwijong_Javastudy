import java.util.Arrays;
import java.util.Scanner;
/*
 *   1. 난수 발생
 *   2. 사용자 입력
 *   ==========
 *   3. 비교
 *   4. 힌트
 *   ==========
 *   5. 종료
 */
public class 메소드조립법_3 {
	static void input()
	{
		Scanner scan=new Scanner(System.in);
		int[] com=new int[3];
		int[] user=new int[3];
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*9)+1;
			for(int j=0;j<i;i++)
			{
				if(com[i]==com[j])
					i--;
				break;
			}
		}
		while(true)
		{
			System.out.print("3자리 숫자입력:");
			int input=scan.nextInt();
			if(input<100||input>999)
			{
				System.out.println("잘못 입력했습니다.");
				continue;
			}
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			if(user[0]==user[1]||user[1]==user[2]||user[2]==user[0])
			{
				System.out.println("같은 숫자는 입력할 수 없습니다.");
				continue;
			}
			if(user[0]==0||user[1]==0||user[2]==0)
			{
				System.out.println("0은 입력할 수 없습니다.");
				continue;
			}
//			compare(com,user);
			break;
		}
	}
//	static int[] compare(int[] com,int[] user)
//	{
//		int num=0;
//		while(true)
//		{
//			int s=0,b=0; // s는 스트 b는 볼
//			for(int i=0;i<com.length;i++)
//			{
//				for(int j=0;j<com.length;j++)
//				{
//					if(com[i]==user[j])
//					{
//						if(i==j)
//							s++;
//						else
//							b++;
//					}
//				}
//			}
//		System.out.printf("Input:%d,Result:%dS-%dB\n",s,b);
//		if(s==3)
//			{
//			System.out.println("정답! "+num+"번만에 맞추셧 습니다.");
//			break;
//			}
//		return
//		}
//	}
	static void process()
	{
		
		
	}
	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		int[] com=new int[3];
//		int[] user=new int[3];
//		for(int i=0;i<com.length;i++)
//		{
//			com[i]=(int)(Math.random()*9)+1;
//			for(int j=0;j<i;i++)
//			{
//				if(com[i]==com[j])
//					i--;
//				break;
//			}
//		}
//		int num=0;
//		while(true)
//		{
//			System.out.print("3자리 숫자입력:");
//			int input=scan.nextInt();
//			if(input<100||input>999)
//			{
//				System.out.println("잘못 입력했습니다.");
//				continue;
//			}
//			user[0]=input/100;
//			user[1]=(input%100)/10;
//			user[2]=input%10;
//			if(user[0]==user[1]||user[1]==user[2]||user[2]==user[0])
//			{
//				System.out.println("같은 숫자는 입력할 수 없습니다.");
//			}
//			if(user[0]==0||user[1]==0||user[2]==0)
//			{
//				System.out.println("0은 입력할 수 없습니다.");
//			}
//			
//			int s=0,b=0; // s는 스트 b는 볼
//			for(int i=0;i<com.length;i++)
//			{
//				for(int j=0;j<com.length;j++)
//				{
//					if(com[i]==user[j])
//					{
//						if(i==j)
//							s++;
//						else
//							b++;
//					}
//				}
//			}
//			num++;
//			System.out.printf("Input:%d,Result:%dS-%dB\n",input,s,b);
//			if(s==3)
//				{
//				System.out.println("정답! "+num+"번만에 맞추셧 습니다.");
//				break;
//				}
//		}
		/////////////////////////////////////////////////난수발생 , 입력 , 비교
		input();		
	}
}
