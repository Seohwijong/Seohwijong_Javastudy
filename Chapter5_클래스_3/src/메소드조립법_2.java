import java.util.Calendar;
import java.util.Scanner;

// 달력
// 1. 년도 , 월 ==> 
// println(){!@#$%^&}
public class 메소드조립법_2 {
	static int input(String msg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+" 입력:");
		return scan.nextInt();
	}
	static int getweek(int year, int month)
	{
		
		int total=(year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400;
		int[] lastday= {31,28,31,30,31,30,31,31,30,31,30,31};
		if((year%4==0 && year%100!=0)||(year%400==0))
		{
			lastday[1]=29;
		}
		else
			lastday[1]=28;
		// 전달까지의 총날수
		for(int i=0;i<month-1;i++)
		{
			total+=lastday[i];
		}
		total++;
			int week=total%7;
			return week;
	}
	static void print(int month,int week)
	{
		int[] lastday= {31,28,31,30,31,30,31,31,30,31,30,31};
		String[] strWeek= {"일","월","화","수","목","금","토"};
		for(int i=0;i<strWeek.length;i++)
		{
			System.out.print(strWeek[i]+"\t");
		}
		System.out.println("\n");
		for(int i=1;i<=lastday[month-1];i++)
		{
			if(i==1)
			{
				for(int j=0;j<week;j++)
				System.out.print("\t");
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week>6)
			{
				week=0;
				System.out.println("\n");
			}
		}
	}
	static void process()
	{
		int year=input("년도");
		int month=input("월 ");
		int week=getweek(year,month);
		System.out.printf("%d년도 %d월\n",year,month);
		print(month,week);
	}
	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("년도 입력:");
//		int year=scan.nextInt();
//		
//		System.out.println("월 입력:");
//		int month=scan.nextInt();
//		/////////////////////////////사용자 입력 가능
//		int total=(year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400;
//		int[] lastday= {31,28,31,30,31,30,31,31,30,31,30,31};
//		if((year%4==0 && year%100!=0)||(year%400==0))
//		{
//			lastday[1]=29;
//		}
//		else
//			lastday[1]=28;
//		// 전달까지의 총날수
//		for(int i=0;i<month-1;i++)
//		{
//			total+=lastday[i];
//		}
//		// +1
//		total++; //매월 1일차
//		//======================================= %7 =>요일
//		// 요일 구하기
//		int week=total%7;
//		//////////////////////////////////////////////////////처리 과정
////		Calendar cal=Calendar.getInstance();
////		cal.set(Calendar.YEAR,year);
////		cal.set(Calendar.MONTH,month-1);
////		cal.set(Calendar.DATE,1);
////		int week1=cal.get(Calendar.DAY_OF_WEEK);
////		int last=cal.getActualMaximum(Calendar.DATE);
//		System.out.printf("%d년도 %d월\n",year,month);
//		String[] strWeek= {"일","월","화","수","목","금","토"};
//		for(int i=0;i<strWeek.length;i++)
//		{
//			System.out.print(strWeek[i]+"\t");
//		}
//		System.out.println("\n");
//		for(int i=1;i<=lastday[month-1];i++)
//		{
//			if(i==1)
//			{
//				for(int j=0;j<week;j++)
//				System.out.print("\t");
//			}
//			System.out.printf("%2d\t",i);
//			week++;
//			if(week>6)
//			{
//				week=0;
//				System.out.println("\n");
//			}
//		}

		process();
		
		
		
	}
}
