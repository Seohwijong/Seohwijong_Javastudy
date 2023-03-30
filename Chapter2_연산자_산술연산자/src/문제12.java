/*
 *  1. 변수 : int a,b;
 *  2. 초기화 :Scanner
 *  3. 연산처리 a-b , a*b
 *  4. 결과 출력
 *  
 *  데이터 저장 ========> 데이터 가공(연산처리) =======> 결과값 출력
 *  	|					|연산자					System.out.println()
 *   1) 직접 값을 입력 int a=10;
 *   2) 사용자로 부터 입력을 받는다
 *   3) 난수
 *   -------------------메모리
 *   4) 파일에서 읽기
 *   5) 오라클에서 값 읽기
 *   -------------------영구적 저장장치
 */



import java.util.Scanner;
public class 문제12 {
	public static void main(String[] args) {
		// 사용자로부터 두 개의 정수를 입력 받아서 뺄셈과 곱셈 연산의 결과를 출력하는 프로그램을 작성
		Scanner scan1=new Scanner(System.in);
		System.out.print("정수입력:");
		int user1=scan1.nextInt();
		Scanner scan2=new Scanner(System.in);
		System.out.print("정수입력:");
		int user2=scan2.nextInt();

		System.out.println("뺄셈:"+(user1-user2));
		System.out.println("곱셈:"+(user1*user2));

//		Scanner scan=new Scanner(System.in);
//		System.out.println("정수 두개 입력(20 30):");  ===> 띄어쓰기로 입력시 두개 한번에 가능
//		int a=scan.nextInt();
//		int b=scan.nextInt();
//		System.out.println(a+""+b);
	}
}
