package com.sist.inter;
import java.util.*;
import com.sist.manager.*;
public interface BoardInterface {
	public List<BoardVO> boardListData(int page); // 목록
	public BoardVO boardDetailData(int no); // 상세
	public void boardInsert(BoardVO vo); // 글쓰기
	public BoardVO boradUpdateData(int no); // 수정할거 가져오기
	public String boardUpData(BoardVO vo); // 수정
	public String boardDelete(int no,String pwd); //삭제
	public int noIncrement(); //번호 증가
}
