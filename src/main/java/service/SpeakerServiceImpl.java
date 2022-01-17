package service;

import model.Speaker;
import repository.SpeakerRepositoryImpl;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    SpeakerRepositoryImpl speakerRepository = new SpeakerRepositoryImpl();
    @Override
    public List<Speaker> findAll() {
        return speakerRepository.findAll();
    }
}
