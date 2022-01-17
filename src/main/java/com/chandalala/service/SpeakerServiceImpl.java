package com.chandalala.service;

import com.chandalala.model.Speaker;
import com.chandalala.repository.SpeakerRepositoryImpl;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    SpeakerRepositoryImpl speakerRepository = new SpeakerRepositoryImpl();
    @Override
    public List<Speaker> findAll() {
        return speakerRepository.findAll();
    }
}
