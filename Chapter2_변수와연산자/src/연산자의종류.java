/*
 * 		피연산자 / 연산자
 *  	----- 연산 대상
 *  
 *  	피연산자 1개 : 단항연산자
 *  	a++
 *  	피연산자 2개 : 이항연산자
 *  	10+20
 *  	-- --
 *  	피연산자 3개 : 상항연산자
 *  
 *  	1. 단항연산자
 *  		= 증감연산자 ( ++ , -- ) 한개 증가/ 한개 감소 => 반복문
 * 			  int a=10
 * 			  a++
 * 				=> 11
 * 			  b--
 * 				=> 9
 *  		= 부정연산자 (boolean만 사용이 가능) ! => 턴
 *  		  boolean b=true;
 *  		  !b;
 *  		  false
 *  		  ====> 예약가능한 날
 *  		= 형변환연산자 (데이터형)
 *  		  (int)10.5 => 소수점 제거 10
 *  		  (char)65 => 'A'
 *   		  ==================================== downcasting (강제형변환)
 *  		  (double)10 ==> 10.0
 *  		  (int)'A' ==> 65
 *  		  ==================================== upcasting (자동형변환)
 *  		= 반전연산자 (양수->음수) 음수표현 ~ (0을 제외하기때문에 1이 작아진다 ~10 = -11)
 *  
 *  		10.5+10=20.5 ==> 데이터형이 동일할때 연산이 가능
 *  			 --
 *  			10.0 ==> 20.5 (자동으로 바뀜 = 자동형변환)
 *  		
 *  		'A' + 10
 *  		===
 *  		65  + 10 ==> 75
 *  		
 *  		int이하의 데이터형은 연산시에 결과값이 int다
 *  		------ byte/short/char
 *  
 *  		int + double  => double
 *  		char + long	  => long
 *  		int + long	  => long
 *  		long + double => double
 *  
 *  		byte + char   => int
 *  
 *  
 *  		1. 단항연산자
 *  		   ++ : 1개 증가
 *  		   -- : 1개 감소
 *  		  
 *  		   형식
 *  			= 전치연산자 : 먼저 증가/감소 
 *  			  ++a
 *  			= 후치연산자 : 나중에 증가/감소
 *  			  a++
 *  
 *  			int a=10;
 *  			int b = ++a; // 증가후에 대입
 *  				 -- --
 *  					 1
 *					  2 ================> a=11, b=11
 *  			int a=10;
 *  			int b = a++; // 대입후에 증가
 *  				 --  --
 *  				  1
 *  					  2 ============> a=11, b=10
 *  			int a=10;
 *  			int b= a++ + ++a + a-- + --a;
 *  				  10       12  12      10
 *  
 *  		2. 부정연산자 (!) ==> true/false
 *  			!true => false
 *  			!false => true
 *  
 *  		== , !=  !(조건)
 *  
 *  
 *  		3. 형변환연산자
 *  		   10.5+10.5  ==> 21.0
 *  		   (int)10.5+(int)10.5 =>20
 *  		   --------- ---------
 *  			   10   +    10
 *  		   (int)(10.5+10.5)    =>21
 *  				-----------
 *  					21.0
 *  
 *  			double d=10; ==> 10.0
 *  			int a='A'; ==> 65
 *  			---------------------
 *  			int a=(int)10.5;
 *  
 *  			==> int이하 데이터형 연산시 => int
 *  				----- byte,short,char
 *  				char+double = double
 *  				char+char = int
 *  				char+byte = int
 *  			==> char는 연산이 되면 정수로 변경된다 ex) (int)'A'=65
 *  
 *  		4. 이항연산자
 *  		   -------
 *  			산술연산자 : + , - , * , / , %
 *  				=> + , - , * : 데이터형
 *  				=> +
 *  				   산술연산 , 문자열 결합
 *  				=> /
 *  				   정수/정수=정수 ==> 10/3 => 3
 *  				   정수/실수=실수 ==> 10/3.0 => 3.3333...
 *  				   0으로 나누면 오류발생
 *  				=> % (나머지 값)
 *  				   10%2 ==> 0
 *  				   11%2 ==> 1
 *  				   ------------
 * 						5%2=1
 * 						-5%2=-1
 * 						5%-2=1
 * 						-5%-2=-1
 * 					   ------------ 부호는 왼쪽편(앞쪽)을 따라간다
 *  			
 *  			******* +   10+9=19
 *  					+ : 문자열 결합
 *  				   
 *  					"7"+77  ==> "777"
 *  					7+"7"+7
 *  					----
 *  					"77"+7
 *  					------  ==> "777"
 *  					7+7+"7" ==> "147"
 *  					---
 *  					 14+"7" ==> "147"
 *  					7+"7"+7+7
 *  					----
 *  					"77" +7+7
 *  					------- "777"+7
 *  							------- "7777"
 *  					7+"7"+(7+7)
 *  						   ---- 14
 *  					"77"+14 ==>"7714"
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 * 
 *  
 */


public class 연산자의종류 {
	
	public static void main(String[] args) {
	
//		byte b=10;
//		char c='A';
//		int d=b+c;
//		byte b=10;
//		byte c=20;
//		int d=b+c;
//		System.out.println(~10);
//		int a=10;
//		int b=a++;
//		System.out.println("b\t"+b);
//		System.out.println("a\t"+a);
//		int a=10;
//		int b=++a;
//		System.out.println("b\t"+b);
//		System.out.println("a\t"+a);
//		int a=10;
//		int b=a++ + a++;
//		System.out.println("a\t"+a);
//		System.out.println("b\t"+b);
//		int a=10;
//		int b=++a + ++a;
//		System.out.println("a\t"+a);
//		System.out.println("b\t"+b);
//		int a=10;
//		int b=++a + a++;
//		System.out.println("a\t"+a);
//		System.out.println("b\t"+b);
//		int a=10;
//		int b=a++ + ++a;
//		System.out.println("a\t"+a);
//		System.out.println("b\t"+b);
//		int a=10;
//		int b=a++ + a++ + ++a + a++;
//		System.out.println("a\t"+a);
//		System.out.println("b\t"+b);
//		int a=10;
//		int b=a++ + a++ + a++ + a++;
//		System.out.println("a\t"+a);
//		System.out.println("b\t"+b);
//		int a=10;
//		int b=++a + ++a + ++a + ++a;
//		System.out.println("a\t"+a);
//		System.out.println("b\t"+b);
//		int a=10;
//		int b=a-- + a-- + --a;
//		System.out.println("a="+a);
//		System.out.println("b="+b);
//		boolean bCheck=false;
//		System.out.println(bCheck);
//		System.out.println(!bCheck);
		int a=(int)(Math.random()*100)+1;
		// 			=================
		//				0.0~0.99
		//	  =====
		//							  ===
		System.out.println(a);
		System.out.println(10/3);
		System.out.println(10/(double)3);
		System.out.println(10/3.0);
	}
}
