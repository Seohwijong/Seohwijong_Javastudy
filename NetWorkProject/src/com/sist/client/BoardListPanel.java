package com.sist.client;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import java.util.List;

import javax.swing.*;
import javax.swing.table.*;
import com.sist.manager.*;

import java.net.*;
import java.text.SimpleDateFormat;
public class BoardListPanel extends JPanel implements ActionListener,MouseListener{
	JTable table;
	DefaultTableModel model;
	JLabel pageLa,titleLa;
	JButton b1,b2,b3;
	int curpage=1;
	int totalpage=0;
	TableColumn column=new TableColumn();
	BoardManager bm=new BoardManager();
	ControlPanel cp;
	public BoardListPanel(ControlPanel cp)
	{
		this.cp=cp;
		b1=new JButton("글쓰기");
		b2=new JButton("이전");
		b3=new JButton("다음");
		pageLa=new JLabel("0 page / 0 pages");
		titleLa=new JLabel("자유게시판");
		titleLa.setFont(new Font("맑은 고딕",Font.BOLD,45));
		titleLa.setHorizontalAlignment(JLabel.CENTER);
		String[] col={"번호","제목","이름","작성일","조회수"};
		String[][] row=new String[0][5];
		model=new DefaultTableModel(row,col)
		{

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;//편집 방지 => 오버라이딩
				// 상속없이 오버라이딩 가능 => 익명의 클래스
			}
		};
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table);
		
		setLayout(null);
		titleLa.setBounds(10,15,940,60);
		add(titleLa);
		b1.setBounds(10,100,100,30);
		add(b1);
		js.setBounds(10,140,940,420);
		add(js);
		JPanel p=new JPanel();
		p.add(b2);
		p.add(pageLa);
		p.add(b3);
		p.setBounds(10,565,940,30);
		add(p);
		
		table.getColumn("번호").setPreferredWidth(30);
		table.getColumn("제목").setPreferredWidth(400);
		table.getColumn("이름").setPreferredWidth(100);
		table.getColumn("작성일").setPreferredWidth(150);
		table.getColumn("조회수").setPreferredWidth(30);
		table.getTableHeader().setReorderingAllowed(false);
		table.setShowVerticalLines(false);
		table.setRowHeight(45);
		for(int i=0;i<col.length;i++)
		{
			column=table.getColumnModel().getColumn(i);
			DefaultTableCellRenderer dt= new DefaultTableCellRenderer();
			if(i!=1)
			{
				dt.setHorizontalAlignment(JLabel.CENTER);
			}
			column.setCellRenderer(dt);
		}
		boardPrint();
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		table.addMouseListener(this);
	}
	public void boardPrint()
	{
		for(int i=model.getRowCount()-1;i>=0;i--)
		{
			model.removeRow(i);
		}
		List<BoardVO> list=bm.boardListData(curpage);
		totalpage=bm.boardTotalPage();
		pageLa.setText(curpage+" page / "+totalpage+" pages");
		
		for(int i=list.size()-1;i>=0;i--)
		{
			BoardVO vo=list.get(i);
			String[] data={String.valueOf(vo.getNo()),
							vo.getSubject(),
							vo.getName(),
							new SimpleDateFormat().format(vo.getRegdate()),
							String.valueOf(vo.getHit())};
			model.addRow(data);	
		}
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==table)
		{
			if(e.getClickCount()==2)
			{
				int row=table.getSelectedRow();
				String no=table.getValueAt(row, 0).toString();
				BoardVO vo=bm.boardDetailData(Integer.parseInt(no));
				cp.bdp.noLa.setText(String.valueOf(vo.getNo()));
				cp.bdp.nameLa.setText(vo.getName());
				cp.bdp.subLa.setText(vo.getSubject());
				cp.bdp.pane.setText(vo.getContent());
				cp.bdp.dateLa.setText(new SimpleDateFormat("yyyy-MM-dd").format(vo.getRegdate()));
				cp.bdp.hitLa.setText(String.valueOf(vo.getHit()));
				cp.card.show(cp, "bdp");
			}
			
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
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			cp.ip.tf1.setText("");
			cp.ip.tf2.setText("");
			cp.ip.ta.setText("");
			cp.ip.pf.setText("");
			cp.card.show(cp,"insert");
			
		}
	}
	
}
