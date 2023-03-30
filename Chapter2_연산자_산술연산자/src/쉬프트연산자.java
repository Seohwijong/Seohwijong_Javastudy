// << , >>
/*
 *  비트의 방향이동
 *  
 *      10 << 2
 *     1010 => 101000
 *     => 101000 => 40
 *     => 1010 => 0을 뒤에 2개 채운다
 *       7<<3
 *      111 111000 => 56
 *    	 8<<2
 *     1000 100000 => 32
 *     x<<y => x*2^y
 *     -------------------
 *     9<<3 = 9*2^3 = 9*8
 *     ===================
 *      10>>2
 *      1010
 *        --제거 ==> 2
 *      15>>3	==> 1
 *      1111
 *       ---제거
 *       
 *      27>>3
 *      27/2^3 ==> 27/8 => 3
 *      
 *      x>>7 ==> x/2^y
 *      100>>3 ==> 100/8 => 12
 *      
 */
public class 쉬프트연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10<<2);
		System.out.println(7<<3);
		System.out.println(8<<2);
		System.out.println(15>>3);
	}

}
