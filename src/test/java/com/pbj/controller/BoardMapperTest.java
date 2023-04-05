package com.pbj.controller;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pbj.mapper.BoardMapper;
import com.pbj.model.BoardVO;
import com.pbj.service.BoardService;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j

public class BoardMapperTest {
	
	@Autowired
	private BoardMapper boardMapper;
	
	@Autowired
	private BoardService service;
	
	/*
	  @Test public void enrollTest() {
	  
	  
	  BoardVO vo = new BoardVO(); vo.setContent("�׽�Ʈ ����");
	  vo.setTitle("�׽�Ʈ ����"); vo.setWriter("�׽�Ʈ �۰�");
	  
	  boardMapper.enroll(vo);
	  
	  
	  }
	 */
	
	
	/*
	@Test
	public void selectTest() {
		
		List list = boardMapper.getList();
		
		for(int i=0; i<list.size(); i++) {
			log.info(list.get(i));
		}
	*/	
		/*
		for(Object a : list) {
			log.info("" + a);
		}
		*/
		
		/*
		list.forEach(bo -> log.info("" + bo));
	}
	
	}	
	
		 */
	
	/*
	@Test
	public void pagingTest() {
		
		int bno = 20;
		
		log.info(boardMapper.paging(bno));
		
	}
	*/
	
	/*
	@Test
	public void updateTest() {
		
		BoardVO vo = new BoardVO();
		
		vo.setBno(20);
		vo.setTitle("수정");
		vo.setContent("수정");

		int result = service.modify(vo);
		
		log.info(" : " + result);
		
		
	}
	*/
	
	@Test
	public void deleteTest() {
		
		int bno = 22;
		
		log.info(boardMapper.delete(bno));
		
		
		
	}
	
	
	
}
