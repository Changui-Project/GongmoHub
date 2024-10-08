package dev.changuii.project.controller;

import dev.changuii.project.dto.BoardDto;
import dev.changuii.project.service.impl.BoardServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/board")
public class BoardController {

    private final BoardServiceImpl boardService;
    public BoardController(BoardServiceImpl boardServiceImpl) {
        this.boardService = boardServiceImpl;
    }

    @PostMapping("")
    public ResponseEntity<BoardDto> createBoard(@RequestBody BoardDto boardDto) {
        BoardDto createdBoard = boardService.createBoard(boardDto);
        return ResponseEntity.ok().body(createdBoard);
    }

    @GetMapping("/{boardId}")
    public ResponseEntity<BoardDto> readBoard(@PathVariable("boardId") Long boardId) {
        BoardDto readBoard = boardService.readBoard(boardId);
        return ResponseEntity.ok().body(readBoard);
    }

    @GetMapping("")
    public ResponseEntity<List<BoardDto>> readAllBoards() {
        List<BoardDto> boards = boardService.readAllBoards();
        return ResponseEntity.ok().body(boards);
    }

    @DeleteMapping("/{boardId}")
    public void deleteBoard(@PathVariable Long boardId) {
        boardService.deleteBoard(boardId);
    }
}
