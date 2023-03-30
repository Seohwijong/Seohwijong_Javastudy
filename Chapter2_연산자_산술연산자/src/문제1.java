/*
 *  1. 메모리 저장
 *    int a;	int b;
 *    ------	------
 *    
 *    ------a   ------b
 *    
 *    ------	------
 *    
 *    ------	------ 4byte
 *      3		 a+5  => 8
 *    ------a   ------b
 * 
 * 
 * 
 * 
 * 
 */
public class 문제1 {
	public static void main(String[] args) {
		int a;
		int b;
		a=3;
		b=a+5;
		System.out.printf("a의 값:%d\n",a);
		System.out.printf("b의 값:%d\n",b);
		System.out.printf("a의 값:%d\nb의 값:%d",a,b);
		// a=3 b=8
	}
}
