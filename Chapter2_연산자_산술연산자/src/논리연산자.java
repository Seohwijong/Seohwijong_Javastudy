// && , ||
/*
 *     (조건) && (조건)
 *     -----    ----
 *       |        |
 *       ----------
 *           |
 *          결과
 *      && =>  범위나 기간에 포함되는 경우
 *     --------------------------
 *     	true	true	=> true
 *     --------------------------
 *     	true	false	=> false
 *     --------------------------
 *     	false	true	=> false
 *     --------------------------
 *     	false	false	=> false
 *     --------------------------
 *     
 *      || =>  범위나 기간을 벗어난 경우 : 행사 
 *      --------------------------
 *     	true	true	=> true
 *     --------------------------
 *     	true	false	=> true
 *     --------------------------
 *     	false	true	=> true
 *     --------------------------
 *     	false	false	=> false
 *     --------------------------
 *     
 *     => 효율적 연산
 *        () && ()
 *        false --
 *        		연산x
 *        () || ()
 *        true	--
 *          	연산x
 *        
 *        int a=10;
 *        int b=9;
 *        
 *        (a<b) && ++b==a
 *        		   ------
 *        		   연산안해서 b=9
 *        
 *        
 */
public class 논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=10;
//		int b=9;
//		boolean bCheck= (a<b) && ++b==a;
//		System.out.println(bCheck);
//		System.out.println(b);
//		
//		bCheck= (a<b) || ++b==a;
//		System.out.println(bCheck);
//		System.out.println(b);
//		
//		bCheck= ++b==a && (a<b);
//		System.out.println(bCheck);
//		System.out.println(b);
//		
//		bCheck= ++b==a || (a<b);
//		System.out.println(bCheck);
//		System.out.println(b);
//		int a=100;
//		int b=99;
//		boolean bCheck= (a>b) && (b==a);
//		//				true	 false
//		System.out.println(bCheck);
//		bCheck= (a>b) || (b==a);
//		System.out.println(bCheck);
		
//		char c=(char)((Math.random()*26)+65);
//		boolean bCheck= c>='a' && c<='z';
//		System.out.println("c="+c);
//		System.out.println(bCheck);
		
//		char sex='M';
//		int score=87;
//		
//		boolean bCheck= (sex=='M' || score<=80);
//		//					true		true
//		System.out.println(bCheck);
		
//		int a=10;
//		boolean bCheck= a%2==0 || a<10;
//		System.out.println(bCheck);
		
		int year=2023;
		boolean bCheck=((year%4==0 && year%100!=0) || (year%400==0));
		
		System.out.println(bCheck);
		
	}

}
