package dev.changuii.project.service;

import dev.changuii.project.dto.MentorDto;
import dev.changuii.project.dto.TokenDto;

import java.util.List;

public interface MentorService {
    MentorDto createMentor(MentorDto mentorDto);

    TokenDto signinMentor(MentorDto mentorDto);
    MentorDto readMentor(Long id);
    List<MentorDto> readAllMentors();
    void deleteMentor(Long id);
}
