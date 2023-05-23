package com.sist.dao;
import java.sql.*;
import java.util.*;
import com.sist.vo.*;
/*
 *  1. 드라이버 등록
 *     ------ 오라클 연결하는 라이브러리 (ojdbc8.jar)
 *     OracleDriver => 메모리 할당
 *  2. 오라클 연결
 *     Connection
 *  3. SQL문장을 전송
 *     PreparedStatement
 *  4. SQL문장 실행 요청
 *     = executeUpdate() => INSERT , UPDATE , DELETE
 *     = executeQuery()  => SELECT
 *       ------------- 결과값을 가지고 온다
 *                     ----
 *                     ResultSet
 *     ResultSet
 *      String sql="SELECT id,name,sex,age ";
 *     ---------------------------------------
 *     		id		name	sex		age
 *     ---------------------------------------
 *     	   aaa      홍길동    남자    20 | first() => next()
 *     									위치변경    위치변경후 데이터 읽기
 *     	   getString(1) getString(2) getString(3) getInt(4)
 *         getString("id") => mybatis
 *     ---------------------------------------
 *         bbb      심청이    여자    23 |
 *         getString(1) getString(2) getString(3) getInt(4) 
 *     ---------------------------------------
 *         ccc      박문수    남자    27 | last() => previous()
 *         getString(1) getString(2) getString(3) getInt(4)
 *     ---------------------------------------
 *        | 커서 위치
 *  5. 닫기
 *     생성 반대로 닫는다
 *     rs.close() , ps.close() , conn.close()
 *  --------------------------- 오라클 연결 (Servlet => JSP)
 *  
 *  
 */
public class FoodDAO {
	// 기능 => INSERT => 데이터 수집 (파일)
	private Connection conn; // 오라클 연결 객체 (데이터베이스 연결)
	private PreparedStatement ps; // SQL문장 전송 / 결과값 읽기
	private final String URL="jdbc:oracle:thin:@localhost:1522:XE";
	// mySQL => jdbc:mysql://localhost/mydb
	private static FoodDAO dao; // 싱글턴 패턴
	// DAO객체를 한개만 사용이 가능하게 만든다
	// 드라이버 설치 => 소프트웨어 (메모리 할당 요청) Class.forName()
	// 클래스의 정보를 전송
	// 드라이버 설치는 1번만 수행
	public FoodDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(Exception ex) {}
	}
	// 오라클 연결
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(URL,"hr","happy");
			// => 오라클 전송 : conn
		}
		catch(Exception ex) {}
	}
	// 오라클 연결 종료
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
			// => 오라클 전송 : exit
		}
		catch(Exception ex) {}
	}
	// DAO객체를 1개만 생성해서 사용 => 메모리 누수현상 방지 (싱글턴 패턴)
	// 싱글턴 / 팩토리 => 면접 (스프링 : 패턴 8개)
	public static FoodDAO newInstance()
	{
		// newInstance() , getInstance() => 싱글턴
		if(dao==null)
			dao=new FoodDAO();
		return dao;
	}
	// ============= 기본 셋팅 (모든 DAO)
	// 기능 
	// 1. 데이터 수집 (INSERT)
	/*
	 * Statement => SQL => 생성과 동시에 데이터 추가
	 * 				"'"+name+"','"+sex+"','"+....
	 * PreparedStaement => 미리 SQL문장을 만들고 나중에 값을 채운다
	 * CallableStatement => 
	 */
	public void foodCategoryInsert(CategoryVO vo)
	{
		try
		{
			// 1. 연결
			getConnection();
			// 2. SQL문장 생성
			String sql="INSERT INTO food_category VALUES(fc_cno_seq.nextval,?,?,?,?)";
			/*
			 * 	"'"+vo.getTitle()+"','"
			 * 
			 *  INSERT ~ VALUES('홍길동','서울','남자',23);
			 */
			// 3. SQL문장 오라클로 전송
			ps=conn.prepareStatement(sql);
			// 3-1 => ?에 값을 채운다
			ps.setString(1, vo.getTitle()); // "'"+vo.getTitle()+"'"
			ps.setString(2, vo.getSubject());
			ps.setString(3, vo.getPoster());
			ps.setString(4, vo.getLink());
			// 단점 => 번호가 잘못되면 오류 발생 , 데이터형이 다르면 오류 발생
			// 오류 => IN , OUT ~ => 번호틀림
			// 4. SQL문장 실행 명령 => SQL문장을 작성하고
			ps.executeUpdate(); 
		}
		catch(Exception ex) 
		{
			ex.printStackTrace(); // 에러 확인
		}
		finally
		{
			disConnection();  // 오라클 연결 해제 => 무조건
		}
	}
	// 2. SELECT => 전체 데이터 읽기
	// 3. 상세보기 => WHERE
}