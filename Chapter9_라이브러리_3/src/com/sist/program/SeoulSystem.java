package com.sist.program;
import java.io.FileReader;
// VO => DAO => 전송 => 관련된 데이터는 무조건 묶어서 보낸다 (VO)
import java.util.*;

import javax.annotation.processing.Filer;
public class SeoulSystem {
	private static SeoulLocationVO[] datas=new SeoulLocationVO[273];
	// 모든 사용자가 데이터를 공통으로 사용
	private int curpage; // 프로그램 종료시까지 유지
	private int totalpage;
	static
	{
		// 데이터를 읽어서 메모리에 저장 => 초기화 공간
		try
		{
			StringBuffer sb=new StringBuffer();
			int i=0;
			FileReader fr=new FileReader("C:\\javaDev\\seoul_location.txt");
			while((i=fr.read())!=-1)
			{
				sb.append(String.valueOf((char)i));
			}
			fr.close();
//			System.out.println(sb.toString());
			String[] locations=sb.toString().split("\n");
			int k=0;
			for(String s:locations)
			{
//				System.out.println(s);
				StringTokenizer st=new StringTokenizer(s,"|");
				datas[k]=new SeoulLocationVO();
				datas[k].setNo(Integer.parseInt(st.nextToken()));
				datas[k].setName(st.nextToken());
				datas[k].setContent(st.nextToken());
				datas[k].setAddress(st.nextToken());
				k++;
			}
		}
		catch(Exception ex) {}
	}
	// 페이지별 데이터 출력
	public SeoulLocationVO[] seoulList(int page)
	{
		Scanner scan=new Scanner(System.in);
		SeoulLocationVO[] data=new SeoulLocationVO[10];
		int j=0; // 10개씩 나눠주는 변수
		int start=(page*10)-10; // 시작점 (for)
		/*
		 *   1page => 0~9
		 *   2page => 10~19
		 *   3page => 20~29
		 *   ...
		 */
		int k=0;
		for(int i=0;i<datas.length;i++)
		{
			if(j<10 && i>=start)
			{
				data[k]=datas[i];
				k++;
				j++;
			}
		}
		return data;
		
		
	}
	public int seoulTotalPage()
	{
		return (int)(Math.ceil(datas.length/10.0)); 
		//           -----------------------------27.3 => ceil(올림) => 28
	}
	// 메뉴
	public int menu()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("============ 메뉴 ============");
		System.out.println("1. 목록출력(페이지별)");
		System.out.println("2. 상세보기");
		System.out.println("3. 명소 검색");
		System.out.println("4. 주소 검색");
		System.out.println("9. 종료");
		System.out.println("=============================");
		System.out.print("메뉴선택:");
		return scan.nextInt();
	}
	// 검색 => 이름
	public SeoulLocationVO[] nameFind(String fd)
	{
		int count=0;
		for(SeoulLocationVO vo:datas)
		{
			if(vo.getName().contains(fd))
			{
				count++;
			}
		}
		// 고정 => 가변 (Collection)
		SeoulLocationVO[] seoul=new SeoulLocationVO[count];
		int i=0;
		for(SeoulLocationVO vo:datas)
		{
			if(vo.getName().contains(fd))
			{
				seoul[i]=vo;
				i++;
			}
		}
		return seoul;
	}
	// 주소 검색
	public SeoulLocationVO[] addressFind(String addr)
	{
		int count=0;
		for(SeoulLocationVO vo:datas)
		{
			if(vo.getAddress().contains(addr))
			{
				count++;
			}
		}
		// 고정 => 가변 (Collection)
		SeoulLocationVO[] seoul=new SeoulLocationVO[count];
		int i=0;
		for(SeoulLocationVO vo:datas)
		{
			if(vo.getAddress().contains(addr))
			{
				seoul[i]=vo;
				i++;
			}
		}
		return seoul;
	}
	// 상세보기
	
	public void process()
	{
		System.out.println("★★★★★★★★★★★ SITS 영화 ★★★★★★★★★★★");
		while(true)
		{
			int menu=menu();
			if(menu==9)
			{
				System.out.println("프로그램 종료");
				break;
			}
			else if(menu==3)
			{
				Scanner scan=new Scanner(System.in);
				System.out.print("검색어 입력:");
				String name=scan.next();
				SeoulLocationVO[] data=nameFind(name);
				System.out.println("=============================");
				System.out.println(name+" 검색은 총"+data.length+"건 입니다");
				for(SeoulLocationVO vo:data)
				{
					System.out.println(vo.getNo()+"."+vo.getName());
				}
				
			}
			else if(menu==4)
			{
				Scanner scan=new Scanner(System.in);
				System.out.print("주소 입력:");
				String addr=scan.next();
				SeoulLocationVO[] data=addressFind(addr);
				System.out.println("=============================");
				System.out.println(addr+" 검색은 총"+data.length+"건 입니다");
				for(SeoulLocationVO vo:data)
				{
					System.out.println(vo.getNo()+"."+vo.getAddress());
				}
				
			}
			else if(menu==1)
			{
				Scanner scan=new Scanner(System.in);
				while(true)
				{
					System.out.print("페이지 입력(1~28):");
					curpage=scan.nextInt();
					if(curpage<1||curpage>28)
					{
						System.out.println("=============================");
						System.out.println("없는 페이지입니다");
						System.out.println("=============================");
						continue;
					}
					break;
				}
				totalpage=seoulTotalPage();
				System.out.println("=============================");
				System.out.println(curpage+" page / "+totalpage+" pages");
				System.out.println("=============================");
				SeoulLocationVO[] data=seoulList(curpage);
				
				for(SeoulLocationVO vo:data)
				{
					if(vo!=null)
					{
						System.out.println(vo.getNo()+"."+vo.getName());
					}
				}
			}
			else if(menu==2)
			{
				int no;
				Scanner scan=new Scanner(System.in);
				while(true)
				{
					System.out.print("상세볼 명소 번호 입력(1~273):");
					no=scan.nextInt();
				
					if(no<1||no>273)
					{
						System.out.println("=============================");
						System.out.println("없는 번호 입니다.");
						System.out.println("=============================");
						continue;
					}
					break;
				}
				System.out.println("번호:"+datas[no-1].getNo());
				System.out.println("명소:"+datas[no-1].getName());
				System.out.println("주소:"+datas[no-1].getAddress());
				System.out.println("설명:"+datas[no-1].getContent());
			}
		}
	}
//	public static void main(String[] args) {
//		SeoulSystem ss=new SeoulSystem();
//		for(SeoulLocationVO vo:datas)
//		{
//			System.out.println(vo.getNo());
//			System.out.println(vo.getName());
//			System.out.println(vo.getContent());
//			System.out.println(vo.getAddress());
//			System.out.println("==========================================================");
//		}
//	}
	
}
