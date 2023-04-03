// 성적 계산
/*	
 * 	계절
 *  swith(month)
 *  case 3: case 4: case 5:
 *  	System.out.println("봄")
 *  	break;
 *  case 6: case 7: case 8:
 *  	System.out.println("여름")
 *  	break;
 *  case 9: case 10: case 11:
 *  	System.out.println("가을")
 *  	break;
 *  case 12: case 1: case 2:
 *  	System.out.println("겨울")
 *  	break;
 *  default:
 *  	System.out.println("잘못된 월 입니다.")
 *  
 *  
 */
import java.util.Scanner;
public class 선택문_2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("세개의 정수 입력(10 10 10):");
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		int avg=(kor+eng+math)/3;
		// case는 중복할 수 없다
		//학점출력
		char score='A';
		if(kor<=100 && eng>=0 && eng<=100 && math>=0 && math<=100 && kor>=0)
		{
			switch(avg/10)
			{
			case 10: //100
			case 9:  //99~90  => (avg/10)==10 || (avg/10)==9
				score='A';
				break;
			case 8:
				score='B';
				break;
			case 7:
				score='C';
				break;
			case 6:
				score='D';
				break;
			default:
				score='F';
			}	
			System.out.println("학점은: "+score);
		}
		else
			System.out.println("잘못된 점수 입니다.");
		
	}
}
