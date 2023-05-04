package com.sist.client;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Document;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;

public class ChatPanel extends JPanel {
	JTextPane pane;
	JTextField tf;
	JButton b1, b2;
	JTable table; // 화면 UI
	DefaultTableModel model; // 데이터 관리
	JComboBox<String> box;
	/*
	 *     화면관리 / 데이터관리를 따로하는 프로그램
	 *     ------   -------
	 *      View     Model  ==> 연결 (Controller)
	 *       MVC(Spring)
	 */
	public ChatPanel()
	{
		pane=new JTextPane();
		JScrollPane js1=new JScrollPane(pane);
		box=new JComboBox<String>();
		tf=new JTextField();
		box.addItem("black");
		box.addItem("blue");
		box.addItem("yellow");
		box.addItem("green");
		box.addItem("pink");
		box.addItem("orange");
		box.addItem("cyan");
		// 테이블
		String[] col= {"아이디","이름","성별"};
		String[][] row=new String[0][3];
		model=new DefaultTableModel(row,col);
		table=new JTable(model);
		JScrollPane js2=new JScrollPane(table);
		b1=new JButton("쪽지보내기");
		b2=new JButton("정보보기");
		JPanel p=new JPanel();
		p.add(b1);
		p.add(b2);
		
		// 배치
		setLayout(null);
		js1.setBounds(10,15,600,565); // 글
		tf.setBounds(10,580,480,30); // 채팅
		box.setBounds(490,580,120,30); // 색
		js2.setBounds(610,15,230,250); // 사람
		p.setBounds(610,270,230,35); // 버튼
		add(js1);
		add(tf);add(box);
		add(js2);
		add(p);
		String[] data= {"hong","홍길동","남자"};
		model.addRow(data);
		
	}
	public void initStyle()
	{
		Style green=pane.addStyle("green", null);
		StyleConstants.setForeground(green, Color.green);
		
		Style yellow=pane.addStyle("yellow", null);
		StyleConstants.setForeground(yellow, Color.yellow);
		
		Style blue=pane.addStyle("blue", null);
		StyleConstants.setForeground(blue, Color.blue);
		
		Style pink=pane.addStyle("pink", null);
		StyleConstants.setForeground(pink, Color.pink);
		
		Style cyan=pane.addStyle("cyan", null);
		StyleConstants.setForeground(cyan, Color.cyan);
		
		Style orange=pane.addStyle("orange", null);
		StyleConstants.setForeground(orange, Color.orange);
	}
	public void append(String msg,String color)
	{
		try
		{
			Document doc=pane.getDocument();
			doc.insertString(doc.getLength(), msg+"\n",pane.getStyle(color));
		}
		catch(Exception er) {}
	}
	
}
