package dev.changuii.project.dao.impl;

import dev.changuii.project.dao.ContestDAO;
import dev.changuii.project.entity.ContestEntity;
import dev.changuii.project.repository.ContestRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ContestDAOImpl implements ContestDAO {

    private final ContestRepository contestRepository;
    public ContestDAOImpl(ContestRepository contestRepository) {
        this.contestRepository = contestRepository;
    }

    @Override
    public void createContest(ContestEntity contest) {
        contestRepository.save(contest);
    }

    @Override
    public ContestEntity readContest(Long contestId) {
        return contestRepository.findById(contestId)
                .orElseThrow(() -> new IllegalArgumentException("공모전이 존재하지 않습니다."));
    }

    @Override
    public List<ContestEntity> readAllContests() {
        return contestRepository.findAll();
    }

    @Override
    public void deleteContest(Long contestId) {
        contestRepository.deleteById(contestId);
    }
}
