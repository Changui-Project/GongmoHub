package dev.changuii.project.dao;

import dev.changuii.project.entity.ContestEntity;

import java.util.List;

public interface ContestDAO {
    ContestEntity createContest(ContestEntity contest);
    ContestEntity readContest(Long id);
    List<ContestEntity> readAllContest();
    void deleteContest(Long id);
}
