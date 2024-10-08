package dev.changuii.project.dto;

import dev.changuii.project.entity.MentorEntity;
import lombok.*;

import java.util.List;
import java.util.stream.Collectors;

@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class MentorDto {
    private Long mentorId; // 멘토번호
    private String Id; // 아이디
    private String password; // 비밀번호
    private String name; // 이름
    private String content; // 본인 설명
    private String record; // 이력
    private String openTalkURL; // 오픈 채팅방 링크
    private String imageURL; // 사진

    public static MentorDto entityToDto(MentorEntity mentorEntity) {
        return MentorDto.builder()
                .mentorId(mentorEntity.getMentorId())
                .Id(mentorEntity.getEmail()) // 멘토 아이디
                .password(mentorEntity.getPassword()) // 비밀번호
                .name(mentorEntity.getName())
                .content(mentorEntity.getContent()) // 본인 설명
                .record(mentorEntity.getRecord()) // 이력
                .openTalkURL(mentorEntity.getOpenTalkURL()) // 오픈 채팅방 링크
                .imageURL(mentorEntity.getImageURL()) // 사진 URL
                .build();
    }

    public static List<MentorDto> entityToDtoList(List<MentorEntity> mentorEntities) {
        return mentorEntities.stream()
                .map(MentorDto::entityToDto)
                .collect(Collectors.toList());
    }

    public static MentorEntity dtoToEntity(MentorDto mentorDto) {
        return MentorEntity.builder()
                .email(mentorDto.getId()) // 멘토 아이디
                .password(mentorDto.getPassword()) // 비밀번호
                .name(mentorDto.getName())
                .content(mentorDto.getContent()) // 본인 설명
                .record(mentorDto.getRecord()) // 이력
                .openTalkURL(mentorDto.getOpenTalkURL()) // 오픈 채팅방 링크
                .imageURL(mentorDto.getImageURL()) // 사진 URL
                .build();
    }

}
