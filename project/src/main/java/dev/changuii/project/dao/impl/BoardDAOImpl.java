package dev.changuii.project.dao.impl;

import dev.changuii.project.dao.BoardDAO;
import dev.changuii.project.entity.BoardEntity;
import dev.changuii.project.repository.BoardRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardDAOImpl implements BoardDAO {

    private final BoardRepository boardRepository;
    public BoardDAOImpl(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }
    @Override
    public void createBoard(BoardEntity board) {
        boardRepository.save(board);
    }

    @Override
    public BoardEntity readBoard(Long boardId) {
        return boardRepository.findById(boardId)
                .orElseThrow(() -> new IllegalArgumentException("게시판이 존재하지 않습니다."));
    }

    @Override
    public List<BoardEntity> readAllBoards() {
        return boardRepository.findAll();
    }

    @Override
    public void deleteBoard(Long boardId) {
        boardRepository.deleteById(boardId);
    }
}