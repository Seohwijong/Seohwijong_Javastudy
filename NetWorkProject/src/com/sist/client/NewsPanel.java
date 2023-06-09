package com.sist.client;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import com.sist.manager.NaverNewsManager;
import com.sist.manager.NewsVO;

import java.awt.event.*;
import java.util.List;
import java.util.*;

public class NewsPanel extends JPanel implements ActionListener{
	NewsCard[] cards=new NewsCard[5];
	JTextField tf;
	JButton b;
	JPanel pan;
	
	public NewsPanel()
	{
		
		tf=new JTextField();
		b=new JButton("검색");
		for(int i=0;i<cards.length;i++)
		{
			cards[i]=new NewsCard();
		}
		pan=new JPanel();
		pan.setLayout(new GridLayout(5,1,5,1));
		JScrollPane js=new JScrollPane(pan);
		setLayout(null);
		tf.setBounds(10,15,250,30);
		b.setBounds(265,15,100,30);
		js.setBounds(10,55,940,550);
		add(tf);
		add(b);
		add(js);
		
		tf.addActionListener(this);
		b.addActionListener(this);
		newsPrint("여행");
	}

	public void newsPrint(String fd)
	{
		List<NewsVO> list=NaverNewsManager.newsSearchData(fd);
		int i=0;
		for(NewsVO vo:list)
		{
			cards[i].titleLa.setText(vo.getTitle());
			cards[i].contentTa.setText(vo.getContent());
			cards[i].dateLa.setText(vo.getDate());
			pan.add(cards[i]);
			i++;
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==tf||e.getSource()==b)
		{
			String fd=tf.getText();
			if(fd.length()<1)
			{
				JOptionPane.showMessageDialog(this, "검색어 입력");
				tf.requestFocus();
				return;
			}
			newsPrint(fd);
//			List<NewsVO> list=NaverNewsManager.newsSerchData(fd);
//			int i=0;
//			for(NewsVO vo:list)
//			{
//				cards[i].titleLa.setText(vo.getTitle());
//				cards[i].contentTa.setText(vo.getContent());
//				cards[i].dateLa.setText(vo.getDate());
//				pan.add(cards[i]);
//				i++;
//			}
		}
	}
}
