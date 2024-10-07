package dev.changuii.project.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@ToString
@Builder
@AllArgsConstructor
public class ContestDto {
    private Long contestId; // 공모전 번호
    private String title; // 제목
    private String content; // 내용
    private LocalDate startDate; // 시작날짜
    private LocalDate endDate; // 종료날짜
    private List<String> feature = new ArrayList<>(); // 특징
    private String imageURL; // 사진
}
