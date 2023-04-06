import java.util.Arrays;
import java.util.Scanner;
/*
 *    숫자 야구게임!
 *    1. 컴퓨터 => 임의의 숫자 3개(1~9까지 중복없는 난수)
 *       3 6 9
 *    2. 사용자 숫자를 입력해서 발생된 난수를 맞추는 게임
 *    3. 힌트
 *       s or b 갯수 말해주기
 */
public class 배열응용_4 
{
	public static void main(String[] args) 
	{
		int[] com=new int[3];
		int[] user=new int[3];
		int count=0;
		for(int i=0;i<com.length;i++)
		{
				com[i]=(int)(Math.random()*9)+1;
				for(int j=0;j<i;j++)
				{
					if(com[i]==com[j])
					{
						i--;
						break;
					}
				}
		}
	
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			int s=0;
			int b=0;
			System.out.println("세자리 입력(중복x):");
			int input=scan.nextInt();
			if(input<100 || input>999)
			{
				System.out.println("숫자가 올바르지 않습니다");
				continue;
			}
				user[0]=input/100;
				user[1]=(input%100)/10;
				user[2]=input%10;
			if(user[0]==user[1]||user[1]==user[2]||user[0]==user[2])
			{
				System.out.println("중복된 숫자가 있습니다");
				continue;
			}
			if(user[0]==0||user[1]==0||user[2]==0)
			{
				System.out.println("0을 포함 할 수 없습니다");
				continue;
			}
			for(int i=0;i<com.length;i++)
			{
				for(int j=0;j<com.length;j++)
				{
					if(user[i]==com[j])
					{
						if(i==j)
							s++;
						else
							b++;
					}
				}
			}
//			if(user[0]==com[0] && user[1]==com[1] && user[2]==com[2])
//			{
//				System.out.println("정답");
//				break;
//			}
//			System.out.println("s:"+s+"b:"+b);
			System.out.println("==========");
			System.out.print("S:");
			for(int i=0;i<s;i++)
			{
				System.out.print("●");
			}
			System.out.print("\nB:");
			for(int i=0;i<b;i++)
			{
				System.out.print("○");
			}
			System.out.println("\n==========");
			count++;
			if(s==3)
			{
				System.out.println("Game over!!");
				System.out.println(count+"회만에 정답");
				break;
			}
		}
	}
}
