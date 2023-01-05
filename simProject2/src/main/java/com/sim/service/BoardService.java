package com.sim.service;

import java.util.List;

import com.sim.model.BoardVO;

public interface BoardService {
	
	/* 등록 */
	public void insertBoard(BoardVO boardVo);
	/* 목록조회 */
	public List<BoardVO> getList();
	/* 상세조회 */
	public BoardVO getPage(int bno);
	/* 게시판 수정 */
	public int modify(BoardVO boardVo);
}
