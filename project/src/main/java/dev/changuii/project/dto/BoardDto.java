package dev.changuii.project.dto;

import dev.changuii.project.entity.BoardEntity;
import dev.changuii.project.entity.ContestEntity;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class BoardDto {
    private Long boardId; // 게시판 번호
    private String title; // 제목
    private String content; // 내용
    private List<String> techStack; // 기술 스택
    private LocalDate postDate; // 작성 날짜
    private LocalDate closeDate; // 마감 날짜
    private String openTalkURL; // 오픈 채팅방 링크

    private LocalDate startDate;
    private String contactType;

    private int contactNum;
    private String recruitmentType;

    private Long contestId;
    private String rule;
    private ContestDto contest;


    public static BoardDto entityToDto(BoardEntity boardEntity){
        return BoardDto.builder()
                .boardId(boardEntity.getBoardId())
                .title(boardEntity.getTitle())
                .content(boardEntity.getContent())
                .postDate(boardEntity.getPostDate())
                .closeDate(boardEntity.getCloseDate())
                .techStack(boardEntity.getTechStacks())
                .openTalkURL(boardEntity.getOpenTalkURL())
                .startDate(boardEntity.getStartDate())
                .contactType(boardEntity.getContactType())
                .contactNum(boardEntity.getContactNum())
                .recruitmentType(boardEntity.getRecruitmentType())
                .rule(boardEntity.getRule())
                .contest(ContestDto.entityToDto(boardEntity.getContestEntity()))
                .build();
    }
    public static List<BoardDto> entityToDtoList(List<BoardEntity> boardEntities) {
        return boardEntities.stream()
                .map(BoardDto::entityToDto)
                .collect(Collectors.toList());
    }
    public static BoardEntity dtoToEntity(BoardDto boardDto, ContestEntity contestEntity) {
        return BoardEntity.builder()
                .title(boardDto.getTitle())
                .content(boardDto.getContent())
                .postDate(boardDto.getPostDate())
                .closeDate(boardDto.getCloseDate())
                .techStacks(boardDto.getTechStack())
                .openTalkURL(boardDto.getOpenTalkURL())
                .startDate(boardDto.getStartDate())
                .contactType(boardDto.contactType)
                .contactNum(boardDto.contactNum)
                .recruitmentType(boardDto.recruitmentType)
                .rule(boardDto.rule)
                .contestEntity(contestEntity)
                .build();
    }
}
