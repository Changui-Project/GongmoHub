package dev.changuii.project.service.impl;

import dev.changuii.project.dto.MentorDto;
import dev.changuii.project.service.MentorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MentorServiceImpl implements MentorService {
    @Override
    public MentorDto createMentor(MentorDto mentorDto) {
        return null;
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
