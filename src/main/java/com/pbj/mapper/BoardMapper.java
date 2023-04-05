package com.pbj.mapper;

import java.util.List;

import com.pbj.model.BoardVO;

public interface BoardMapper {
	
	public void enroll(BoardVO board);
	
	public List<BoardVO> getList();
	
	public BoardVO paging(int bno);
	
	public int modify(BoardVO board);
	
	public int delete(int bno);

}
