package dev.changuii.project.controller;

import dev.changuii.project.dto.ContestDto;
import dev.changuii.project.service.impl.ContestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    @PostMapping("")
    public ResponseEntity<ContestDto> createContest(@RequestBody ContestDto contestDto) {
        ContestDto createdContest = contestService.createContest(contestDto);
        return ResponseEntity.ok().body(createdContest);
    }

    @GetMapping("/{contestId}")
    public ResponseEntity<ContestDto> readContest(@PathVariable Long contestId) {
        ContestDto readContest = contestService.readContest(contestId);
        return ResponseEntity.ok().body(readContest);
    }

    @GetMapping("/keyword/{keyword}")
    public ResponseEntity<List<ContestDto>> readAllByKeyword(
            @PathVariable("keyword") String keyword
    ){
        return ResponseEntity.status(HttpStatus.OK)
                .body(this.contestService.readByTitleContest(keyword));
    }

    @GetMapping("")
    public ResponseEntity<List<ContestDto>> readAllContests() {
        List<ContestDto> contests = contestService.readAllContests();
        return ResponseEntity.ok().body(contests);
    }

    @DeleteMapping("/{contestId}")
    public void deleteContest(@PathVariable Long contestId) {
        contestService.deleteContest(contestId);
    }
}
