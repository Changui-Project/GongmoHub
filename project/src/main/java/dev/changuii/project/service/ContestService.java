package dev.changuii.project.service;

import dev.changuii.project.dto.ContestDto;

import java.util.List;

public interface ContestService {
    ContestDto createContest(ContestDto contestDto);
    ContestDto readContest(Long id);
    List<ContestDto> readAllContests();
    void deleteContest(Long id);
}
