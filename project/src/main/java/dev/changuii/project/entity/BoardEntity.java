package dev.changuii.project.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
    private LocalDate startDate;
    private LocalDate closeDate; // 마감 날짜
    private String contactType;
    private String openTalkURL; // 오픈 채팅방 링크
    @ElementCollection
    private List<String> techStacks = new ArrayList<>();
    private int contactNum;
    private String recruitmentType;
    private String rule;


    @ManyToOne
    @JoinColumn
    private ContestEntity contestEntity;

}
