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
        mentorDAO.createMentor(mentorEntity);
        return MentorDto.entityToDto(mentorEntity);
    }

    @Override
    public MentorDto readMentor(Long id) {
        MentorEntity mentorEntity = mentorDAO.readMentor(id);
        return MentorDto.entityToDto(mentorEntity);
    }

    @Override
    public List<MentorDto> readAllMentors() {
        List<MentorEntity> mentorEntities = mentorDAO.readAllMentors();
        return MentorDto.entityToDtoList(mentorEntities);
    }

    @Override
    public void deleteMentor(Long id) {
        mentorDAO.deleteMentor(id);
    }
}
