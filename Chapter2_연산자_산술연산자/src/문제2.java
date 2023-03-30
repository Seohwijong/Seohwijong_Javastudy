/*
 *  2.System.out.printf() => JDK 1.5 => C언어에서 도입 (printf())
 *    서식이 있는 출력
 *    
 *    %d => 정수값
 *    %f => 실수값
 *    %c => 문자
 *    %s => 문자열
 *    
 *    int a=10;
 * 
 * 	 + (산술, 문자열) =>
 *   / 0으로 나눌 수 없다, 정수/정수=정수
 *   % 왼쪽의 부호를 따라간다
 */
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		a= 6;
		b= 2;
		System.out.printf("덧셈 연산 결과:%d\n",a+b);
		System.out.printf("뺄셈 연산 결과:%d\n",a-b);
		System.out.printf("곱셈 연산 결과:%d\n",a*b);
		System.out.printf("나누기 연산 결과:%d\n",a/b);
		System.out.printf("나머지 연산 결과:%d\n",a%b);
		// 1.8 2.4 3.12 4.3 5.0 
	}

}
