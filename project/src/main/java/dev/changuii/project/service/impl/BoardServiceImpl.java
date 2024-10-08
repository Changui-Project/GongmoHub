package dev.changuii.project.service.impl;


import dev.changuii.project.dto.BoardDto;
import dev.changuii.project.entity.BoardEntity;
import dev.changuii.project.enums.ErrorCode;
import dev.changuii.project.exception.CustomException;
import dev.changuii.project.repository.BoardRepository;
import dev.changuii.project.service.BoardService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    private final BoardRepository boardRepository;
    public BoardServiceImpl(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Override
    public BoardDto createBoard(BoardDto boardDto) {
        BoardEntity boardEntity = BoardDto.dtoToEntity(boardDto);
        boardRepository.save(boardEntity);

        return BoardDto.entityToDto(boardEntity);
    }

    @Override
    public BoardDto readBoard(Long boardId) {
        BoardEntity boardEntity = this.boardRepository.findById(boardId)
                .orElseThrow(() -> new CustomException(ErrorCode.BOARD_NOT_FOUND));


        return BoardDto.entityToDto(boardEntity);
    }

    @Override
    public List<BoardDto> readAllBoards() {
        List<BoardEntity> boardEntities = boardRepository.findAll();
        return BoardDto.entityToDtoList(boardEntities);
    }

    @Override
    public void deleteBoard(Long boardId) {
        this.boardRepository.deleteById(boardId);
    }
}
