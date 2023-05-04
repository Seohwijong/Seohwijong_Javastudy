//package com.sist.temp;
//// 데이터 관리 메니저  , 윈도우 관리(모양) 클라이언트 , 서버관리 서버(채팅 쪽지...) ,
//import java.awt.*;
//import java.security.PublicKey;
//
//import javax.swing.*;
//
//public class NetWorkMain extends JFrame{
//	MenuPanel mp;
//	ControlPanel cp;
//	TopPanel tp;
//	JButton b1,b2,b3,b4,b5;
//	public NetWorkMain()
//	{
//		mp=new MenuPanel();
//		cp=new ControlPanel();
//		tp=new TopPanel();
//		
//		setLayout(null);
//		mp.setBounds(10,15,200,200);
//		cp.setBounds(220,15,750,730);
//		tp.setBounds(980,15,200,730);
//		
//		b1=new JButton("홈");
//		b2=new JButton("검색");
//		b3=new JButton("채팅");
//		b4=new JButton("뉴스검색");
//		b5=new JButton("커뮤니티");
//		mp.setLayout(new GridLayout(5,1,10,10));
//		mp.add(b1);
//		mp.add(b2);
//		mp.add(b3);
//		mp.add(b4);
//		mp.add(b5);
//		// 추가
//		add(mp);
//		add(cp);
//		add(tp);
//		
//		// 윈도우 크기
//		setSize(1200, 800);
//		setVisible(true);
//		//종료
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//	
//	}
//	public static void main(String[] args) {
//		try
//		{
////			UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
////			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
////			UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
////			UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
////			UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
////			UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
////			UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
////			UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
//			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
//			
//		}
//		catch(Exception ex) {}
//		new NetWorkMain();
//	}
//}
