/*
 * 중첩 switch
 * 
 *    if문 중첩
 *    if()
 *    {
 *    	if()
 *    	{
 *    	
 *    	}
 *    }

 *    // 특별한 경우가 아니면 거의 사용빈도가 없다
 *    switch()
 *    {
 *    	case값:
 *    		switch()
 *    		{
 *    		
 *    		}
 *    }
 */
//가위바위보
import java.util.Scanner;
public class 선택문_4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("가위 바위 보 입력:");
		String rps=scan.nextLine();
		System.out.println(rps);
		int com=(int)(Math.random()*3);
		String rps2=" ";
		if(com==1)
		{
			rps2="가위";
		}
		else if(com==2)
		{
			rps2="바위";
		}
		else
		{
			rps2="보";
		}
			
		switch(rps)
		{
		case"가위":
			switch(rps2)
			{
			case"가위":
				System.out.println("User: "+rps+"\nCom: "+rps2+"\n비김");
				break;
			case"바위":
				System.out.println("User: "+rps+"\nCom: "+rps2+"\nCom win");
				break;
			case"보":
				System.out.println("User: "+rps+"\nCom: "+rps2+"\nUser win");
				break;
			}
			break;
		case"바위":
			switch(rps2)
			{
			case"가위":
				System.out.println("User: "+rps+"\nCom: "+rps2+"\nUser win");
				break;
			case"바위":
				System.out.println("User: "+rps+"\nCom: "+rps2+"\n비김");
				break;
			case"보":
				System.out.println("User: "+rps+"\nCom: "+rps2+"\nCom win");
				break;
			}
			break;
		case"보":
			switch(rps2)
			{
			case"가위":
				System.out.println("User: "+rps+"\nCom: "+rps2+"\nCom win");
				break;
			case"바위":
				System.out.println("User: "+rps+"\nCom: "+rps2+"\nUser win");
				break;
			case"보":
				System.out.println("User: "+rps+"\nCom: "+rps2+"\n비김");
				break;
			}
			break;
		}
	}
}
