package com.sim.service;

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
public class BoardServiceTests {

	private static final Logger log = LoggerFactory.getLogger(BoardServiceTests.class);
	
	@Autowired
    private BoardService service;
	
//	@Test
//    public void testEnroll() {
//        
//        BoardVO vo = new BoardVO();
//        
//        vo.setTitle("service test");
//        vo.setContent("service test");
//        vo.setWriter("service test");
//        
//        service.insertBoard(vo);
//        
//    }
	
	/* 게시판 목록 테스트 */
//	@Test
//	public void testGetList() {
//		service.getList().forEach(board -> log.info("" + board));
//	}
	
//	@Test
//	public void testGetpage() {
//		int bno = 8;
//		log.info("" + service.getPate(bno));
//	}
	
	/* 게시판 수정 */
    @Test
    public void testModify() {
        
        BoardVO board = new BoardVO();
        board.setBno(8);
        board.setTitle("수정 제목");
        board.setContent("수정 내용");
        
        int result = service.modify(board);
        log.info("result : " +result);
        
    } 
}
