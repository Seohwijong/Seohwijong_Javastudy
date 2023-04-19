package com.sist.main2;
// 포함
import javax.swing.*;
public class MyWindow2 {
	JFrame f=new JFrame(); // 상속 X / 클래스 안에 클래스 (포함클래스)
	public MyWindow2()
	{
		f.setSize(640,480);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyWindow2();
	}
}
