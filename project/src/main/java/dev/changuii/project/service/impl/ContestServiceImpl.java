package dev.changuii.project.service.impl;


import dev.changuii.project.dto.ContestDto;
import dev.changuii.project.entity.ContestEntity;
import dev.changuii.project.enums.ErrorCode;
import dev.changuii.project.exception.CustomException;
import dev.changuii.project.repository.ContestRepository;
import dev.changuii.project.service.ContestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContestServiceImpl implements ContestService {

    private final ContestRepository contestRepository;
    private final KomoranMorphologicalAnalysisService komoranMorphologicalAnalysisService;
    public ContestServiceImpl(
            @Autowired  ContestRepository contestRepository,
            @Autowired KomoranMorphologicalAnalysisService komoranMorphologicalAnalysisService) {
        this.contestRepository = contestRepository;
        this.komoranMorphologicalAnalysisService=komoranMorphologicalAnalysisService;
    }

    @Override
    public ContestDto createContest(ContestDto contestDto) {
        ContestEntity contestEntity = ContestDto.dtoToEntity(contestDto);
        this.contestRepository.save(contestEntity);
        return ContestDto.entityToDto(contestEntity);
    }

    @Override
    public ContestDto readContest(Long contestId) {
        ContestEntity contestEntity = contestRepository.findById(contestId)
                .orElseThrow(() -> new CustomException(ErrorCode.CONTEST_NOT_FOUND));

        return ContestDto.entityToDto(contestEntity);
    }

    @Override
    public List<ContestDto> readByTitleContest(String keyword) {
        return ContestDto.entityToDtoList(
                this.contestRepository.findByTitleContaining(keyword));
    }

    @Override
    public List<ContestDto> readByOrdinaryStringContest(String ordinary) {
        return ContestDto.entityToDtoList(
                this.contestRepository.findByKeywords(
                this.komoranMorphologicalAnalysisService.extractNoun(ordinary)));
    }

    @Override
    public List<ContestDto> readAllContests() {
        List<ContestEntity> contestEntities = this.contestRepository.findAll();
        return ContestDto.entityToDtoList(contestEntities);
    }

    @Override
    public void deleteContest(Long contestId) {
        this.contestRepository.deleteById(contestId);
    }
}
