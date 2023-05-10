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
	ChatPanel cp=new ChatPanel();
	FindPanel fp=new FindPanel();
	CardLayout card=new CardLayout();
	DetailPanel dp;
	BoardListPanel bp;
	BoardInsertPanel ip;
	BoardDetailPanel bdp;
	BoardUpdatePanel bup;
	BoardDeletePanel bdelp;
	public ControlPanel()
	{
		
		hp=new HomePanel(this);
		dp=new DetailPanel(this);
		bp=new BoardListPanel(this);
		ip=new BoardInsertPanel(this);
		bdp=new BoardDetailPanel(this);
		bup=new BoardUpdatePanel(this);
    	bdelp=new BoardDeletePanel(this);
		setLayout(card);
		add("home",hp);
		add("location",lp);
		add("acomm",ap);
		add("enter",ep);
		add("news",np);
		add("chat",cp);
		add("find",fp);
		add("detail",dp);
		add("board",bp);
		add("insert",ip);
		add("bdp",bdp);
		add("bup",bup);
    	add("delete",bdelp);
	}

	
}
