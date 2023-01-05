package com.sim.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sim.model.BoardVO;
import com.sim.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {

	private static final Logger log = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	private BoardService boardService;
	
	/* 게시판 목록 페이지 접속 */
	@GetMapping("/list")
	public void listBoardGET(Model model) {
		log.info("게시판 목록 페이지 진입");
		
		model.addAttribute("list", boardService.getList());
		
	}
	
	/* 게시판 등록 페이지 접속 */
	@GetMapping("/insert")
	public void insertPageGET() {
		log.info("게시판 등록 페이지 진입");
	}
	
	@PostMapping("/insert")
	public String insertBoardPOST(BoardVO boardVo, RedirectAttributes rttr) {
		log.info("BoardVO: "+ boardVo);
		boardService.insertBoard(boardVo);
		
		rttr.addFlashAttribute("result", "insert success");
		
		return "redirect:/board/list";
	}
	
	/* 게시판 조회 */
	@GetMapping("/get")
	public void boardGetPageGET(int bno, Model model) {
		model.addAttribute("pageInfo", boardService.getPage(bno));
	}
	
	/* 수정 페이지 이동 */
	@GetMapping("/modify")
	public void boardModifyGET(int bno, Model model) {
		model.addAttribute("pageInfo", boardService.getPage(bno));
	}
	
	
	
	
	
	
	
}
