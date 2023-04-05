package com.pbj.service;

import java.util.List;

import com.pbj.model.BoardVO;

public interface BoardService {
	
	public void enroll(BoardVO board);
	
	public List<BoardVO> getList();
	
	public BoardVO paging(int bno);
	
	public int modify(BoardVO board);
	
	public int delete(int bno);

}
