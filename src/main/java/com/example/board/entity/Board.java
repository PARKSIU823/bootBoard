package com.example.board.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Board extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int boardNum;

    @Column
    private int grpNum;

    @Column
    private int depth;

    @Column(length = 50, nullable = false)
    private String title;

    @Column(length = 1000, nullable = false)
    private String content;

    @Column(length = 10, nullable = false)
    private String writer;

    @Column
    private int replyCnt;

    @Column
    private int recmmndCnt;

    @Column
    private char delYn;

    @Column
    private char noticeYn;

    //글 제목 수정
    public void modTitle(String title) {
        this.title = title;
    }

    //글 내용 수정
    public void modContent(String content){
        this.content = content;
    }
}
