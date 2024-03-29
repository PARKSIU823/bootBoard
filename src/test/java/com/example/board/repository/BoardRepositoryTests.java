package com.example.board.repository;

import com.example.board.entity.Board;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;
import java.util.stream.IntStream;

@SpringBootTest
public class BoardRepositoryTests {

    @Autowired
    private BoardRepository boardRepository;

    //더미 데이터 입력 테스트
    @Test
    public void insertDummies(){

        IntStream.rangeClosed(1,500).forEach(i-> {

            Board board = Board.builder()
                    .title("제목.............." + i)
                    .content("글 내용............" + i )
                    .writer("작성자" + (i%10))
                    .depth(1)
                    .grpNum(1)
                    .replyCnt(0)
                    .recmmndCnt(0)
                    .delYn('N')
                    .build();
            System.out.println(boardRepository.save(board));
        });
    }

    //수정 처리 테스트
    @Test
    public void updateTest(){

        Optional<Board> result = boardRepository.findById(500);

        if(result.isPresent()){

            Board board = result.get();

            board.modTitle("제목 수정 updateTest");
            board.modContent("글 내용 수정 updateTest");

            boardRepository.save(board);
        }

    }
}
