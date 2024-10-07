package dev.changuii.project.service.impl;

import dev.changuii.project.dao.impl.ContestDAOImpl;
import dev.changuii.project.dto.ContestDto;
import dev.changuii.project.service.ContestService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContestServiceImpl implements ContestService {

    private final ContestDAOImpl contestDAO;
    public ContestServiceImpl(ContestDAOImpl contestDAO) {
        this.contestDAO = contestDAO;
    }
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
