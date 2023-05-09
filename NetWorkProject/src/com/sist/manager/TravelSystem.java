package com.sist.manager;

import java.io.*;

import java.util.*;

import com.sist.manager.TravelVO;

public class TravelSystem {

	//데이터 읽기

	private static List<TravelVO> list=new ArrayList<TravelVO>();

	

	static

	{

		// 초기화 브럭

		FileInputStream fis=null;

		ObjectInputStream ois=null;

		try

		{

			fis=new FileInputStream("c:\\java_datas\\travel.txt");

			ois=new ObjectInputStream(fis); // 객체단위로 값 읽어오기
			
			list=(List<TravelVO>)ois.readObject();

		}catch(Exception ex)
		{

			ex.printStackTrace();

		}

		finally

		{

			try

			{

				fis.close();

				ois.close();

			}catch(Exception e) {}

		}

	}
	//데이터 20개씩 나눠서 전송
	public List<TravelVO> TravelListData(int page)
	{
		List<TravelVO> gList=
				new ArrayList<TravelVO>();
		int j=0;
		int rowSize=18;
		int start=(page-1)*rowSize;
		for(int i=0;i<list.size();i++)
		{
			if(j<rowSize && i>=start)
			{
				gList.add(list.get(i));
				j++;
			}
		}
		return gList;
	}
	public int TravelTotalPage() 
	{
		return (int)(Math.ceil(list.size()/18.0));
	}
	public List<TravelVO> TravelCastegoryData(int cno)
	{
		List<TravelVO> mList=new ArrayList<TravelVO>();
		for(TravelVO vo:list)
		{
			if(vo.getCno()==cno)
			{
				mList.add(vo);
				
			}
		}
		return mList;
	}
	public List<TravelVO> TravelFindData(String title)
	{
		List<TravelVO> mList=new ArrayList<TravelVO>();
		for(TravelVO vo:list)
		{
			if(vo.getTitle().contains(title))
			{
				mList.add(vo);
			}
		}
		return mList;
	}
	public TravelVO travelDetailData(String title)
	{
		TravelVO vo=new TravelVO();
		for(TravelVO tvo:list)
		{
			if(tvo.getTitle().equals(title))
			{
				vo=tvo;
				break;
			}
		}
		return vo;
	}
	public void TCastegoryData(int cno)

	{

		for(TravelVO vo:list)

		{

			if(vo.getCno()==cno)

			{

				System.out.println(vo.getNo()+"."+vo.getTitle());

			}

		}

	}

	public static void main(String[] args) {

		TravelSystem ts=new TravelSystem();

		try

		{

			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));

			System.out.println("(1page), (2page), (3page), (4page), (5page)");

			//페이지당 60개(명소:8개~호텔 8개 게스트하우스 12개)씩  5페이지

			String cno=in.readLine();

			ts.TravelCastegoryData(Integer.parseInt(cno));

		}catch(Exception ex) {}

	}

}