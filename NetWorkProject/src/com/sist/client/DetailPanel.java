package com.sist.client;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import com.sist.manager.*;

public class DetailPanel extends JPanel implements ActionListener{
	JLabel imgLa;
	JLabel la1,la2,la3;
	
	JButton b1,b2;
	JLabel titleLa,keyLa;
	JTextPane contentsTa;
	
	ControlPanel cp;
	public DetailPanel(ControlPanel cp)
	{
		this.cp=cp;
		imgLa=new JLabel();
		la1=new JLabel("이름");
		la2=new JLabel("소개/리뷰수");;
		b1=new JButton("뭘넣지");
		b2=new JButton("목록");
		titleLa=new JLabel("");
		contentsTa=new JTextPane();
		JScrollPane js=new JScrollPane(contentsTa);
		contentsTa.setEnabled(false);
		keyLa=new JLabel("");
		
		setLayout(null);
		imgLa.setBounds(200,15,530,350);
		la1.setBounds(100,375,200,40);
		titleLa.setBounds(175,375,760,40);
		
		la2.setBounds(100,425,200,120);
		js.setBounds(175,425,760,120);
		
		keyLa.setBounds(100,475,300,40);
		keyLa.setVisible(false);
		
		JPanel p=new JPanel();
		//p.add(b1);
		p.add(b2);
		p.setBounds(10,550,960,35);
		
		add(imgLa);
		add(keyLa);
		add(la1);add(titleLa);
		add(la2);add(js);
		add(p);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			try
			{
				Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe "
										+"http://youtube.com/embed/"
										+keyLa.getText());
			}
			catch(Exception ex) {}
		}
		else if(e.getSource()==b2)
		{
			cp.card.show(cp,"home");
		}
	}
}
