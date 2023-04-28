package com.sist.lib;
import java.util.*;
import java.net.URL;
import javax.lang.model.util.Elements;

/*
 * <div class="wrap_song_info">
   <div class="ellipsis rank01"><span>
 */
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
public class 라이브러리_Set_3 {
	public static Set genieMusic()
	{
		Set set=new HashSet();
		try
		{
			for(int i=1;i<=2;i++)
			{
				Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20230428&hh=11&rtm=Y&pg="+i).get();
				org.jsoup.select.Elements title=doc.select("table.list-wrap a.title");
				for(int j=0;j<title.size();j++)
				{
//					System.out.println(title.get(j).text());
					set.add(title.get(j).text());
				}
			}
		}
		catch(Exception ex) {}
		return set;
	}
	public static Set melonMusic()
	{
		Set set=new HashSet();
		try
		{
			Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			org.jsoup.select.Elements title=doc.select("div.wrap_song_info div.rank01 a");
//			System.out.println(title);
			for(int i=0;i<title.size();i++)
			{
//				System.out.println(title.get(i).text());
				set.add(title.get(i).text());
			}
		}
		catch(Exception ex) {}
		return set;
	}
	public static void main(String[] args) {
		// 지니뮤직 읽기
		Set genie=genieMusic();
		System.out.println(genie);
		// 멜론 읽기
		Set melon=melonMusic();
		System.out.print(melon);
		// 지니뮤직에만 있는 노래 찾기
//		genie.removeAll(melon); // 차집합
		// [1,2,3,4,5] - [1,2,3,6,7] => 4,5
//		System.out.println(genie);
//		for(Object obj:genie)
//		{
//			System.out.println(obj.toString());
//		}
		melon.retainAll(genie);
		System.out.println("멜론과 지니뮤직의 동일한 곡 : "+melon.size());
		for(Object obj:melon)
		{
			System.out.println(obj.toString());
		}
	}
}
