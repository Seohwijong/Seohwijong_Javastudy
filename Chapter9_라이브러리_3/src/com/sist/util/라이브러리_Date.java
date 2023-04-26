package com.sist.util;
import java.text.SimpleDateFormat;
/*
 *      Date : java.util
 *        1) 시스템의 현재 시간 / 날짜를 읽어오는 클래스
 *           --------------------
 *        2) Date클래스의 단점 => 기능이 빈약하다
 *                |            날짜만 저장하는 클래스 (오라클의 데이터형과 호환)
 *                |
 *                보완 => Calendar
 *        3) Date => SimpleDateFormat => java.text
 *                   ---------------- 원하는 스타일로 날짜 변경
 *        4) 사용처 : 웹 (등록일)
 */
import java.util.*;
public class 라이브러리_Date {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh-mm:ss");
		System.out.println(sdf.format(date));
		/*
		 *   년도 : yyyy(2023) , yyy(023)
		 *   월 : M => MM , M (1 , 2 , 3 .. 10 , 11 , 12)
		 *            01 , 02 , 11 , 12
		 *   일 : dd => dd , d
		 *   시간 : hh => hh , h
		 *   분 : mm => mm , m
		 *   초 : ss => ss , s
		 *   오라클 => 
		 */
	}
}
