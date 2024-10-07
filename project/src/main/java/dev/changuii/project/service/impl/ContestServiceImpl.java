package dev.changuii.project.service.impl;

import dev.changuii.project.dao.impl.ContestDAOImpl;
import dev.changuii.project.dto.ContestDto;
import dev.changuii.project.entity.ContestEntity;
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
        ContestEntity contestEntity = ContestDto.dtoToEntity(contestDto);
        contestDAO.createContest(contestEntity);
        return ContestDto.entityToDto(contestEntity);
    }

    @Override
    public ContestDto readContest(Long contestId) {
        ContestEntity contestEntity = contestDAO.readContest(contestId);
        return ContestDto.entityToDto(contestEntity);
    }

    @Override
    public List<ContestDto> readAllContests() {
        List<ContestEntity> contestEntities = contestDAO.readAllContest();
        return ContestDto.entityToDtoList(contestEntities);
    }

    @Override
    public void deleteContest(Long contestId) {
        contestDAO.deleteContest(contestId);
    }
}
