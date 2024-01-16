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
    private char replyCnt;

    @Column
    private char recmmndCnt;

    @Column
    private char delYn;

}