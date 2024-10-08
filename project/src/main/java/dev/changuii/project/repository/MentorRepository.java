package dev.changuii.project.repository;

import dev.changuii.project.entity.MentorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MentorRepository extends JpaRepository<MentorEntity,Long> {

    Optional<MentorEntity> findByEmail(String email);
}
