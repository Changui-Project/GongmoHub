package dev.changuii.project.repository;

import dev.changuii.project.entity.ContestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContestRepository extends JpaRepository<ContestEntity,Long>, ContestCustomRepository {

    List<ContestEntity> findByTitleContaining(String keyword);
}
