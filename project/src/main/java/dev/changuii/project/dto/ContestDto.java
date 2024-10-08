package dev.changuii.project.dto;

import dev.changuii.project.entity.ContestEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@ToString
@Builder
@AllArgsConstructor
@Getter
public class ContestDto {
    private Long contestId; // 공모전 번호
    private String title; // 제목
    private String content; // 내용
    private String contestURL; // 공모전 링크
    private LocalDate startDate; // 시작날짜
    private LocalDate endDate; // 종료날짜
    private String imageURL; // 사진

    public static ContestDto entityToDto(ContestEntity contestEntity) {
        return ContestDto.builder()
                .contestId(contestEntity.getContestId())
                .title(contestEntity.getTitle())
                .content(contestEntity.getContent())
                .contestURL(contestEntity.getContestURL())
                .startDate(contestEntity.getStartDate())
                .endDate(contestEntity.getEndDate())
                .imageURL(contestEntity.getImageURL())
                .build();
    }

    public static List<ContestDto> entityToDtoList(List<ContestEntity> contestEntities) {
        return contestEntities.stream()
                .map(ContestDto::entityToDto)
                .collect(Collectors.toList());
    }

    public static ContestEntity dtoToEntity(ContestDto contestDto) {
        return ContestEntity.builder()
                .title(contestDto.getTitle())
                .content(contestDto.getContent())
                .contestURL(contestDto.getContestURL())
                .startDate(contestDto.getStartDate())
                .endDate(contestDto.getEndDate())
                .imageURL(contestDto.getImageURL())
                .build();
    }

}
