/*
 *      자바 형식
 *      ------
 *        package 클래스의 위치 ==> 한번 사용
 *        import 외부 라이브러리 불러오기 ==> 여러번 사용이 가능
 *        public class ClassName
 *        {
 *            ------------------------------------
 *             멤버변수 
 *              = 인스턴트 변수 => new를 사용할때마다
 *              = 정적변수 (공유변수) => 메모리가 한개만 생성
 *            ------------------------------------
 *             생성자 : 메모리 할당시 호출되는 메소드
 *              	  = 멤버변수에 대한 초기화
 *            ------------------------------------
 *             메소드 : 특정 작업을 수행하는 명령문의 집합  *****
 *            ------------------------------------
 *             main() : 프로그램의 시작점 
 *            ------------------------------------
 *        }
 *        ===> OOP답게 변환 (객체지향 프로그램)
 *             1) 데이터 보호 (캡슐화)
 *             2) 재사용 (상속/포함)
 *             3) 수정 , 추가 (다형성) => 오버라이딩/오버로딩
 *        ===> 클래스의 종류 (추상클래스 / 인터페이스)
 *        ===> 예외처리
 *        ----------------------------------------- 자바언어의 기초
 *        ===> 라이브러리 : 사용자정의 , 자바에서 지원 , 외부업체 지원 (Jsoup)
 *        
 *        메소드 기초
 *        --------
 *        메소드 : 한개의 기능을 수행할 목적
 *               1. 메소드 제작 목적
 *                  -----------
 *                   = 재사용 (다른 클래스에서 사용하기 위해 만든다)
 *                   = 중복된 코드를 제거
 *                     예)
 *                        데이터베이스 연결
 *                        --------------------- 목록
 *                          ***오라클 연결
 *                          목록에 출력할 데이터를 읽기
 *                          ***오라클 닫기
 *                        --------------------- 데이터 추가
 *                          ***오라클 연결
 *                          데이터 추가
 *                          ***오라클 닫기
 *                        --------------------- 데이터 수정
 *                          ***오라클 연결
 *                          데이터 수정
 *                          ***오라클 닫기
 *                        --------------------- 데이터 삭제
 *                          ***오라클 연결
 *                          데이터 삭제
 *                          ***오라클 닫기                     *** 중복되는 코드를 메소드로 만들어 사용
 *                        ---------------------
 *                     = 구조화된 프로그램 = 단락을 나눠서 처리 (에러...)
 *               2. 메소드 형식
 *                  선언부
 *                  public static void main(String[] args)
 *                  구현부
 *                  {
 *                  
 *                  }
 *               3. 메소드 구성요소
 *                  결과값 메소드명(매개변수...)
 *                  ---- 1개    --------- 여러개 사용이 가능
 *                  
 *                  => 사용자의 요청값을 받아서 처리 결과값을 넘겨준다
 *                     ---------- 매개변수     ---- 리턴형
 *                     예) 로그인
 *                        사용자 요청값 : id,pwd
 *                        결과값 : 로그인여부(boolean)
 *                        boolean isLogin(String id, String pwd)
 *                        
 *                     예) +
 *                        사용자 요청값(매개변수) : 정수 2개
 *                        결과값 : 정수 2개를 더한값
 *               =>
 *               리턴형              매개변수
 *               ------------------------
 *                 o				 o
 *                 리턴형     메소드명(매개변수...)
 *                 String substring(int s,int e)
 *               ------------------------
 *                 o				 x
 *                 리턴형     메소드명()
 *                 String trim()
 *                 double random()
 *               ------------------------
 *                 x				 o
 *                 void     메소드명(매개변수...)
 *                 void main(String[] args)
 *                 void println(String a)
 *               ------------------------
 *                 x				 o
 *                 void     메소드명()
 *                 void println()
 *               ------------------------
 *               *** 결과값(처리) => 리턴형
 *               리턴형 : 기본형 , 배열 , 클래스
 *               메소드명 
 *                 = 알파벳이나 한글 사용이 가능 (알파벳은 대소문자를 구분)
 *                 = 숫자 사용이 가능 (앞에 사용 불가)
 *                 = 특수 문자 사용이 가능 ( _ , $ )
 *                 = 키워드는 사용할 수 없다
 *                 = 공백이 있으면 안된다
 *                 = 약속사항 => 소문자로 시작한다
 *                   => 두개의 단어가 연결 : 두번째 시작은 대문자 , _
 *                      fileName , file_name
 *               매개변수 : 사용자가 요청한 값
 * 					      게시판 글쓰기 , 수정 , 회원가입
 *                        *** 3개이상이면 => 배열, 클래스
 *               형식)
 *                 두개 정수를 보내주고 => 더한값을 받는다
 *                 int add(int a, intb) // 선언부
 *                 ---- 클수도 있다 double, float , long
 *                 {
 *                     //구현부
 *                     int c=a+b;
 *                     
 *                     return c;
 *                            -- 동일해야 한다
 *                 }
 *                 
 *                 void gugudan()
 *                 ---- 결과값이 없이 자체에서 출력
 *                 {
 *                     ------구구단을 출력
 *                     
 *                     return; ==> 메소드는 종료시점이 return에서 종료
 *                     => void일 때는 생략이 가능 => 생략을 하면 컴파일러가 자동으로 return을 추가한다 
 *                 }
 *                 ** 변수(20%) / 메소드(80%)
 *             ***메소드를 사용하는 방법
 *                = 프로그램
 *                  1. 재사용
 *                  2. 가독성 : 보기 편하다 (유지보수)
 *                  3. 반복 제거 : 소스량을 줄인다
 *                = 모든 프로그램 => 메소드 제작
 *                  1. 사용자 입력 
 *                  2. 사용자 요청 처리 => 세분화
 *                  3. 결과값 출력
 */
// 1. 3개의 정수를 받아서
// 2. 총점 , 평균 , 학점을 구해서 출력
/*
 *    메소드 호출 ==> 메소드명(매개변수값)만 호출한다
 *    --------
 *    리턴형이 있는 경우  ==========> 데이터형 변수명=메소드명()
 *    
 *    int add(int a, int b)
 *    {
 *       return a+b;
 *    }
 * 	  public static void main(String[] args)
 *    {
 *        int c=add(10,20)
 *                  |  |
 *                  a  b    ==> int c=30
 *    }
 *    boolean isLogin(String id,String pwd)
 *    -------
 *    {
 *    		return true;
 *    }
 *    
 *    boolean bCheck=isLogin("admin","1234")
 *    -------
 *    
 *    리턴형이 없는 경우 (void) ====> 메소드명()
 *    void gugudan()
 *    {
 *        ==구구단 출력
 *    }
 *    
 *    gugudan()
 *    
 *    => 메소드를 호출하면 메소드 전체를 수행하고 => 호출
 *    
 *    main()
 *    {
 *         1
 *         2
 *         3 ======= 수행
 *         gugudan() ===> 7 8 9 10 11
 *         4 ======= 수행 시작
 *         gugudan() ===> 7 8 9 10 11
 *         5
 *         6
 *    } =======> 1 2 3 7 8 9 10 11 4 7 8 9 10 11 5 6 종료
 *    void gugudan()
 *    {
 *         7
 *         8
 *         9
 *         10
 *         11
 *    }
 *    
 *    *** return은 항상 마지막에 있다
 *        중간에 있는 경우도 있다 (메소드가 중간에 종료)
 *    void find(String fd)
 *    {
 *       if(fd==null)
 *          return;
 *       --
 *       --
 *       --
 *       return;
 *    }
 *        	
 *     메소드
 *      1) 인스턴트 메소드 => 객체 생성시마다 따로 저장
 *         class A
 *         {
 *            void display(){}
 *         }
 *         A a=new A() => display()
 *         A b=new A() => display()
 *         A c=new A() => display()
 *      2) 정적 메소드 => 한개의 공간에만 저장 (JVM에 의해 메모리에 자동 저장)
 *         static 
 *      3) 추상 메소드 : 선언만 하는 메소드 (추상클래스 , 인터페이스)
 *         abstract
 *      4) 종단 메소드 : 수정이 불가능한 메소드
 *         final
 *
 *    
 */
import java.util.Scanner;
public class 클래스구성요소 {

	static int input(String subject)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(subject+" 점수입력:");
		int value=scan.nextInt();
		
		return value;
	}
	static int totalGesan(int kor,int eng, int math, int phy, int his)
	{
		return kor+eng+math+phy+his;
	}
	static double avgGesan(int total)
	{
		return total/5.0;
	}
	static char scoreGesan(double avg)
	{
		char score='A';
		switch((int)(avg/10))
		{
		case 10:
		case 9:
			score='A';
			break;
		case 8:
			score='B';
			break;
		case 7:
			score='C';
			break;
		case 6:
			score='D';
			break;
		default:
			score='F';
			break;
		}
		return score;
	}
	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("국어 점수입력:");
//		int kor=scan.nextInt();
//		
//		System.out.println("영어 점수입력:");
//		int eng=scan.nextInt();
//		
//		System.out.println("수학 점수입력:");
//		int math=scan.nextInt();
//		
//		System.out.println("국사 점수입력:");
//		int his=scan.nextInt();
//		
//		System.out.println("물리 점수입력:");
//		int phy=scan.nextInt();
		int kor=input("국어");
		int eng=input("영어");
		int math=input("수학");
		int his=input("국사");
		int phy=input("물리");
		System.out.println("국어 :"+kor);
		System.out.println("영어 :"+eng);
		System.out.println("수학 :"+math);
		System.out.println("국사 :"+his);
		System.out.println("물리 :"+phy);
		// 총점 계산
//		int total=kor+eng+math+his+phy;
		int total=totalGesan(kor,eng,math,phy,his);
		// int[]
		System.out.println("총점 :"+total);
//		double avg=total/5.0;
		double avg=avgGesan(total);
		System.out.printf("평균 :%.2f\n",avg);
		
		char score=scoreGesan(avg);
//		switch((int)(avg/10))
//		{
//		case 10:
//		case 9:
//			score='A';
//			break;
//		case 8:
//			score='B';
//			break;
//		case 7:
//			score='C';
//			break;
//		case 6:
//			score='D';
//			break;
//		default:
//			score='F';
//			break;
//		}
		System.out.println("학점 :"+score);
	}
}
