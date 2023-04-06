import java.util.Arrays;

/*
 *     배열 : 같은 데이터를 모아서 관리
 *           -------
 *     변수
 *           -------
 *             10  => a  ==> int a=10; (한개만 저장하는 공간)
 *           -------		 --------- 기본형 (자바에서 지원하는 데이터형)
 *     배열   => 연속적으로 메모리 배치 => 인덱스 번호를 이용한다
 *            arr[0]  arr[1]  arr[2]  arr[3]  arr[4]
 *           ---------------------------------------
 *           	1	|	2	|	3	|	4	|	5	
 *          |---------------------------------------
 *         arr
 *         
 *         int[] arr={1,2,3,4,5}
 *     자바의 메모리 구조
 *     ------------------------------------------
 *       Method Area => method , static
 *     ------------------------------------------
 *       Stack => 메모리 관리 (지역변수 , 매개변수)
 *       					-----
 *       					{}안에서만 사용이 가능
 *     ------------------------------------------
 *       Heap => 동적 메모리 할당 (new) => 배열 / 클래스
 *     ------------------------------------------
 *     
 *     1. 배열선언
 *        데이터형[] 배열명;
 *        데이터형 배열명[];
 *     2. 배열할당(연속적으로 몇개를 만들지 여부)
 *        데이터형[] 배열명 = new : 메모리를 만들어주고 다음에 만든 메모리의 주소값을 넘겨준다
 *        				 ---- malloc(size of(10)) => 승격이 되서 연산자가 됨
 *        				 delete
 *                            free() ---> 개발자가 사용을 잘 안함 => GC
 *                       GC => 사용하지 않거나 /null값일 경우 자동 회수
 *                       System.gc()
 *        데이터형 배열명[] = new 데이터형[크기]
 *        
 *        예)
 *           int[] arr=new int[5];
 *           --------- ----------
 *            Stack		  Heap ( 실제 데이터가 저장 )
 *           --------- ----------------------------
 *           arr
 *           -----		--[0]--[1]--[2]--[3]--[4]--
 *           0x100 -->	   0    0    0    0    0    
 *           -----	    |--------------------------
 *             |       0x100
 *             |
 *            new
 *            실제 저장된 데이터의 메모리 주소를 이용해서 데이터 관리 (참조변수)
 *            ==> 배열 / 클래스
 *        ** 변수 (변수, 배열, 클래스) => 초기화 후에 사용
 *               클래스(많이 사용) ==> 영화정보 , 회원 , 게시물 ....
 *               ------------
 *                ----------
 *                    10
 *                ----------
 *                   10.5
 *                ----------
 *                  "홍길동"
 *                ----------
 *               ------------
 *               다 변수지만 데이터가 여러개인지, 여러개의 묶음인지의 차이
 *               
 *        1. 인덱스를 이용하는 방법 => 초기화
 *           int[] arr=new int[3];
 *           arr[0]=10;
 *           arr[1]=20;
 *           arr[2]=30;
 *           
 *           --[0]--[1]--[2]--
 *              0    0    0
 *             10   20   30
 *           -----------------
 *        2. for문을 이용해서 초기화 => 인덱스 번호가 필요하기 떄문에 일반for문 for-each는 출력용을 사용
 *           for(int i=0;i=arr.length;i++)
 *           {
 *           	arr[i]=(i+1)*10;
 *           }
 *           --[0]--[1]--[2]--
 *              0    0    0
 *             10   20   30
 *           -----------------
 *        3. 선언과 동시에 초기화
 *           --------------
 *           영화 / 음악 ... (파일,오라클,크롤링)
 *           int[] arr={1,2,3,4,5}; =? [1,2,3,4,5](javascript)
 *           연산자 : == !=(java) , === !==(javascript) , =(오라클), EL      
 *           ------------------------------------------------------
 *           char[] c={'A','B'...}
 *           String[] s={"A","B"...} => 웹 (80%)
 *        4. 배열 => 고정
 *           배열 확장 ==> 새로운 배열을 만든다
 *           배열 복사
 *           ------
 *           얕은 복사 => 주소도 동일
 *           int[] arr={};
 *           int[] arr1=arr;
 *           깊은 복사 => 새로운 주소 만들어짐
 *           => arr2=arr1.clone();
 *           => System.arraycopy();
 *           => for문을 이용해서 데이터값만 새로운 배열에 넣기
 *           
 *     *** new를 이용하는 경우 => 기본 디폴트 값이 설정된다
 *     int[] 	 ===> 0
 *     char[] 	 ===> '\u0000'
 *     String[]	 ===> null (모든 클래스의 기본 디폴트는 null)
 *     			    						    ----- 메모리 주소가 없는 경우
 *     double[]  ===> 0.0
 *     boolean[] ===> false
 *     
 */
public class 배열응용_1 {
	public static void main(String[] args) {
		//char배열 선언 => 26개 ==> 초기값 => 'A'~'Z'
		char[] alpha=new char[26];
		char c='A';
		for(int i=0;i<alpha.length;i++)
		{
			alpha[i]=c++;
		}
		System.out.println(Arrays.toString(alpha));
		for(char cc:alpha) // 배열, 컬랙션
		{
			System.out.print(cc+" ");
		}
		
	}
}
