import java.util.Scanner;
// 가위바위보 game
/*
 *    컴퓨터
 *     가위(0)   사용자
 *            가위(0) 0 =>same
 *            바위(1) -1 => 사용자
 *            보(2) -2 => 컴퓨터
 *            
 *     바위(1)   사용자
 *            가위(0) 1 => 컴퓨터
 *            바위(1) 0 => same
 *            보(2) -1 => 사용자
 *     보(2)    사용자
 *            가위(0) 2 => 사용자
 *            바위(1) 1 => 컴퓨터
 *            보(2) -1 => 비김
 *     
 *     비기는 경우 : 0
 *     사용자		: -1,2
 *     컴퓨터		: -2,1
 */
public class 반복문_5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int win=0,lose=0,same=0;
		while(true) //무한루프 ==for(;;)
		{
			System.out.print("가위(0), 바위(1), 보(2),종료(9):");
			//컴퓨터 난수 발생
			int com=(int)(Math.random()*3);
			int user=scan.nextInt();
			
			if(user==9)
			{
				System.out.println("게임 종료.");
				//System.exit(0);
				break; //while 종료
			}
			//컴퓨터 , 사용자 가위바위보 출력
			
			if(com==0)
				System.out.println("컴퓨터:가위");
			else if(com==1)
				System.out.println("컴퓨터:바위");
			else
				System.out.println("컴퓨터:보");
			
			if(user==0)
				System.out.println("사용자:가위");
			else if(user==1)
				System.out.println("사용자:바위");
			else
				System.out.println("사용자:보");
			
			//결과값 출력
			switch(com-user)
			{
			case -1: case 2:
				System.out.println("사용자 win!!");
				win++;
				break;
			case 1: case -2:
				System.out.println("컴퓨터 win!!");
				lose++;
				break;
			case 0:
				System.out.println("비겼다!!");
				same++;
				break;
			}
		}// while 종료
		System.out.println("=========== 결과값 ===========");
		int total=win+lose+same;
		System.out.printf("%d전 %d승 %d패 %d무\n",total,win,lose,same);
	}
}
