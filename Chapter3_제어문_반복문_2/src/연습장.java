import java.util.Scanner;
//숫자야구
public class 연습장 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=(int)(Math.random()*10000);
		int q1=a/1000;
		int w1=(a%1000)/100;
		int e1=(a%100)/10;
		int r1=a%10;
		int num=0;
			while(q1!=w1 && w1!=e1&&e1!=r1&&q1!=e1&&q1!=r1&&w1!=r1)
			{
				System.out.println("4자리수:");
				int b=scan.nextInt();
				int q2=b/1000;
				int w2=(b%1000)/100;
				int e2=(b%100)/10;
				int r2=b%10;
				String q3="";
				String w3="";
				String e3="";
				String r3="";
				num++;
				if(b==0)
					{
					System.out.println("종료\t"+"숫자:"+a);
					break;
					}
				if(q1==q2)
					q3="s";
				else if(q2==w1 || q2==e1 || q2==r1)
					q3="b";
				if(w1==w2)
					w3="s";
				else if(w2==q1 || w2==e1 || w2==r1)
					w3="b";
				if(e1==e2)
					e3="s";
				else if(e2==q1 || e2==w1 || q2==r1)
					e3="b";
				if(r1==r2)
					r3="s";
				else if(r2==q1 || r2==w1 || r2==e1)
					r3="b";
				if(a==b)
				{
					System.out.println("정답!"+a+"횟수:"+num);
					break;
				}	
				String cs=q3+w3+e3+r3;
				System.out.println(cs);
				continue;
			}

		
	}
}
