
public class 문제_2_2 {
	public static void main(String[] args) {
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(j==2)
					//i=1 j=1,2,3
					//i=2 j=1,2,3
					//i=3 j=1,2,3
					continue;
				System.out.println("i="+i+",j="+j);
			}
		}
	}
}
