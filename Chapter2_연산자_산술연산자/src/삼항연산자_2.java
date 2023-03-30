/*
 * 		컴퓨터 / 사용자 => 가위바위보
 * 		=> 가정 0-가위 , 1-바위 , 2-보
 */
// 컴퓨터 난수 (0~2)
// 사용자 입력
// 컴퓨터 / 사용자 확인
// 결과값 출력
import java.util.Scanner;
public class 삼항연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com=(int)(Math.random()*3);
		Scanner scan=new Scanner(System.in);
		System.out.print("가위(0),바위(1),보(2) 입력:");
		int user=scan.nextInt();
		// 확인
		System.out.print(com==0?"컴퓨터:가위":"");
		System.out.print(com==1?"컴퓨터:바위":"");
		System.out.println(com==2?"컴퓨터:보":"");
		
		System.out.print(user==0?"플레이어:가위":"");
		System.out.print(user==1?"플레이어:바위":"");
		System.out.println(user==2?"플레이어:보":"");

		System.out.println("======결과=====");
//		System.out.print(com==0 && user==0?"Same":"");
//		System.out.print(com==0 && user==1?"User win":"");
//		System.out.print(com==0 && user==2?"Com win":"");
//		
//		System.out.print(com==1 && user==0?"Com win":"");
//		System.out.print(com==1 && user==1?"Same":"");
//		System.out.print(com==1 && user==2?"User win":"");
//
//		System.out.print(com==2 && user==0?"User win":"");
//		System.out.print(com==2 && user==1?"Com win":"");
//		System.out.println(com==2 && user==2?"Same":"");
		/*
		 *  결과값
		 *  com
		 *  	0(가위)      user
		 *                 0(가위) => 비겼다
		 *                 1(바위) => user win
		 *                 2(보)	  => com win
		 *      1(바위)      user
		 *                 0(가위) => com win
		 *                 1(바위) => 비겼다
		 *                 2(보)	  => user win
		 *      2(보)       user
		 *                 0(가위) => user win
		 *                 1(바위) => com win
		 *                 2(보)	  => 비겼다
		 *                 
		 */
		int res=com-user;
		System.out.print(res==0?"same":"");
		System.out.print(res==-1||res==2?"User Win":"");
		System.out.println(res==1||res==-2?"Com Win":"");
		

			 

		
		
	}

}
