/*
 * 문제4. 사용자로부터 세 개의 정수를 입력받아, 그 수들의 최대값과 최소값, 
         합계와 평균을 구해보자.

 */
import java.util.Scanner;
public class 문제_4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("세개의 정수를 입력(10 20 30):");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		int total=num1+num2+num3;
		double avg=total/3.0;
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
		System.out.println("num3="+num3);
		System.out.println("total="+total);
		System.out.printf("avg=%.2f\n",avg);
		
		int max=num1;
		if(max<num2)
			max=num2;
		if(max<num3)
			max=num3;
		System.out.println("최대값="+max);
		int min=num1;
		if(min>num2)
			min=num2;
		if(min>num3)
			min=num3;
		System.out.println("최소값="+min);
		
//		if(num1<num2 && num2<num3)
//			System.out.println("최소값="+num1+"최대값="+num3);
//		if(num1<num2 && num3<num2)
//		{
//			if(num1<num3)
//				System.out.println("최소값="+num1+"최대값="+num2);
//			else
//				System.out.println("최소값="+num3+"최대값="+num2);
//		}
//		if(num2<num1 && num1<num3)
//			System.out.println("최소값="+num2+"최대값="+num3);
//		if(num2<num1 && num3<num1)
//		{
//			if(num2<num3)
//				System.out.println("최소값="+num2+"최대값="+num1);
//			else
//				System.out.println("최소값="+num3+"최대값="+num1);
//		}
//		System.out.println("합계="+total);
//		System.out.printf("평균=%.2f\n",avg);
		
		
	}
}
