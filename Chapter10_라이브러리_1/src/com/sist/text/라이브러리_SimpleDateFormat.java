package com.sist.text;
/*
 *   java.text => 출력 형태를 만들어서 사용 (변경)
 *   ---------
 *      SimpleDateFormat : 날짜 변경
 *      DecimalFormat : 숫자변환
 *      --------------- 가격 출력 10,000원
 *      MessageFormat : 데이터베이스 => INSERT ,UPDATE
 *      ---------------
 *      String name="" , sex="" , addr="" , tel="";
 *      int age=10;
 *      
 *      String sql="INSERT INTO member VALUES("+"'"+name+"','"+sex+"','"+addr+"','"+tel+"',"+age+")";
 *      String sql="INSERT INTO member VALUES('{1}','{2}','{3}','{4}',{5})
 */
import java.util.*;
import java.util.Date;
import java.text.*;
import java.sql.*;
public class 라이브러리_SimpleDateFormat {
	
	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(date));
	}
}
