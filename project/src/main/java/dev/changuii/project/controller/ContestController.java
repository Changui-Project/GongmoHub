package dev.changuii.project.controller;

import dev.changuii.project.dto.ContestDto;
import dev.changuii.project.service.impl.ContestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contest")
public class ContestController {

    private final ContestServiceImpl contestService;
    public ContestController(@Autowired ContestServiceImpl contestServiceImpl) {
        this.contestService = contestServiceImpl;
    }
    @PostMapping("/create")
    public ResponseEntity<ContestDto> createContest(@RequestBody ContestDto contestDto) {
        ContestDto createdContest = contestService.createContest(contestDto);
        return ResponseEntity.ok().body(createdContest);
    }

    @GetMapping("/read/{contestId}")
    public ResponseEntity<ContestDto> readContest(@PathVariable Long contestId) {
        ContestDto readContest = contestService.readContest(contestId);
        return ResponseEntity.ok().body(readContest);
    }

    @GetMapping("/readAll")
    public ResponseEntity<List<ContestDto>> readAllContests() {
        List<ContestDto> contests = contestService.readAllContests();
        return ResponseEntity.ok().body(contests);
    }

    @DeleteMapping("/delete/{contestId}")
    public void deleteContest(@PathVariable Long contestId) {
        contestService.deleteContest(contestId);
    }
}
