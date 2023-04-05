package com.pbj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.pbj.model.BoardVO;
import com.pbj.service.BoardService;

import lombok.extern.log4j.Log4j;





@Log4j
@Controller
@RequestMapping("/board")
public class boardController {
	
	@Autowired
	private BoardService boardService;
	
    @GetMapping("/list")
    public void boardListGET(Model model) {
        
        log.info("Get list 진입 ");
        
        model.addAttribute("list", boardService.getList());
        
    }
    
    @GetMapping("/enroll")
    public void boardEnrollGET() {
        
        log.info("Get enroll 진입 ");
        
    }
    
    @PostMapping("/enroll")
    public String boardEnrollPOST(BoardVO board) {
    	
    	log.info("board : " + board);
    	
    	boardService.enroll(board);    	
    	
    	    	
    	
    	return "redirect:/board/list";
    	
    }
    
    @GetMapping("/getPaging")
    public void boardPaging(int bno,Model model) {
    	
    	model.addAttribute("pageInfo", boardService.paging(bno));
    	
    }
    
    @GetMapping("/modify")
    public void getModfiy(int bno,Model model) {
    	
    	model.addAttribute("pageInfo", boardService.paging(bno));
    	
    }
    
    
    @PostMapping("/modify")
    public String PostModify(BoardVO board,RedirectAttributes rttr) {
    	
    	boardService.modify(board);
    	
    	rttr.addFlashAttribute("result","sucess");    	   	   	    	
    	
    	return "redirect:/board/list";
    }
    
    @PostMapping("/delete")
    public String delete(int bno,RedirectAttributes rttr) {
    	
    	boardService.delete(bno);
    	
    	rttr.addFlashAttribute("result", "delete");
    	
    	return "redirect:/board/list";
    	
    }
    
    


}
