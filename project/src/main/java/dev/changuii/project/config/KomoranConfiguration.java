package dev.changuii.project.config;


import kr.co.shineware.nlp.komoran.constant.DEFAULT_MODEL;
import kr.co.shineware.nlp.komoran.core.Komoran;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KomoranConfiguration {


    @Bean
    public Komoran regsiterKomoranBean(){
        return new Komoran(DEFAULT_MODEL.FULL);
    }
}
