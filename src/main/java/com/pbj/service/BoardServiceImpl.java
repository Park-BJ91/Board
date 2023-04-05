package com.pbj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pbj.mapper.BoardMapper;
import com.pbj.model.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardMapper boardMapper;
	
	@Override
	public void enroll(BoardVO board) {
		
		boardMapper.enroll(board);
		
	}
	
	@Override
	public List<BoardVO> getList() {
		
		return boardMapper.getList();
	}
	
	@Override
	public BoardVO paging(int bno) {
		
		return boardMapper.paging(bno);
	}
	
	@Override
	public int modify(BoardVO board) {
		
		
		
		return boardMapper.modify(board);
	}
	
	@Override
	public int delete(int bno) {
		
		return boardMapper.delete(bno);
	}

}
