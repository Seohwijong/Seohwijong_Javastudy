/*
 *        ★
 *        ★★
 *        ★★★
 *        ★★★★
 *        
 *        ★★★★
 *        ★★★
 *        ★★
 *        ★
 *        
 *        A
 *        BC
 *        DEF
 *        GHIJ
 *        
 *        A
 *        AB
 *        ABC
 *        ABCD
 *        
 *        #234
 *        1#34
 *        12#4
 *        123#
 *        
 *        ===> 정렬
 *        ===> 빈도 구하기
 *        ===> 등수 구하기
 *        ===> 마름모 / 나비 / 모래시계
 *           ★
 *          ★★
 *         ★★★
 *        ★★★★
 *        -----------
 *        i		k	j	i/k	   i/j
 *        줄수  공백  별표	i+k=4 i=j
 *        
 */
public class 중첩반복문_2 {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print("★");
			}
			System.out.println();
		}
		
		char c='A';
		
		for(int i=1;i<=4;i++)
		{
			for(char j=1;j<=i;j++)
			{
				System.out.print(c++);
			}
			System.out.println();
		}	
		for(int i=1;i<=4;i++)
		{
			c='A';
			for(char j=1;j<=i;j++)
			{
				System.out.print(c++);
			}
			System.out.println();
		}
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i==j)
					System.out.print("#");
				else
					System.out.print(j);
					
			}
			System.out.println();
		}
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("★");
			}
			System.out.println();
		}
	}
}
