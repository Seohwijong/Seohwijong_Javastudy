// 정수를 입력을 받아서 3의배수, 5의배수, 7의 배수인지 확인, 아닌경우에는 배수가 아니다 출력

public class 조건문_2 {
	public static void main(String[] args) {
		int num=(int)(Math.random()*100)+1;
//		int num=15;
		System.out.println("num="+num);
		if(num%3==0)
		{
			System.out.println(num+"는(은) 3의배수 입니다");
		}
		if(num%5==0)
		{
			System.out.println(num+"는(은) 5의배수 입니다");
		}
		if(num%7==0)
		{
			System.out.println(num+"는(은) 7의배수 입니다");
		}
		if(!(num%3==0 || num%5==0 || num%7==0))
		{
			System.out.println("해당 배수가 아닌 수 입니다");
		}
//		if(num%3==0)
//			System.out.println(num+"는(은) 3의배수 입니다");
//		else if(num%5==0)
//			System.out.println(num+"는(은) 5의배수 입니다");
//		else if(num%7==0)
//			System.out.println(num+"는(은) 7의배수 입니다");
//		//if(!(num%3==0 || num%5==0 || num%7==0))
//		else
//			System.out.println("해당 배수가 아닌 수 입니다");   //다중조건문은 한번에 하나만 수행하고 끝난다
	}
}
