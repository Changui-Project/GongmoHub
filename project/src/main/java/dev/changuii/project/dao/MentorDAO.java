package dev.changuii.project.dao;

import dev.changuii.project.entity.MentorEntity;

import java.util.List;

public interface MentorDAO {
    MentorEntity createMentor(MentorEntity mentor);
    MentorEntity readMentor(Long id);
    List<MentorEntity> readAllMentors();
    void deleteMentor(Long id);
}
