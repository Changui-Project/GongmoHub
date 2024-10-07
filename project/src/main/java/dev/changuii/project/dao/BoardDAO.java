package dev.changuii.project.dao;

import dev.changuii.project.entity.BoardEntity;

import java.util.List;

public interface BoardDAO {
    void createBoard(BoardEntity board);
    BoardEntity readBoard(Long id);
    List<BoardEntity> readAllBoards();
    void deleteBoard(Long id);
}
