package dev.changuii.project.controller;


import dev.changuii.project.service.MorphologicalAnalysisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/analysis")
public class MorphologicalAnalysisController {

    private MorphologicalAnalysisService morphologicalAnalysisService;

    public MorphologicalAnalysisController(
            @Autowired MorphologicalAnalysisService morphologicalAnalysisService
    ){
        this.morphologicalAnalysisService=morphologicalAnalysisService;
    }



    @GetMapping("/{text}")
    public ResponseEntity<List<String>> getNoun(
            @PathVariable("text") String text
    ){
        return ResponseEntity.status(HttpStatus.OK)
                .body(this.morphologicalAnalysisService.extractNoun(text));
    }

}
