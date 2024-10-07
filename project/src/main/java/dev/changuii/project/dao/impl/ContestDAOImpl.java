package dev.changuii.project.dao.impl;

import dev.changuii.project.dao.ContestDAO;
import dev.changuii.project.entity.ContestEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ContestDAOImpl implements ContestDAO {
    @Override
    public ContestEntity createContest(ContestEntity contest) {
        return null;
    }

    @Override
    public ContestEntity readContest(Long id) {
        return null;
    }

    @Override
    public List<ContestEntity> readAllContest() {
        return List.of();
    }

    @Override
    public void deleteContest(Long id) {

    }
}
