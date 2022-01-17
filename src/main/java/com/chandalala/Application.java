package com.chandalala;

import com.chandalala.service.SpeakerServiceImpl;

public class Application {

    public static void main(String[] args) {


        SpeakerServiceImpl speakerService = new SpeakerServiceImpl();
        System.out.printf(speakerService.findAll().get(0).getName());
    }
}
