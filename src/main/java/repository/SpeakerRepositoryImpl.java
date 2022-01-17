package repository;

import model.Speaker;

import java.util.ArrayList;
import java.util.List;

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
