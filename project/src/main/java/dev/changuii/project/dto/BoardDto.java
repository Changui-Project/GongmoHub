package dev.changuii.project.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

import java.time.LocalDate;

@ToString
@Builder
@AllArgsConstructor
public class BoardDto {
    private Long boardId; // 게시판 번호
    private String title; // 제목
    private String content; // 내용
    private LocalDate postDate; // 작성 날짜
    private LocalDate closeDate; // 마감 날짜
    private String openTalkURL; // 오픈 채팅방 링크
}
