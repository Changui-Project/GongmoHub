package dev.changuii.project.service.impl;

import dev.changuii.project.dto.ContestDto;
import dev.changuii.project.service.ContestService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContestServiceImpl implements ContestService {
    @Override
    public ContestDto createContest(ContestDto contestDto) {
        return null;
    }

    @Override
    public ContestDto readContest(Long id) {
        return null;
    }

    @Override
    public List<ContestDto> readAllContests() {
        return List.of();
    }

    @Override
    public void deleteContest(Long id) {

    }
}
