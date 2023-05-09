package com.sist.client;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;

import java.util.List;
import java.io.*;
import java.net.*;
import java.security.MessageDigest;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

import com.sist.common.Function;
import com.sist.common.ImageChange;
import com.sist.manager.TravelSystem;
import com.sist.manager.TravelVO;

public class NetWorkMain extends JFrame implements ActionListener,Runnable,MouseListener{
	
	MenuPanel mp;
	ControlPanel cp;
	TopPanel tp;
	JButton b1,b2,b3,b4,b5,b6,b7;
	JLabel logo;
	Login login=new Login();
	int curpage=1;
	int totalpage=0;
	TravelSystem ts=new TravelSystem();
	Socket s;
	BufferedReader in;
	OutputStream out;
	String myId;
	int selectRow=-1;
	SendMessage sm=new SendMessage();
	RecvMessage rm=new RecvMessage();
	public NetWorkMain()
	{
		logo=new JLabel();
		Image img=ImageChange.getImage(new ImageIcon("c:\\javaDev\\logo.jpg"), 200, 130);
		
		logo.setIcon(new ImageIcon(img));
		mp=new MenuPanel();
		cp=new ControlPanel();
		tp=new TopPanel();
		
		setLayout(null); 
		
		logo.setBounds(10,15,200,130);
		mp.setBounds(215,15,955,130);
		cp.setBounds(10,150,960,600);
		tp.setBounds(980,150,200,600);
		
		b1=new JButton("홈");
		b2=new JButton("장소");
		b3=new JButton("엔터");
		b4=new JButton("숙박");
		b5=new JButton("검색");
		b6=new JButton("뉴스");
		b7=new JButton("채팅");
		
		mp.setLayout(new GridLayout(1,7,5,5));
		mp.add(b1);
		mp.add(b2);
		mp.add(b3);
		mp.add(b4);
		mp.add(b5);
		mp.add(b6);
		mp.add(b7);
		
		add(mp);
		add(cp);
		add(tp);
		add(logo);
		
		setSize(1200, 800);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("서울 여행지 추천 프로그램");
		
		b1.addActionListener(this); 
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		login.b1.addActionListener(this);
		login.b2.addActionListener(this);
		cp.cp.tf.addActionListener(this);
		List<TravelVO> list=ts.TravelListData(curpage);
		cp.hp.cardInit(list);
		cp.hp.cardPrint(list);
		totalpage=ts.TravelTotalPage();
		cp.hp.b1.addActionListener(this);
		cp.hp.b2.addActionListener(this);
		cp.hp.pageLa.setText(curpage+" page /"+totalpage+" pages");
		cp.cp.b1.addActionListener(this);
		cp.cp.b2.addActionListener(this);
		cp.cp.table.addMouseListener(this);
		TravelDisplay();
		
		sm.b1.addActionListener(this);
		sm.b2.addActionListener(this);
		rm.b1.addActionListener(this);
		rm.b2.addActionListener(this);
	}
	public static void main(String[] args) {
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
		}
		catch(Exception ex) {}
		new NetWorkMain();
	}
	public void TravelDisplay()
	{
		List<TravelVO> list=ts.TravelListData(curpage);
		cp.hp.cardInit(list);
		cp.hp.cardPrint(list);
		totalpage=ts.TravelTotalPage();
		cp.hp.pageLa.setText(curpage+" page /"+totalpage+" pages");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			curpage=1;
			TravelDisplay();
			cp.card.show(cp, "home");
		}
		else if(e.getSource()==b5)
		{
			cp.card.show(cp, "find");	
		}
		else if(e.getSource()==b7)
		{
			cp.card.show(cp, "chat");
		}
		else if(e.getSource()==b6)
		{
			cp.card.show(cp, "news");
		}
		else if(e.getSource()==b2)
		{
			cp.card.show(cp, "location");
		}
		else if(e.getSource()==b3)
		{
			cp.card.show(cp, "enter");
		}
		else if(e.getSource()==b4)
		{
			cp.card.show(cp, "acomm");
		}
		else if(e.getSource()==login.b1)
		{
			String id=login.tf1.getText();
			if(id.length()<1)
			{
				JOptionPane.showMessageDialog(this, "ID를 입력하세요");
				login.tf1.requestFocus();
				return;
			}
			String name=login.tf2.getText();
			if(name.length()<1)
			{
				JOptionPane.showMessageDialog(this, "이름을 입력하세요");
				login.tf1.requestFocus();
				return;
			}
			String sex="남자";
			if(login.rb1.isSelected())
			{
				sex="남자";
			}
			else
			{
				sex="여자";
			}
			
			try
			{
				s=new Socket("211.238.142.118",3456);
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				out=s.getOutputStream();
				out.write((Function.LOGIN+"|"+id+"|"+name+"|"+sex+"\n").getBytes());
			}
			catch(Exception ex) {}
			new Thread(this).start();
		}
		else if(e.getSource()==login.b2)
		{
			System.exit(0);
		}
		else if(e.getSource()==cp.cp.tf)
		{
			
			String msg=cp.cp.tf.getText();
			String color=cp.cp.box.getSelectedItem().toString();
			if(msg.length()<1) return;
			
			try
			{
				out.write((Function.CHAT+"|"+msg+"|"+color+"\n").getBytes());
			}
			catch(Exception ex) {}

			cp.cp.tf.setText("");
		}
		else if(e.getSource()==cp.hp.b1)
		{
			if(curpage>1)
			{
				curpage--;
				TravelDisplay();
			}
		}
		else if(e.getSource()==cp.hp.b2)
		{
			if(curpage<totalpage)
			{
				curpage++;
				TravelDisplay();
			}
		}
		else if(e.getSource()==cp.cp.b2)
		{
			if(selectRow==-1)
			{
				JOptionPane.showMessageDialog(this, "정보볼 대상을 선택하세요");
				return;
			}
			String youid=cp.cp.table.getValueAt(selectRow, 0).toString();
			try
			{
				out.write((Function.INFO+"|"+youid+"\n").getBytes());
			}
			catch(Exception ex) {}
		}
		else if(e.getSource()==cp.cp.b1)
		{
			sm.ta.setText("");
			String youid=cp.cp.table.getValueAt(selectRow, 0).toString();
			sm.tf.setText(youid);
			sm.setVisible(true);
		}
		else if(e.getSource()==sm.b2)
		{
			sm.setVisible(false);
		}
		else if(e.getSource()==rm.b2)
		{
			rm.setVisible(false);
		}
		else if(e.getSource()==sm.b1)
		{
			String youId=sm.tf.getText();
			String msg=sm.ta.getText();
			if(msg.length()<1)
			{
				sm.ta.requestFocus();
				return;
			}
			try
			{
				out.write((Function.MSGSEND+"|"+youId+"|"+msg+"\n").getBytes());
			}
			catch(Exception ex) {}
			sm.setVisible(false);
			
		}
		else if(e.getSource()==rm.b1)
		{
			sm.tf.setText(rm.tf.getText());
			sm.ta.setText("");
			sm.setVisible(true);
			rm.setVisible(false); 
		}
	}
	// 서버에서 결과값을 받아서 출력 => 쓰레드 (자동화)
	// member.jsp?id=aaa&pwd=1234&name=홍길동
	// 100
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			while(true)
			{
				String msg=in.readLine();
				StringTokenizer st=new StringTokenizer(msg,"|");
				int protocol=Integer.parseInt(st.nextToken());
				switch(protocol)
				{
				
					case Function.LOGIN:
					{
						String[] data= {st.nextToken(),st.nextToken(),st.nextToken()};
						cp.cp.model.addRow(data);
					}
					break;
					// C/S => 모든 명령이 서버로부터 받아서 처리
					// Mylog => 로그인 종료하고 창 띄우기
					case Function.MYLOG:
					{
						setTitle(st.nextToken());
						myId=st.nextToken();
						login.setVisible(false);
						setVisible(true);
					}
					break;
					case Function.CHAT:
					{
						cp.cp.initStyle();
						cp.cp.append(st.nextToken(), st.nextToken());
					}
					break;
					case Function.INFO:
					{
						String data="아이디:"+st.nextToken()+"\n"+"이름:"+st.nextToken()+"\n"+"성별"+st.nextToken();
						JOptionPane.showMessageDialog(this, data);
					}
					break;
					case Function.MSGSEND:
					{
						String id=st.nextToken();
						String strMsg=st.nextToken();
						rm.tf.setText(id);
						rm.ta.setText(strMsg);
						rm.setVisible(true);
						
					}
					
				}
			}
		}
		catch(Exception ex) {}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==cp.cp.table)
		{
//			if(e.getClickCount()==2)
//			{//////////////////////////////////////////////////////////////여기보기
				selectRow=cp.cp.table.getSelectedRow();
				String id=cp.cp.table.getValueAt(selectRow, 0).toString();
				JOptionPane.showMessageDialog(this, "선택된 ID:"+id);
				if(id.equals(myId))
				{
					cp.cp.b1.setEnabled(false);
					cp.cp.b2.setEnabled(false);
				}
				else
				{
					cp.cp.b1.setEnabled(true);
					cp.cp.b2.setEnabled(true);
					
				}
//			}
			
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
