package dev.changuii.project.dto;

import dev.changuii.project.entity.BoardEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@ToString
@Builder
@AllArgsConstructor
@Getter
public class BoardDto {
    private Long boardId; // 게시판 번호
    private String title; // 제목
    private String content; // 내용
    private LocalDate postDate; // 작성 날짜
    private LocalDate closeDate; // 마감 날짜
    private String openTalkURL; // 오픈 채팅방 링크

    public static BoardDto entityToDto(BoardEntity boardEntity){
        return BoardDto.builder()
                .boardId(boardEntity.getBoardId())
                .title(boardEntity.getTitle())
                .content(boardEntity.getContent())
                .postDate(boardEntity.getPostDate())
                .closeDate(boardEntity.getCloseDate())
                .openTalkURL(boardEntity.getOpenTalkURL())
                .build();
    }
    public static List<BoardDto> entityToDtoList(List<BoardEntity> boardEntities) {
        return boardEntities.stream()
                .map(BoardDto::entityToDto)
                .collect(Collectors.toList());
    }
    public static BoardEntity dtoToEntity(BoardDto boardDto) {
        return BoardEntity.builder()
                .title(boardDto.getTitle())
                .content(boardDto.getContent())
                .postDate(boardDto.getPostDate())
                .closeDate(boardDto.getCloseDate())
                .openTalkURL(boardDto.getOpenTalkURL())
                .build();
    }
}
