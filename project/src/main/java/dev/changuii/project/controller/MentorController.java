package dev.changuii.project.controller;

import dev.changuii.project.dto.MentorDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mentor")
public class MentorController {
    @PostMapping("/create")
    public ResponseEntity<MentorDto> createMentor(@RequestBody MentorDto mentorDto){

    }

}
