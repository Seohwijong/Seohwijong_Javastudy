package com.sist.main3;
import java.util.*;
public class MusicMain {

	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 System.out.print("선택(Genie(1),Melon(2)):");
		 int select=scan.nextInt();
		 GenieMusicSystem ms=null;
		 
		 if(select==1)
			 ms=new GenieMusicSystem(); //musicAllData()
		 else
			 ms=new MelonMusicSystem(); //musicAllData()
		 
		 //1. 목록 출력
		 Music[] music=ms.musicAllData();
		 for(Music m:music)
		 {
			 System.out.println(m.getRank()+"."+m.getTitle());
		 }
	}
}
