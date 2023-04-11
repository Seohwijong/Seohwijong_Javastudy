import java.util.Arrays;
import java.util.Scanner;

//1. 정수를 입력 받아서 이진법을 출력하는 메소드 작성(3개의 메소드)
//2. 임의의 정수를 배열로 생성해서 입력하고 정렬하는 프로그램 작성 
//3. 년도를 입력 받아 윤년여부를 확인하는 프로그램 작성


/*
 *    method => 140page
 *    1) 메소드 형식 => 기능처리
 *       --------
 *          웹 => 화면 변경
 *          ------------  메뉴 클릭 , 버튼 클릭 , 이미지 클릭...
 *          검색 , 글쓰기 , 수정 , 회원가입 , 회원탈퇴...
 *          사용자의 동작과 관련
 *          리턴형 메소드명(매개변수...) => 선언부
 *          {
 *              구현부
 *          }
 *          
 *      = 리턴타입 (리턴형)
 *        처리후 결과값 한개만 전송이 가능하다
 *        *** 여러개인 경우 : 배열 , 클래스
 *        *** 한개인 경우 : 일반 기본형 , String
 *        1) 결과값이 있는 경우
 *           리턴형 메소드명(매개변수...)
 *           ----
 *           {
 *              return 값; 일치 ==> 리턴형이 클수도 있다 
 *                     --
 *           }
 *           
 *           예)
 *              int method()
 *              {
 *                 return 10.5;   => 오류발생    (int)10.5처럼 변환해주면 괜찮다
 *              }
 *              
 *              ==> int a=method(); => a=10
 *              double method()
 *              {
 *                 return 10;     => 오류없음
 *              }
 *              ==> double d=method()
 *                  ==> 결과값을 받앗 ㅓ처리
 *              예) 오라클에서 데이터를 읽기
 *                 -----------------
 *                 => 브라우저로 보낸다
 *              => 자바 : 데이터관리
 *              => 자바스크립트 : 이벤트 처리 (브라우저)
 *                 NodeJS / ReactJS / VueJS / Redux / Vuex / TypeScript / Ajax / Jquery
 *              int[] method()
 *              {
 *                 int[] arr={10,20,30,40,50};
 *                 return arr; // 주소만 넘긴다 된다
 *              }
 *              String s=method()
 *        2) 결과값이 없는 경우
 *           void method()
 *           ----
 *           {
 *           	return; // apthem whdfy
 *           }
 *           void method()
 *           {
 *           	생략 => 컴파일러가 자동으로 추가 return
 *           }
 *           => import 추가
 *              import java.lang.*; => 자동 추가
 *                     System
 *                     String
 *                     Math
 *                     ---------
 *           ==> method()
 *      = 메소드명 => 식별자와 동일
 *                 길이에 제한이 없다 => 의미를 부여
 *                 aaa() , bbb() , ccc()
 *                 getName() , getTitle() , setName()...
 *      = 매개변수 : 사용자 요청값
 *      
 *      메소드 유형
 *      -------------
 *       리턴형  매개변수
 *         o	o
 *         o	x
 *         x	o
 *         x	x
 */
public class 문제_1 {
	static void process1()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int input=scan.nextInt();
		//while
		int[] binary=new int[16];
		int index=15;
		while(true)
		{
			binary[index]=input%2;
			input=input/2;
			if(input==0)
				break;
			index--;
		}
		for(int i=0;i<binary.length;i++)
		{
			if(i%4==0&&i!=0)
				System.out.print(" ");
			System.out.print(binary[i]);
		}
//		System.out.println(Integer.toBinaryString(input));
	}
	static void process2()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("앞 뒤 입력(1 2):");
		int n=scan.nextInt();
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				
				
					boolean bCheck=false;
					if(n==1)
					{
						bCheck=arr[i]>arr[j];
					}
					else
						bCheck=arr[i]<arr[j];
					if(bCheck)
					{	
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
	static void process3()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		int year=scan.nextInt();
		if((year%4==0&&year%100!=0)||(year%400==0))
		{
			System.out.println(year+"년은 윤년입니다");
		}
		else
			System.out.println(year+"년은 윤년이 아닙니다");
	}
	public static void main(String[] args) {
		process1();
		System.out.println(" ");
		process2();
		process3();
	}
}
