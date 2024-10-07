package dev.changuii.project.dao.impl;

import dev.changuii.project.dao.MentorDAO;
import dev.changuii.project.entity.MentorEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MentorDAOImpl implements MentorDAO {
    @Override
    public MentorEntity createMentor(MentorEntity mentor) {
        return null;
    }

    @Override
    public MentorEntity readMentor(Long id) {
        return null;
    }

    @Override
    public List<MentorEntity> readAllMentors() {
        return List.of();
    }

    @Override
    public void deleteMentor(Long id) {

    }
}
