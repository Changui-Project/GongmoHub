package dev.changuii.project.dao.impl;

import dev.changuii.project.dao.BoardDAO;
import dev.changuii.project.entity.BoardEntity;

import java.util.List;

public class BoardDAOImpl implements BoardDAO {
    @Override
    public BoardEntity createBoard(BoardEntity board) {
        return null;
    }

    @Override
    public BoardEntity readBoard(Long id) {
        return null;
    }

    @Override
    public List<BoardEntity> readAllBoards() {
        return List.of();
    }

    @Override
    public void deleteBoard(Long id) {

    }
}