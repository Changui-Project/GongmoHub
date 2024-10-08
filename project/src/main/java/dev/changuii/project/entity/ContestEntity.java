package dev.changuii.project.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
//이름, 시작날짜, 종료날짜, 특징(명사 추출), 설명, 사진
@Entity(name = "contest")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class ContestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contestId; // 공모전 번호
    private String title; // 제목
    private String content; // 내용
    private String contestURL; // 공모전 링크
    private LocalDate startDate; // 시작날짜
    private LocalDate endDate; // 종료날짜
    private String imageURL; // 사진
}
