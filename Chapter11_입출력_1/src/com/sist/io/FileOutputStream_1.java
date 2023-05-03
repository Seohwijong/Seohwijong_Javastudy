package com.sist.io;
import java.util.*;
import java.io.*;
public class FileOutputStream_1 {

	public static void main(String[] args) {
		try
		{
			//파일 지정
			File file=new File("c:\\java_datas\\school.txt");
			if(!file.exists())
			{
				file.createNewFile(); // 파일 만들기 명령
			}
			// 파일이 존재할때 사용
			FileOutputStream fos=new FileOutputStream(file,true);
			String msg=" ";
//			System.out.println((int)'안');
			fos.write(msg.getBytes());
			// String ==> byte[]로 변경 => getBytes()
			fos.close();
			System.out.println("저장완료");
		}
		catch(Exception ex) {}
	}
}
