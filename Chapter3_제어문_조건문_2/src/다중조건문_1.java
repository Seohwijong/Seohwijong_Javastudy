/*
 *          Start    => 단일조건문 		if{					Start			if{
 *            |							true시 실행		  |					ture시 실행
 *          변수선언					  }		  			변수선언			  }
 *            | 			 (false)			 (true)   |  (false)	else{
 *           조건	--------------------				-----조건-----			 false시 실행
 *            |(true)			   |				|	  		|			}
 *          문장실행				   |			  문장실행		  문장실행
 *            |---------------------				|			|
 *           End 									-----End-----
 *           
 *           
 *          Start										4개의 문장중 하나만 수행
 *            |											if(조건문){
 *          변수선언										true=>종료 false=>다음조건
 *            | (false)   (false)   (false)				}else if{
 *           조건 -------조건-------조건-------문장수행		true=>종료 false=>다음조건
 *            |(true)   |(true)   |(true)	 |			}else if{
 *          문장실행    문장실행     문장실행		 |			true=>종료 false=>다음조건
 *            |         |         |          |			}else if{
 *            --------------------------------			true=>종료 false=>다음조건
 *            				|							}else
 *            			   End							true=>종료 false=>생략가능
 *            											
 *            선택문 switch ~ case
 *            반복문 for
 *            연산자 => 제어문 => 배열, 클라스
 *            				  ---------모아서 관리
 *            
 *            
 *            		데이터저장----------------한개저장:변수/상수----------------요청 결과 출력
 *            정수/실수/문자/문자열/논리	            |							|
 *            -------------------			 사용자 요청					Application
 *            관련된 데이터 여러개:배열				=>결과값을 추출					Web Application
 *            (같은데이터형만 저장 가능)			=>연산처리/제어(흐름)				Mobile Application
 *            클래스(다른 데이터형을 모아서 관리)		=>연산자/제어문
 *            ---------------------------------------------------------------------------
 *            									|
 *            Component : 클래스안에서 제작 => 재사용 목적   변경,추가 : 객체지향 : 최종목적=>유지보수
 *            
 *     다중조건문: 조건이 맞는 문장을 수행하고 종료 (한개의 문장만 수행)
 *     			=> 여러개를 수행 : 단일 조건문을 사용해야한다
 *     예) 1~100까지 숫자중에 3의 배수, 5의 배수, 7의 배수의 합을 출력한다.
 *     					 -----------------------단일 3개 사용
 *     
 *     형식)
 *         if(조건문)
 *         {
 *         		true일때 수행하는 문장 작성 ==> 종료
 *         			false
 *         }		  ↓-다음조건으로 넘어감
 *         else if(조건문)
 *         {
 *         		true일때 수행하는 문장 작성 ==> 종료
 *         			false
 *         }		  ↓-다음조건으로 넘어감
 *         else if(조건문)
 *         {
 *         		true일때 수행하는 문장 작성 ==> 종료
 *         			false
 *         }		  ↓-다음조건으로 넘어감
 *         else ==> 생략이 가능 (전체조건에 대해서 적용)
 *         {
 *         		해당 조건이 없는 경우에 처리되는 문장
 *         }
 *         
 *         사칙연산 ( + , - , * , / ) ==> %
 *         
 *         if()
 *         {
 *         }
 *         if()
 *         {
 *         }
 *         ---------------
 *         if()
 *         {
 *         }
 *         else ==> 이경우는 바로위의 if에만 적용
 *         {
 *         }
 *         ---------------
 *         
 *         
 *         
 */
// 사칙연산 ( + , - , * , / )
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class 다중조건문_1 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요:");
		int num1 = scan.nextInt();
		System.out.println("두번째 정수를 입력하세요:");
		int num2 = scan.nextInt();
		System.out.println("연산자를 입력하세요(+,-,*,/,):");
		char op = scan.next().charAt(0); // 문자열중에 첫번째에 있는 문자를 추출
		// +-*/ => charAt(1) => 맨앞이 0부터 시작 => 자바의 단점 : char는 받을 수 없다 (문자열)
		// 경우 + , - , * , / , 다른 문자 입력시(else)
		if (op == '+') 
		{
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
			System.out.printf("%d+%d=%d\n", num1, num2, num1 + num2);
		} else if (op == '-') 
		{
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
			System.out.printf("%d-%d=%d\n", num1, num2, num1 - num2);
		} else if (op == '*') 
		{
			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
			System.out.printf("%d*%d=%d\n", num1, num2, num1 * num2);
		} else if (op == '/') 
		{
			if (num2 == 0)
				System.out.println("0으로 나눌 수 없습니다.");
			else
				System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
			System.out.printf("%d/%d=%d\n", num1, num2, num1 / num2);
		} else 
		{
			System.out.println("잘못된 연사자입니다.");
		}

	}
}
