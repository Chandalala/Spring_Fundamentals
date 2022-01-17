package com.chandalala;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import com.chandalala.repository.SpeakerRepository;
import com.chandalala.repository.SpeakerRepositoryImpl;
import com.chandalala.service.SpeakerService;
import com.chandalala.service.SpeakerServiceImpl;

@Configuration
@ComponentScan("com.chandalala")
public class AppConfig {

/*    @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService(){
            *//*        SpeakerServiceImpl speakerService = new SpeakerServiceImpl();
                    speakerService.setSpeakerRepository(getSpeakerRepository()); //Setter Injection*//*

            *//*
                    SpeakerServiceImpl speakerService = new SpeakerServiceImpl(getSpeakerRepository());
            *//*

        //Instead of the above its now autowired
        SpeakerServiceImpl speakerService = new SpeakerServiceImpl();



        return speakerService;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return  new SpeakerRepositoryImpl();
    }*/
}
