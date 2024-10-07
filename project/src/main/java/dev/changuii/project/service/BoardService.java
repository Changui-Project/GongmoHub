package dev.changuii.project.service;

import dev.changuii.project.dto.BoardDto;

import java.util.List;

public interface BoardService {
    BoardDto createBoard(BoardDto boardDto);
    BoardDto readBoard(Long id);
    List<BoardDto> readAllBoards();
    void deleteBoard(Long id);
}
