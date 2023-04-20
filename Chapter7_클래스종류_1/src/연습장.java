/*
 * 배, 사과, 오렌지를 키우고 있는데 각 과일의 하루 생산량은 각각 5, 6, 7개
1)과수원에서 하루에 생산되는 과일의 총 갯수를 출력
2)시간당 과일의 생산 갯수를 출력

단, 과일의 갯수를 저장하는 변수는 int타입으로
하루에 생산되는 과일의 총 갯수를 저장하는 변수도 int타입으로
시간당 생산 갯수를 저장할 변수는 float타입으로 작성할 것.
 */
class  A
{
	int b=5;
	int s=6;
	int o=7;
}
class B extends A
{
	int total=b+s+o;
	float time=total/24f;
}

public class 연습장 {
	public static void main(String[] args) {
		B b=new B();
		System.out.println("하루 생산량:"+b.total);
		System.out.println("한시간 생산량:"+b.time);
	}
	
	
}
