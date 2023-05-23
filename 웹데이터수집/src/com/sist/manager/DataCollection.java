package com.sist.manager;
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.sist.dao.*;
import com.sist.vo.*;
public class DataCollection {
	public void foodCategoryData()
	{
		// 오라클에 추가
		FoodDAO dao=FoodDAO.newInstance();
		try
		{
			// 사이트 연결
			Document doc=Jsoup.connect("https://www.mangoplate.com/").get();
			Elements title=doc.select("div.info_inner_wrap span.title"); // 30개
			Elements subject=doc.select("div.info_inner_wrap p.desc "); // 30개
			Elements poster=doc.select("ul.list-toplist-slider img.center-croping"); // 30개
			Elements link=doc.select("ul.list-toplist-slider a"); // 30개
//			System.out.println(title.toString());
//			System.out.println("=======================================");
//			System.out.println(subject.toString());
//			System.out.println("=======================================");
//			System.out.println(poster.toString());
//			System.out.println("=======================================");
//			System.out.println(link.toString());
			for(int i=0;i<title.size();i++)
			{
				System.out.println(title.get(i).text());
				System.out.println(subject.get(i).text());
				System.out.println(poster.get(i).attr("data-lazy"));
				System.out.println(link.get(i).attr("href"));
				System.out.println("============================================");
				CategoryVO vo=new CategoryVO();
				vo.setTitle(title.get(i).text());
				vo.setSubject(subject.get(i).text());
				vo.setLink(link.get(i).attr("href"));
				String p=poster.get(i).attr("data-lazy");
				p=p.replace("&", "#");
				vo.setPoster(p);
				dao.foodCategoryInsert(vo);
				/*
				 * https://mp-seoul-image-production-s3.mangoplate.com/keyword_search/meta/pictures/kcrp8ki93zu6m6cf.jpg
				 * ?fit=around|600:400&crop=600:400;*,*&output-format=jpg&output-quality=80
				 * 
				 * => & 가 들어가기 때문에 변수 지워짐 => &를 #으로 바꿔줘야함 
				 */
			}
			System.out.println("저장 완료");
		}
		catch(Exception ex) {}
	}
	public static void main(String[] args) {
		DataCollection dc=new DataCollection();
		dc.foodCategoryData();
	}
}
