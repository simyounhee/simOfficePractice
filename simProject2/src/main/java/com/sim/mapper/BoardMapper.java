package com.sim.mapper;

import java.util.List;

import com.sim.model.BoardVO;

public interface BoardMapper {

	/* 등록 */
	public void insertBoard (BoardVO boardVo);
	/* 목록조회 */
	public List<BoardVO> getList();
	/* 상세조회 */
	public BoardVO getPage(int bno); 
	/* 수정 */
	public int modify(BoardVO board);
}
