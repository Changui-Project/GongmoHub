package dev.changuii.project.service.impl;

import dev.changuii.project.dao.impl.MentorDAOImpl;
import dev.changuii.project.dto.MentorDto;
import dev.changuii.project.entity.MentorEntity;
import dev.changuii.project.service.MentorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MentorServiceImpl implements MentorService {

    private final MentorDAOImpl mentorDAO;
    public MentorServiceImpl(MentorDAOImpl mentorDAO) {
        this.mentorDAO = mentorDAO;
    }
    @Override
    public MentorDto createMentor(MentorDto mentorDto) {
        MentorEntity mentorEntity = MentorDto.dtoToEntity(mentorDto);
    }

    @Override
    public MentorDto readMentor(Long id) {
        return null;
    }

    @Override
    public List<MentorDto> readAllMentors() {
        return List.of();
    }

    @Override
    public void deleteMentor(Long id) {

    }
}
