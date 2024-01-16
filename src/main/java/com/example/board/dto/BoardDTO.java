package com.example.board.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class BoardDTO {

    private int boardNum;           //글번호
    private int grpNum;             //그룹 번호
    private int depth;              //댓글 depth
    private String title;           //글 제목
    private String content;         //글 내용
    private String writer;          //작성자
    private int replyCnt;           //댓글 수
    private int reccmndCnt;         //추천수
    private char delYn;             //삭제 여부
    private char noticeYn;          //공지 여부
    private LocalDateTime regDt;    //작성일
    private LocalDateTime modDt;    //수정일

}
