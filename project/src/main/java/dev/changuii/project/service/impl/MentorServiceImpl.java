package dev.changuii.project.service.impl;

import dev.changuii.project.dto.MentorDto;
import dev.changuii.project.dto.TokenDto;
import dev.changuii.project.entity.MentorEntity;
import dev.changuii.project.enums.ErrorCode;
import dev.changuii.project.exception.CustomException;
import dev.changuii.project.repository.MentorRepository;
import dev.changuii.project.security.service.JwtProvider;
import dev.changuii.project.service.MentorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MentorServiceImpl implements MentorService {

    private final MentorRepository mentorRepository;

    private final JwtProvider jwtProvider;
    public MentorServiceImpl(
            @Autowired MentorRepository mentorRepository,
            @Autowired JwtProvider jwtProvider
    ) {
        this.mentorRepository= mentorRepository;
        this.jwtProvider=jwtProvider;
    }

    @Override
    public MentorDto createMentor(MentorDto mentorDto) {
        MentorEntity mentorEntity = MentorDto.dtoToEntity(mentorDto);
        mentorRepository.save(mentorEntity);
        return MentorDto.entityToDto(mentorEntity);
    }

    @Override
    public TokenDto signinMentor(MentorDto mentorDto) {
        MentorEntity mentor = mentorRepository.findById(mentorDto.getMentorId())
                .orElseThrow(() -> new CustomException(ErrorCode.USER_NOT_FOUND));

        // 일치
        if(mentor.getPassword().equals(mentor.getPassword())){
            return TokenDto.builder()
                    .token(this.jwtProvider.createAccessToken(mentorDto.getName()))
                    .build();
        }

        throw new CustomException(ErrorCode.INVALID_PASSWORD);
    }

    @Override
    public MentorDto readMentor(Long id) {
        MentorEntity mentorEntity = this.mentorRepository.findById(id)
                .orElseThrow(() -> new CustomException(ErrorCode.USER_NOT_FOUND));
        return MentorDto.entityToDto(mentorEntity);
    }

    @Override
    public List<MentorDto> readAllMentors() {
        List<MentorEntity> mentorEntities = this.mentorRepository.findAll();
        return MentorDto.entityToDtoList(mentorEntities);
    }

    @Override
    public void deleteMentor(Long id) {
        this.mentorRepository.deleteById(id);
    }

    @Override
    public void deleteByEmailAndPassword(String email, String password) {
        MentorEntity m = this.mentorRepository.findByEmail(email)
                .orElseThrow(() -> new CustomException(ErrorCode.USER_NOT_FOUND));

        if(m.getPassword().equals(password))
            throw new CustomException(ErrorCode.INVALID_PASSWORD);

        this.mentorRepository.deleteById(m.getMentorId());
    }
}
