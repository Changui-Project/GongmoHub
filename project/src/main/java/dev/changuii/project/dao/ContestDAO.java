package dev.changuii.project.dao;

import dev.changuii.project.entity.ContestEntity;

import java.util.List;

public interface ContestDAO {
    void createContest(ContestEntity contest);
    ContestEntity readContest(Long id);
    List<ContestEntity> readAllContests();
    void deleteContest(Long id);
}
