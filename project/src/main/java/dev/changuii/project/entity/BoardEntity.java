package dev.changuii.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@Entity(name = "board")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class BoardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boardId; // 게시판 번호
    private String title; // 제목
    private String content; // 내용
    private LocalDate postDate; // 작성 날짜
    private LocalDate closeDate; // 마감 날짜
    private String openTalkURL; // 오픈 채팅방 링크
}
