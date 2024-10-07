package dev.changuii.project.service.impl;

import dev.changuii.project.service.MorphologicalAnalysisService;
import kr.co.shineware.nlp.komoran.core.Komoran;
import kr.co.shineware.nlp.komoran.model.KomoranResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class KomoranMorphologicalAnalysisService implements MorphologicalAnalysisService {

    public static final Logger logger = LoggerFactory.getLogger(KomoranMorphologicalAnalysisService.class);

    private Komoran komoran;

    public KomoranMorphologicalAnalysisService(
            @Autowired Komoran komoran
    ){
        this.komoran=komoran;
    }

    @Override
    public List<String> extractNoun(String text) {
        logger.info("형태소 분석을 시작합니다.");
        logger.info("input : " + text);

        text = removeSpecialCharacters(text);
        logger.info("특수문자 제거 및 앞뒤 공백 제거 : " + text);

        KomoranResult analyzeResultList = this.komoran.analyze(text);

        List<String> result = analyzeResultList.getNouns();
        logger.info("result : " + result);
        return result == null ? new ArrayList<>() : result;
    }

    public String removeSpecialCharacters(String text){
        return text.replace("[^가-힣a-zA-Z0-9", " ").trim();
    }
}
