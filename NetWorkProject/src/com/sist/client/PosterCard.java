package com.sist.client;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.net.*;

import com.sist.common.ImageChange;
import com.sist.manager.TravelVO;

public class PosterCard extends JPanel{
	JLabel poLa=new JLabel(); // 이미지 출력
	JLabel tLa=new JLabel(); // 제목 출력
	// 초기화
	public PosterCard(TravelVO vo)
	{
		setLayout(null);
		poLa.setBounds(5, 5, 120 , 110);
		tLa.setBounds(5, 120 , 120 , 15); 
		
		add(poLa);
		add(tLa);
		
		try
		{
			URL url=new URL(vo.getPoster());
			Image img=ImageChange.getImage(new ImageIcon(url), 150, 150);
			poLa.setIcon(new ImageIcon(img));
			tLa.setText(vo.getTitle());
		}
		catch(Exception ex) {}
	}
}
