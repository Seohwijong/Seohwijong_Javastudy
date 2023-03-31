/*
 *     Start				 									Start
 *       |                  									  |
 *     문장(명령문)       -      int a=10;							문장(명령문)
 *     	 |														  |
 *     조건(조건문)       -      a<10;								조건(명령문)
 *     	 |														|	   |
 *     문장(명령문)       -      System.out.println(a)		  if(true)    else(false)
 *     	 |												  문장(명령문)	  문장(명령문)
 *     End(평문)												    \	   /
 *     															End(평문)
 * 
 * 		=> 로그인 여부
 *      => 아이디 중복체크
 *      => 메뉴 => 관리자 로그인 / 사용자 로그인
 *      => 로그인 처리를 했는지 여부
 *      -------------------------------------
 */
//import java.util.Scanner;
// => 알파벳을 받아서 소문자, 대문자
public class 선택조건문_1 {
	public static void main(String[] args) {
		int no=(int)(Math.random()*2); //0,1
		char ch;
		if(no==0)
			ch=(char)((Math.random()*26)+65);
		else
			ch=(char)((Math.random()*26)+97);
		if(ch>='A' && ch<='Z')
			System.out.println(ch+"는(은) 대문자 입니다!!");
		else
			System.out.println(ch+"는(은) 소문자 입니다!!");
	}
}
