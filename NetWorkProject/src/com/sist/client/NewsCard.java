package com.sist.client;
import java.util.*;
import java.awt.*;
import javax.swing.*;
public class NewsCard extends JPanel {
	JLabel titleLa;
	JTextPane contentTa;
	JLabel dateLa;
	public NewsCard()
	{
		setLayout(null);
		titleLa=new JLabel("");
		contentTa=new JTextPane();
		contentTa.setEditable(false);
		JScrollPane js=new JScrollPane(contentTa);
		dateLa=new JLabel("");
		
		titleLa.setBounds(10,5,730,20);
		js.setBounds(10,30,910,50);
		dateLa.setBounds(850,5,100,20);
		
		add(titleLa);
		add(js);
		add(dateLa);
		
	}
}
