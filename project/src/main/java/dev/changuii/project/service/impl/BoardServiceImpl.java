package dev.changuii.project.service.impl;


import dev.changuii.project.dto.BoardDto;
import dev.changuii.project.entity.BoardEntity;
import dev.changuii.project.entity.ContestEntity;
import dev.changuii.project.enums.ErrorCode;
import dev.changuii.project.exception.CustomException;
import dev.changuii.project.repository.BoardRepository;
import dev.changuii.project.repository.ContestRepository;
import dev.changuii.project.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    private final BoardRepository boardRepository;
    private final ContestRepository contestRepository;
    public BoardServiceImpl(
            @Autowired BoardRepository boardRepository,
            @Autowired ContestRepository contestRepository) {
        this.contestRepository=contestRepository;
        this.boardRepository = boardRepository;
    }

    @Override
    public BoardDto createBoard(BoardDto boardDto) {
        ContestEntity contestEntity = this.contestRepository.findById(boardDto.getContestId())
                .orElseThrow(() -> new CustomException(ErrorCode.CONTEST_NOT_FOUND));

        BoardEntity boardEntity = BoardDto.dtoToEntity(boardDto, contestEntity);
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
