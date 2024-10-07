package dev.changuii.project.service.impl;

import dev.changuii.project.dao.impl.BoardDAOImpl;
import dev.changuii.project.dto.BoardDto;
import dev.changuii.project.entity.BoardEntity;
import dev.changuii.project.service.BoardService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    private final BoardDAOImpl boardDAO;
    public BoardServiceImpl(BoardDAOImpl boardDAO) {
        this.boardDAO = boardDAO;
    }

    @Override
    public BoardDto createBoard(BoardDto boardDto) {
        BoardEntity boardEntity = BoardDto.dtoToEntity(boardDto);
        boardDAO.createBoard(boardEntity);
        return BoardDto.entityToDto(boardEntity);
    }

    @Override
    public BoardDto readBoard(Long boardId) {
        BoardEntity boardEntity = boardDAO.readBoard(boardId);
        return BoardDto.entityToDto(boardEntity);
    }

    @Override
    public List<BoardDto> readAllBoards() {
        List<BoardEntity> boardEntities = boardDAO.readAllBoards();
        return BoardDto.entityToDtoList(boardEntities);
    }

    @Override
    public void deleteBoard(Long boardId) {
        boardDAO.deleteBoard(boardId);
    }
}
