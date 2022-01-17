package com.chandalala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.chandalala.service.SpeakerService;

public class Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

/*
        SpeakerServiceImpl speakerService = new SpeakerServiceImpl();
*/

        SpeakerService speakerService = applicationContext.getBean("speakerService", SpeakerService.class);
        System.out.printf(speakerService.findAll().get(0).getName());
    }
}
