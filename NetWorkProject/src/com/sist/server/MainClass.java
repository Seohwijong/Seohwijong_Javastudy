package com.sist.server;
/*
 *  Thread 사용 방법
 *  1) 클래스 상속을 받는 방법
 *     --------
 *     재정의 => 변경해서 사용
 *     class A extends Thread
 *     {
 *     }
 *  2) 인터페이스 상속을 받는 방법 ===> 윈도우에서 주로 사용
 *     -----------
 *     동작만 지정
 *     class A implements Runnable
 *     {
 *         public void run()
 *         {
 *         }
 *         run() 메소드는 쓰레드가 동작할 수 있게 제어
 *     }
 */
class MyThread extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(getName()+":"+i);
				Thread.sleep(100);
			}
		}
		catch(Exception ex) {}
	}
}
public class MainClass {

	public static void main(String[] args) {
		MyThread m1=new MyThread(); // Thread-0
		MyThread m2=new MyThread(); // Thread-1
		MyThread m3=new MyThread(); // Thread-2
		/*
		 *     JVM 역할
		 *     1) 이름 설정
		 *     2) 우선순위 결정
		 *        1~10
		 */
		System.out.println("m1=>"+m1.getName()+",우선순위:"+m1.getPriority());
		System.out.println("m2=>"+m2.getName()+",우선순위:"+m2.getPriority());
		System.out.println("m3=>"+m3.getName()+",우선순위:"+m3.getPriority());
		m1.start();
		m2.start();
		m3.start();
	}
}
