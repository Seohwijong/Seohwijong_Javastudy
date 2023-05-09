package com.sist.client;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.*;

import com.sist.temp.RecommendPanel;
public class ControlPanel extends JPanel{
	NewsPanel np=new NewsPanel();
	HomePanel hp;
	LocationPanel lp=new LocationPanel();
	AcommPanel ap=new AcommPanel();
	EnterPanel ep=new EnterPanel();
	RecommendPanel rp=new RecommendPanel();
	ChatPanel cp=new ChatPanel();
	FindPanel fp=new FindPanel();
	CardLayout card=new CardLayout();
	DetailPanel dp;
	public ControlPanel()
	{
		hp=new HomePanel(this);
		dp=new DetailPanel(this);
		setLayout(card);
		add("home",hp);
		add("location",lp);
		add("acomm",ap);
		add("enter",ep);
		add("news",np);
		add("chat",cp);
		add("find",fp);
		add("recomm",rp);
		add("detail",dp);
	}

	
}
