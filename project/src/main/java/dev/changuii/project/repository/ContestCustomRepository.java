package dev.changuii.project.repository;

import dev.changuii.project.entity.ContestEntity;

import java.util.List;

public interface ContestCustomRepository {

    List<ContestEntity> findByKeywords(List<String> keywords);
}
