package com.sist.dao;
/*
 *      오라클 연결 => 인터페이스 구현
 *      인터페이스 => 서로 다른 프로그램을 연결할때 사용 (리모컨)
 *      자바 <=========> 오라클 ==> 라이브러리 (인터페이스로 만들어야 한다)
 *      
 *      1. 드라이버 등록 => 소프트웨어 => 메모리 할당
 *                      Class.forName("oracle.jdbc.driver.OracleDriver");
 *                      => 각 업체에서 제공 => ojdbc8.jar
 *         10g,11g,12c,18c,21c
 *             ---     ---
 *             ojdbc6  ojdbc8
 *      2. 오라클 연결 => conn hr/happy
 *         Connection => getConnection(URL,username,password)
 *      3. SQL문장 전송 (송수신)
 *         Statement => executeQuery(SQL)
 *         => 결과값을 받는 클래스 ResultSet
 *         => ResultSet에 있는 데이터를 => List,VO
 *      4. resultSet.close()
 *      5. statement.close()
 *      6. connection.close()
 *      
 *      ===> 자바 프로그램
 *           1) 네트워크 프로그램 (애플리케이션)
 *           2) 데이터베이스 프로그램 (웹 애플리케이션) ************
 *           가장 쉬운 프로그램 : 데이터 베이스 프로그램
 *      ===> 모든 개발자가 동일한 코딩 : SQL
 */
import java.sql.*;
import java.util.*;
public class EmpDAO {
	// 오라클 연결 객체
	private Connection conn;
	// 오라클 통신 (SQL전송 ,결과값 받기)
	private PreparedStatement ps;
	// --------------------------
	// 오라클 주소
	private final String URL="jdbc:oracle:thin:@localhost:1522:XE";
	// 드라이버 이름
	private final String DRIVER="orcle.jdbc.driver.OracleDriver";
	// 유저네임
	private final String USERNAME="hr";
	// 암호
	private final String PASSWORD="happy";
	// -------------------------- 파일에 저장 (보안)
	
	// 드라이버
	public EmpDAO()
	{
		try
		{
			Class.forName(DRIVER);
		}
		catch(Exception ex) {}
	}
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(URL,USERNAME,PASSWORD);
		}
		catch(Exception ex) {}
	}
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
			// 호출시 = exit
		}
		catch(Exception ex) {}
	}
	////////////////////////////============== 오라클 연결시 필수 조건
	////////////////////////////============== 클래스화
	/*
	 *				 ---- 1차  	     2차      3차 
	 *      JDBC === DBCP === ORM (MyBatis , JPA)
	 *      ---- 연습용
	 *      
	 *      요구사항 (지원 자격)
	 *      ---------------------- 1. 언어 (자바)
	 *                             2. 데이터베이스 (오라클 , MySQL)
	 *                             3. Front (Vue,React)
	 *                             4. 우대사항 (클라우드) => AWS
	 *                             ------------------ Full Stack
	 */
	// 기능 : 사용자 요청시에 데이터베이스 => SQL문장을 만들어서 오라클 연동
	// 1. 사용자가 사원 전체 목록 요청
	public List<EmpVO> empListData()
	{
		List<EmpVO> list= new ArrayList<EmpVO>();
		try
		{
			// 정상 수행 문장
			// 1. 오라클 연결
			getConnection();
			
			// 2. 사용자가 요청한 SQL 문장을 제작
			String sql="SELECT empno,ename,job,hiredate,sal "+"FROM emp "+"ORDER BY 1";
			// 3. 오라클로 SQL 문장 전송
			ps=conn.prepareStatement(sql);
			// 4. 오라클에 명령 내리기 (SQL문장 실행 결과 전송 받기)
			ResultSet rs=ps.executeQuery();
			/*
			 *    rs
			 *    
			 *       1      2     3       4      5
			 *      int   String String  Date   int
			 *    ------------------------------------
			 *     empno  ename  job  hiredate  sal
			 *    ------------------------------------
			 *      7788    -     -       -      -    ==> dnlcl (rs.next())
			 *    ------------------------------------
			 *      7789    -     -       -      -
			 *    ------------------------------------
			 *      7790    -     -       -      -
			 *    ------------------------------------
			 *    									  ==> 위치 (rs.previous())
			 *    ------------------------------------
			 */
			while(rs.next())
			{
				EmpVO vo=new EmpVO();
				vo.setEmpno(rs.getInt(1));
				vo.setEname(rs.getString(2));
				vo.setJob(rs.getString(3));
				vo.setHiredate(rs.getDate(4));
				vo.setSal(rs.getInt(5));
				list.add(vo);
			}
			rs.close();
		}
		catch(Exception ex) 
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return list;
	}
	// 2. 상세보기
	public EmpVO empDetailData(int empno)
	{
		EmpVO vo=new EmpVO();
		try
		{
			// 1. 오라클 연결
			getConnection();
			// 2. SQL문장 만들기
			String sql="SELECT * "+"FROM emp "+"WHERE empno="+empno;
			// 3. 오라클 전송
			ps=conn.prepareStatement(sql);
			// 4. 실행후에 결과값 받기
			ResultSet rs=ps.executeQuery();
			// 5. rs의 데이터를 vo에 담기
			rs.next(); // 데이터가 메모리에 출력된 첫번째 줄에 커서 이동
			vo.setEmpno(rs.getInt(1));
			vo.setEname(rs.getString(2));
			vo.setJob(rs.getString(3));
			vo.setMgr(rs.getInt(4));
			vo.setHiredate(rs.getDate(5));
			vo.setSal(rs.getInt(6));
			vo.setComm(rs.getInt(7));
			vo.setDeptno(rs.getInt(8));
			rs.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return vo;
	}
	// 2-1 사번 읽기
	public List<Integer> empGetEmpno()
	{
		List<Integer> list=new ArrayList<Integer>();
		try
		{
			// 1. 연결
			getConnection();
			// SQL문장 제작
			String sql="SELECT DISTINCT empno "+"FROM emp";
			// SQL문장 전송
			ps=conn.prepareStatement(sql);
			// 결과값 받기
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				list.add(rs.getInt(1));
			}
			rs.close();
		}
		catch(Exception ex) 
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return list;
	}
	// 3. 검색
	public EmpVO empFindData(String ename)
	{
		EmpVO vo=new EmpVO();
		try
		{
			// 1. 오라클 연결
			getConnection();
			// 2. SQL문장 만들기
			String sql="SELECT * "+"FROM emp "+"WHERE ename="+"'"+ename+"'";
			// 3. 오라클 전송
			ps=conn.prepareStatement(sql);
			// 4. 실행후에 결과값 받기
			ResultSet rs=ps.executeQuery();
			// 5. rs의 데이터를 vo에 담기
			rs.next(); // 데이터가 메모리에 출력된 첫번째 줄에 커서 이동
			vo.setEmpno(rs.getInt(1));
			vo.setEname(rs.getString(2));
			vo.setJob(rs.getString(3));
			vo.setMgr(rs.getInt(4));
			vo.setHiredate(rs.getDate(5));
			vo.setSal(rs.getInt(6));
			vo.setComm(rs.getInt(7));
			vo.setDeptno(rs.getInt(8));
			rs.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return vo;
	}
	// 3-1 이름 출력
	public List<String> empGetEname(String a)
	{
		List<String> list=new ArrayList<String>();
		try
		{
			// 1. 연결
			getConnection();
			// SQL문장 제작
			String sql="SELECT DISTINCT ename "+"FROM emp"+" WHERE ename LIKE '%"+a+"%'";
//			String sql="SELECT DISTINCT ename "+"FROM emp"+" WHERE ename LIKE '%"||?||"%'";
			// SQL문장 전송
			ps=conn.prepareStatement(sql);
//			ps.setString(1, ename.toUpperCase());
			// 결과값 받기
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				list.add(rs.getString(1));
			}
			rs.close();
		}
		catch(Exception ex) 
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return list;
	}
}
