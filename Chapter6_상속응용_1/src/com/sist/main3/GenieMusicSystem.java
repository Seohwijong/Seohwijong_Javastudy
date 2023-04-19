package com.sist.main3;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

import org.jsoup.Jsoup;

public class GenieMusicSystem {
	protected Music[] musics=new Music[50];  // 모든 사람에게 같은 내용을 공유 (static)
	protected String title="지니뮤직 Top50";
	// 1. 초기화
	/*
	 *   인스턴스 블록
	 *   static 블록 (*********) ******
	 *   ---------- 자동 호출
	 *   생성자 (*****)
	 *   
	 *   예외처리
	 *   -----
	 *     |
	 *    에러 => 소스상에서 처리할 수 없는 심각한 에러
	 *           메모리 공간 부족
	 *    예외 => 수정이 가능한 에러
	 *        => 예외복구 / 예외회피
	 *        => 비정상 종료를 방지하고 정상 수행이 가능하게...
	 *        => io , net , thread , web
	 *           --   ---   ------   ---     소스오류   한글변환오류
	 *                                => 404 500 403 412 400 ...
	 *                                   파일못찾음 접근권한없음 데이터오류(int => boolean)
	 *                       충돌     
	 *                IP/URL
	 *           io)파일 경로명,파일명
	 *        => 에러
	 *           사용자 입력
	 *           프로그래머의 실수   
	 *           
	 *           
	 *           
	 *           
	 */
	
	{
			try {
				Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
				// 문서저장공간 => HTML
//				System.out.println(doc.toString());
				/*
				 *  HTML => tag <> => Markup language
				 *  <a>값</a>
				 *  Element => tag
				 *  Elements => 같은 태그 여러개를 모아준것 => for문돌리기 편하다
				 */
				// 노래명  <table class="list-wrap">
				// 구분자 => 모든 태그 class (중복) /id(중복이 없다)
				// class => .   id => #
				Elements title=doc.select("table.list-wrap td.info a.title");
//				System.out.println(title);
				// 가수명
				Elements singer=doc.select("table.list-wrap td.info a.artist");
//				System.out.println(singer);
				// 앨범명
				Elements album=doc.select("table.list-wrap td.info a.albumtitle");
//				System.out.println(album);
				// 상태
				Elements etc=doc.select("table.list-wrap td.number span");
//				System.out.println(etc);
				// 등폭
				for(int i=0;i<title.size();i++)
				{
//					System.out.println("순위:"+(i+1));
//					System.out.println("노래명:"+title.get(i).text());
//					System.out.println("가수명:"+singer.get(i).text());
//					System.out.println("앨범명:"+album.get(i).text());
					String s=etc.get(i).text();
					String state="";
					String value="";
					if(s.equals("유지"))
					{
						state="유지";
						value="0";
					}
					// 2상승
					else
					{
						state=s.replaceAll("[0-9]", "");
						value=s.replaceAll("[가-힣]", "");
						/*
						 *   split
						 *   replaceAll
						 *   ----------- 정규식 (한글형태, 숫자형태 => 패턴)
						 *   [0-9] => 숫자 전체
						 *   [가-힣] => 한글 전체
						 *   [A-Za-z] => 알파벳 전체
						 */
					}
//					System.out.println("상태:"+state);
//					System.out.println("등폭:"+value);
//					System.out.println("=============================");
					
					musics[i]=new Music();
					musics[i].setRank(i+1);
					musics[i].setTitle(title.get(i).text());
					musics[i].setSinger(singer.get(i).text());
					musics[i].setAlbum(album.get(i).text());
					musics[i].setState(state);
					musics[i].setIdcrement(value);
				}
			} catch (Exception ex) {}
	}
	// 2. 기능 (어떤 기능) ==> 메소드
	public Music[] musicAllData()
	{
		return musics;
	}
	// 2-1. 목록 출력 => type=1 title , type=2 singer , type=3 album...
	public Music[] musicTitleFind(String fd,int type)
	{
		int i=0;
		for(Music m:musics)
		{
			boolean bCheck=false;
			if(type==1)
			{
				bCheck=m.getTitle().contains(fd);
				if(bCheck==true)
				i++;
			}
			else
			{
				bCheck=m.getSinger().contains(fd);
				if(bCheck==true)
				i++;
			}
			
		}
		System.out.println("i="+i);
		Music[] mm=new Music[i];
		/*
		 *  A a=new A();
		 *  A b=a;
		 */
		i=0;
		for(Music m:musics)
		{
			boolean bCheck=false;
			if(type==1)
			{
				bCheck=m.getTitle().contains(fd);
			
			}
			else
			{
				bCheck=m.getSinger().contains(fd);
			
			}
			if(bCheck==true)
			{
				mm[i]=m;
				i++;
				
			}
		}
		return mm;
	}
	/*
	 *    결과값을 전송 : 리턴형
	 *    자체 출력 : void
	 */
	// 2-2. 검색
	
	public static void main(String[] args) {
		GenieMusicSystem g=new GenieMusicSystem();
		Music[] aa=g.musicTitleFind("사",1);
		for(Music a:aa)
		{
			System.out.println(a.getSinger());
		}
			
	}
	
}
