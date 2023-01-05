package com.sim.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sim.mapper.BoardMapper;
import com.sim.model.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardMapper boardDao;
	
	@Override
	public void insertBoard(BoardVO boardVo) {
		boardDao.insertBoard(boardVo);
		
	}

	@Override
	public List<BoardVO> getList() {
		return boardDao.getList();
	}

	@Override
	public BoardVO getPage(int bno) {
		return boardDao.getPage(bno);
	}

	@Override
	public int modify(BoardVO boardVo) {
		// TODO Auto-generated method stub
		return boardDao.modify(boardVo);
	}

}
