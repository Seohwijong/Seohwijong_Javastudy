// ID/PWD를 받아서 로그인 처리
import java.util.Scanner;
/*
 *  리턴형은 경우수
 *  두개 => boolean
 *  세개 => int , String
 *         ID가 없는 경우 				   1 => NOID
 *         ID는 존재 Paswword가 틀리는 경우  2 => NOPWD
 *         ID , Paswword가 맞는경우  	   3 => LOGIN
 *         -------------------------------
 *         1. 재사용
 *         2. 견고 
 *         3. 가독성
 */
public class 메소드_2 {
	static String isLogin(String id,String pwd)
	{
		String[] ids= {"hong","park","shim","lee","kang"};
		String[] pwds= {"1234","3456","4567","5678","6789"};
		String[] names= {"홍길동","박문수","심청이","이순신","강감찬"};
		// 파일, 오라클 , 메모리에 저장(휘발성)

		//id 검색
		int index=0;
		boolean bCheck=false;
		for(int i=0;i<ids.length;i++)
		{
			if(id.equals(ids[i]))
			{
				bCheck=true;
				index=i;
				break;
			}
		}
		String result="";
		
		if(bCheck==true)
		{
			//ID가 존재
			//비밀번호 검색
			if(pwd.equals(pwds[index]))
			{
				result=names[index]; //로그인된 상태
			}
			else
			{
				result="NOPWD"; // 비밀번호가 틀리다
			}
		}
		else
		{
			//ID가 없는 상태
			result="NOID";
		}
		return result;
	}
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("ID 입력:");
		String id=scan.next();
		System.out.print("Password 입력:");
		String pwd=scan.next();
		String result=isLogin(id,pwd);
		if(result.equals("NOID"))
		{
			System.out.println("아이디가 존재하지 않습니다.");
		}
		else if(result.equals("NOPWD"))
		{
			System.out.println("비밀번호가 틀립니다.");
		}
		else
		{
			System.out.println(result+"님 로그인 되었습니다.");
		}

	}
	
	public static void main(String[] args) {
		process();
	}
}
