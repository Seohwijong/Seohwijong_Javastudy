// 3의배수, 5의배수, 7의 배수의 합 => 갯수

public class 반복문_3 {
	public static void main(String[] args) {
		int a3=0,a5=0,a7=0; //합
		int c3=0,c5=0,c7=0; //갯수
		
		int i=1; //초기값
		while(i<=100) //조건식
		{
			//중복적으로 수행 => 단일조건 , 중복이 없는 경우 => 다중 조건
			if(i%3==0)
			{
				a3+=i;
				c3++;
			}
			if(i%5==0)
			{
				a5+=i;
				c5++;
			}
			if(i%7==0)
			{
				a7+=i;
				c7++;
			}
			i++;//증가식
		}
		System.out.println("=============결과값============");
		System.out.println("1~100 사이의 3의 배수의 합:"+a3+", 갯수:"+c3);
		System.out.println("1~100 사이의 5의 배수의 합:"+a5+", 갯수:"+c5);
		System.out.println("1~100 사이의 7의 배수의 합:"+a7+", 갯수:"+c7);
		int min=c3, max=c3;
		if(max<c5)
			max=c5;
		if(max<c7)
			max=c7;
		if(min>c5)
			min=c5;
		if(min>c7)
			min=c7;
		System.out.println("가장 작은 갯수는 "+min);
		System.out.println("가장 많은 갯수는 "+max);
	}
}
