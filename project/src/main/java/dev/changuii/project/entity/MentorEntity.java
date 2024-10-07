package dev.changuii.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity(name = "mentor")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class MentorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mentorId; // 멘토번호
    private String Id; // 아이디
    private String password; // 비밀번호
    private String name; // 이름
    private String content; // 본인 설명
    private String record; // 이력
    private String openTalkURL; // 오픈 채팅방 링크
    private String imageURL; // 사진
}