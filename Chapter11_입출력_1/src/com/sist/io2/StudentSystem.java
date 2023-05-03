package com.sist.io2;
import java.util.*;
import java.io.*;
import java.nio.Buffer;
public class StudentSystem {
	// 모든 학생을 읽어서 메모리에 저장
	private static List<Student> stdList=new ArrayList<Student>();
	// 
	static
	{
		FileReader fr=null;
		try
		{
			fr=new FileReader("c:\\java_datas\\4.txt");
			StringBuffer sb=new StringBuffer();
			int i=0;
			while((i=fr.read())!=-1)
			{
				sb.append((char)i);
			}
			StringTokenizer st1 = new StringTokenizer(sb.toString(),"\n");
			String [] stds = new String[st1.countTokens()];
			for(int j=0 ;j < stds.length;j++) {
				stds[j] = st1.nextToken();
				System.out.println(stds[j]);
			}
			for(String ss:stds)
			{
				StringTokenizer st=new StringTokenizer(ss,"|");
				Student s=new Student();
				int hak = Integer.parseInt(st.nextToken());
				System.out.println(hak);
				s.setHakbun(hak);
				s.setName(st.nextToken());
				s.setKor(Integer.parseInt(st.nextToken()));
				s.setEng(Integer.parseInt(st.nextToken()));
				s.setMath(Integer.parseInt(st.nextToken()));
				int total=s.getKor()+s.getEng()+s.getMath();
				s.setTotal(total);
				s.setAvg(total/3.0);
				stdList.add(s);
			}
		}
		catch(Exception ex)
		{ 
			ex.printStackTrace(); // 에러 위치 확인
		}
		finally
		{
			try
			{
				fr.close();	
			}catch(Exception ex) {}
		}
	}
	public int menu()
	{
		System.out.println("========== 메뉴 ==========");
		System.out.println("1. 학생 목록");
		System.out.println("2. 학생 등록");
		System.out.println("3. 학생 수정");
		System.out.println("4. 학생 삭제");
		System.out.println("5. 프로그램 종료");
		System.out.println("=========================");
		int no=0;
		try
		{
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			// 키보드 읽기 => 예외처리 => Scanner 대체
			System.out.print("메뉴번호 입력:");
			String str=in.readLine();
			no=Integer.parseInt(str);
		}
		catch(Exception ex) {}
		return no;
	}
	public void process()
	{
		while(true)
		{
			int no=menu();
			if(no==5)
			{
				System.out.println("프로그램 종료");
				break;
			}
			else if(no==1)
			{
				// 목록
				for(Student ss:stdList)
				{
					System.out.println(
							ss.getHakbun()+" "
							+ss.getName()+" "
							+ss.getKor()+" "
							+ss.getEng()+" "
							+ss.getMath()+" "
							);
					
				}
				
			}
			else if(no==2)
			{
				// 등록
			}
			else if(no==3)
			{
				// 수정
			}
			else if(no==4)
			{
				// 삭제
				try
				{
					BufferedReader in=
							new BufferedReader(new InputStreamReader(System.in));
					System.out.print("학번 입력:");
					String hak=in.readLine();
					int i=0;
					for(Student ss:stdList)
					{
						if(ss.getHakbun()==Integer.parseInt(hak))
						{
							stdList.remove(i);
							break;
						}
						i++;
					}
					
				}
				catch(Exception ex) {}
			}
		}
	}
}
