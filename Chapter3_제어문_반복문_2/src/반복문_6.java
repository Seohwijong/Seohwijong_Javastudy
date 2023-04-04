// do~while => 후조건 무조건 1번 수행이 가능하다.
/*
 *     1. 초기화
 *     2. 게임
 *     3. 형식)
 *            초기값
 *            do
 *            {
 *                반복 실행문장
 *                증가식
 *            }while(조건식);  => 증가된 변수로 조건검색
 *            
 */
import java.util.Scanner;
public class 반복문_6 {
	public static void main(String[] args) {
		//1~10
		int i=1;
		do
		{
			System.out.print(i+" ");
			i++;// 조건검색 전 증가한다
		}while(i<=10); // i==11일때 끝난다
		System.out.println("\n====================");
		Scanner scan=new Scanner(System.in);
		System.out.print("단 입력:");
		int dan=scan.nextInt();
		i=1;
		do
		{
			System.out.printf("%2d * %2d = %2d\n",dan,i,dan*i);
			i++;	
		}while(i<=9);
		System.out.println("====================");
		i=10;
		System.out.println("========for=========");
		for(i=10;i<10;i++)
		{
			System.out.println("i="+i);
		}
		i=10;
		System.out.println("=======while========");
		while(i<10)
		{
			System.out.println("i="+i);
			i++;
		}
		System.out.println("======do~while======");
		i=10;
		do
		{
			System.out.println("i="+i);
			i++;
		}while(i<10);
	}
}
