//문제6. 임의의 문자를 추출하여 대문자인지 소문자인지 확인하는 프로그램 작성

public class 문제_6 {
	public static void main(String[] args) {
		int num=(int)(Math.random()*2);
		char eng;
		if(num==0)
			eng=(char)((Math.random()*26)+65);
		else
			eng=(char)((Math.random()*26)+97);
		if(eng>='A' && eng<='Z')
			System.out.println(eng+"는(은) 대문자입니다.");
		else
			System.out.println(eng+"는(은) 소문자입니다.");
	}
}
