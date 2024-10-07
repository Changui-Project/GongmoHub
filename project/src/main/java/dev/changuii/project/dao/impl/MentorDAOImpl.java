package dev.changuii.project.dao.impl;

import dev.changuii.project.dao.MentorDAO;
import dev.changuii.project.entity.MentorEntity;
import dev.changuii.project.repository.MentorRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MentorDAOImpl implements MentorDAO {

    private final MentorRepository mentorRepository;
    public MentorDAOImpl(MentorRepository mentorRepository) {
        this.mentorRepository = mentorRepository;
    }

    @Override
    public void createMentor(MentorEntity mentor) {
        mentorRepository.save(mentor);
    }

    @Override
    public MentorEntity readMentor(Long id) {
        return mentorRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("멘토가 존재하지 않습니다."));
    }

    @Override
    public List<MentorEntity> readAllMentors() {
        return mentorRepository.findAll();
    }

    @Override
    public void deleteMentor(Long id) {
        mentorRepository.deleteById(id);
    }
}
