package com.chandalala.repository;

import com.chandalala.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
public class SpeakerRepositoryImpl implements SpeakerRepository{
    @Override
    public List<Speaker> findAll() {

        Speaker speaker = new Speaker();
        speaker.setName("Tinashe");
        speaker.setSurname("Chandalala");

        List<Speaker> speakers = new ArrayList<>();
        speakers.add(speaker);


        return speakers;
    }
}
