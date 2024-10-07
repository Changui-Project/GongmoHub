package dev.changuii.project.service.impl;

import dev.changuii.project.dto.BoardDto;
import dev.changuii.project.service.BoardService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {
    @Override
    public BoardDto createBoard(BoardDto boardDto) {
        return null;
    }

    @Override
    public BoardDto readBoard(Long id) {
        return null;
    }

    @Override
    public List<BoardDto> readAllBoards() {
        return List.of();
    }

    @Override
    public void deleteBoard(Long id) {

    }
}
