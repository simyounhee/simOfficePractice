package com.sim.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sim.model.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardMapperTests {

	private static final Logger log = LoggerFactory.getLogger(BoardMapperTests.class);
    
    @Autowired
    private BoardMapper mapper;

//    @Test
//    public void testEnroll() {
//        
//        BoardVO vo = new BoardVO();
//        
//        vo.setTitle("mapper test");
//        vo.setContent("mapper test");
//        vo.setWriter("mapper test");
//        
//        mapper.insertBoard(vo);
//        
//    }
    
    /* 게시판 목록 테스트 */
//    @Test
//    public void testGetList() {
//    	List<BoardVO> list = mapper.getList();
//    	
//    	/* foreach문 & 람다식 */
//    	list.forEach(board -> log.info("" + board));
//    }
    
    /* 게시판 조회 테스트 */
//    @Test
//    public void testGetpage() {
//    	//실제존재하는 페이지 
//    	int bno = 8;
//    	log.info(""+mapper.getPage(bno));
//    }
    
    /* 게시판 수정 */
    @Test
    public void testModify() {
        
        BoardVO board = new BoardVO();
        board.setBno(8);
        board.setTitle("수정 제목");
        board.setContent("수정 내용");
        
        int result = mapper.modify(board);
        log.info("result : " +result);
        
    }
}
