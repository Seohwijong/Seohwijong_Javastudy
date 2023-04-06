import java.util.Scanner;

//
public class 배열응용_7 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("년도를 입력:");
		int year=scan.nextInt();
		
		System.out.println("월을 입력:");
		int month=scan.nextInt();
		
		System.out.println(year+"년"+month+"월");
		System.out.println("\n");
		char[] strWeek= {'일','월','화','수','목','금','토'};
		for(char c:strWeek)
		{
			System.out.print(c+"\t");
		}
		System.out.println();
		//1. 1년 1월 1일 ~전년 12월 31일
		int total=(year-1)*365
				+(year-1)/4
				-(year-1)/100
				+(year-1)/400;
		//2. 전달 까지 날수 20230331
		int[] lastday= {31,28,31,30,31,30
						,31,31,30,31,30,31};
		if((year%4==0&&year%100==0)||(year%400==0))
			lastday[1]=29;
		else
			lastday[1]=28;
		for(int i=0;i<month-1;i++)
		{
			total+=lastday[i];
		}
		total++;
		//3. +1--> 4/1일 요일
		int week=total%7;
		// 달력 출력
		for(int i=1;i<=lastday[month-1];i++)
		{
			if(i==1)
			{
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week>6)
			{
				System.out.println();
				week=0;
			}
		}
	}
}
