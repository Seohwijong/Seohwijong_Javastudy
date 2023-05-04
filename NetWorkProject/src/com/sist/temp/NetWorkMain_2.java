//package com.sist.temp;
//
//import java.awt.GridLayout;
//import java.awt.Image;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.UIManager;
//
//import com.sist.common.ImageChange;
//
//public class NetWorkMain_2 extends JFrame implements ActionListener{
//	MenuPanel mp;
//	ControlPanel cp;
//	TopPanel tp;
//	JButton b1,b2,b3,b4,b5;
//	JLabel logo;
//	Login login=new Login();
//	public NetWorkMain_2()
//	{
//		logo=new JLabel();
//		Image img=ImageChange.getImage(new ImageIcon("c:\\javaDev\\logo.jpg"), 200, 130);
//		
//		logo.setIcon(new ImageIcon(img));
//		mp=new MenuPanel();
//		cp=new ControlPanel();
//		tp=new TopPanel();
//		
//		setLayout(null); 
//		logo.setBounds(10,15,200,130);
//		mp.setBounds(210,15,8000,100); // x  y   길이  높이
//		cp.setBounds(10,130,960,730);
//		tp.setBounds(980,75,200,730);
//		
//		b1=new JButton("홈");
//		b2=new JButton("검색");
//		b3=new JButton("채팅");
//		b4=new JButton("뉴스검색");
//		b5=new JButton("커뮤니티");
//		mp.setLayout(new GridLayout(1,5,10,10));
//		mp.add(b1);
//		mp.add(b2);
//		mp.add(b3);
//		mp.add(b4);
//		mp.add(b5);
//		// 추가
//		add(mp);
//		add(cp);
//		add(tp);
//		add(logo);
//		// 윈도우 크기
//		setSize(1200, 800);
////		setVisible(true);
//		//종료
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setTitle("서울 여행지 추천 프로그램");
//		// 이벤트 등록
//		b1.addActionListener(this); 
//		b2.addActionListener(this);
//		b3.addActionListener(this);
//		b4.addActionListener(this);
//		b5.addActionListener(this);
//		login.b1.addActionListener(this);
//		login.b2.addActionListener(this);
//		// 채팅
//		cp.cp.tf.addActionListener(this);
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
//		new NetWorkMain_2();
//		
//	}
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		if(e.getSource()==b1)
//		{
//			cp.card.show(cp, "home");
//		}
//		else if(e.getSource()==b2)
//		{
//			cp.card.show(cp, "find");	
//		}
//		else if(e.getSource()==b3)
//		{
//			cp.card.show(cp, "chat");
//		}
//		else if(e.getSource()==b4)
//		{
//			cp.card.show(cp, "news");
//		}
//		else if(e.getSource()==b5)
//		{
//			cp.card.show(cp, "recomm");
//		}
//		else if(e.getSource()==login.b1)
//		{
//			login.setVisible(false);
//			setVisible(true);
//		}
//		else if(e.getSource()==login.b2)
//		{
//			System.exit(0);
//		}
//		else if(e.getSource()==cp.cp.tf)
//		{
//			cp.cp.initStyle();
//			String msg=cp.cp.tf.getText();
//			String color=cp.cp.box.getSelectedItem().toString();
//			if(msg.length()<1) return;
//			
//			cp.cp.append(msg,color);
//			cp.cp.tf.setText("");
//		}
//	}
//}
