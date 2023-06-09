/*
 *    반복문 : 유사한 내용이 여러번 반복할때 주로 사용
 *           영화목록 , 맛집목록 , 메인 화면... 상세보기 (if) 
 *           페이징
 *    종류 :
 *           반복횟수가 정해져 있는 경우 : for
 *           반복횟수가 정해지지 않은 경우 : while
 *           한번이상 수행이 가능 : do ~ while
 *           -----------------------------
 *           자바 :	출력, 제어 => for(2차, 중첩)
 *                	데이터베이스, 네트워크 while(1차)
 *    형식)
 *           for      ①    ②    ④  => 2번이 false면 종료/ 2번 true면 반복문장 수행
 *              for(초기값;조건식;증가식)
 *              {
 *              	반복 수행문장  ③
 *              }
 *           while ==> 증가전 검색
 *           -------------------------------
 *              초기값-----------------------①
 *              while(조건문)----------------② ====> 조건이 false면 수항을 못할 수도 있다
 *              {
 *                  반복문장 수행문장-----------③ ====> 2번이동 (true 수행, false 종료)
 *                  증가식  -----------------④
 *              }
 *           -------------------------------
 *           do~while ==> 증가후 검색
 *              초기값-----------------------①
 *              do
 *              {
 *                  반복 수행문장--------------②
 *                  증가식-------------------③
 *              }while(조건문);--------------④
 *           -------------------------------
 *           for=>2차
 *                
 */
public class 반복문_1 {
	public static void main(String[] args) {
//		String[] food= {
//				"버섯으로 관자 느낌 내는 방법! 새송이버섯간장버터구이 만들기",
//				"달콤 짭조름♡ 떡 베이컨 간장조림♡",
//				"비엔나 만두 강정",
//				"꿀마늘 닭강정(아이들 단골메뉴 찜♡♡)",
//				"등갈비김치찜 김치넣고 푹푹 익히기만 하세요 복잡한건 정말 싫으네요 (양념도 초심플)"
//		};
//		String[] chef= {
//				"루던",
//				"요블리",
//				"찌니훗",
//				"비바스밥",
//				"즐거운날랄라"
//		};
//		for(int i=0;i<5;i++)
//		{
//			System.out.println(food[i]+"("+chef[i]+")");
//		}
		/*
		 *          ①    ②    ④
		 *    for(초기값;조건식;증가식)
		 *    {
		 *        반복 수행문장 ③
		 *    }
		 *    
		 *    1-2-3-4
		 *      2-3-4
		 *      2-3-4
		 *      ...
		 *      2-3-4
		 *      --false면 종료
		 *      i=1 i<=10 true => i=2
		 *      --
		 *      --
		 *      --
		 *      i=10 i<=10 true => i=11
		 *      i=1 i<=10 false => 종료
		 *      {
		 *        --------
		 *      }// i는 여기까지 사용가능
		 *      => i를 사용하기 ==> int i=0;을 for문보다 위에서 선언
		 *      
		 *      int a=10l
		 *      if()
		 *      {
		 *          int b=10;
		 *          if()
		 *          {
		 *              int c=10;
		 *              if()
		 *              {
		 *                  int d=10;
		 *              }//d는 사라진다
		 *          }//c가 사라진다
		 *      }//b가 사라진다
		 *      ==> 지역전수(블록변수) => 스택 (메모리에 의해 자동 삭제)
		 */
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n====================================================");
		//A-Z까지 출력 ==> 문제 A를 26개 출력
//		for(char c='A';c<='Z';c++)
//		{
//			System.out.print(c+" ");
//		}
		char c='A';
		for(int i=0;i<26;i++)
		{
			System.out.print(c++ +" ");
		}
		System.out.println("\n====================================================");
		System.out.println("=======================while========================");
		/*
		 *      while => 형식
		 *      초기값 ------------①
		 *      while(조건식)------②
		 *      {
		 *          반복 수행문장 ---③
		 *          증가식 --------④
		 *      }
		 *      
		 *      1-2-3-4
		 *        2-3-4
		 *        2-3-4
		 *        --- ② false면 종료
		 *      => 무한루프 (네트워크 서버 , 데이터베이스 값 읽기 , 파일읽기)
		 *      => 파일읽기 => -1(EOF)
		 */
		// 1~10까지 출력
		int i=1; //초기값(시작점)
		while(i<=10)//조건식(종료점) => i가 10이되면 종료
		{
			System.out.print(i+" ");
			i++;//제어 1에서 10까지 ==>증가  (종료시까지 제어점)
		}
		System.out.println("\n====================================================");
		c='A'; //출력용
		i=0;
		while(i<26)
		{
			System.out.print(c++ + " ");
			i++;
		}
		System.out.println("\n====================================================");
		System.out.println("======================do~while======================");
		/*
		 *   do~while : 후조건 => 무조건 1번은 수행한다
		 *   형식)
		 *       초기값 -----------①
		 *       do
		 *       {
		 *           반복 실행문 ---②
		 *           증가식 -------③
		 *       }while(조건식) ---④ => true => 2번 이동
		 *                            false => 종료
		 *   int i=1;
		 *   do
		 *   {
		 *        System.out.print(i+" ");
		 *        => i=1 i=2 i=3...i=10
		 *        i++;
		 *        => i=2 i=3 i=4...i=11
		 *   }while(i<=10);        false => 종료
		 */
		i=1;
		do
		{
			System.out.print(i+" ");
			i++;
		}while(i<=10);
		System.out.println("\n====================================================");
		c='A';
		i=0;
		do
		{
			System.out.print(c++ +" ");
			i++;
			
		}while(i<26);
		
	}
}
