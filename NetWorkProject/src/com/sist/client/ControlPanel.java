package com.sist.client;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.*;
public class ControlPanel extends JPanel{
	NewsPanel np=new NewsPanel();
	HomePanel hp=new HomePanel();
	LocationPanel lp=new LocationPanel();
	AcommPanel ap=new AcommPanel();
	EnterPanel ep=new EnterPanel();
	ChatPanel cp=new ChatPanel();
	FindPanel fp=new FindPanel();
	CardLayout card=new CardLayout();
	public ControlPanel()
	{
		setLayout(card);
		add("home",hp);
		add("location",lp);
		add("acomm",ap);
		add("enter",ep);
		add("news",np);
		add("chat",cp);
		add("find",fp);
		
	}

	
}
