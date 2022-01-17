package com.chandalala.repository;

import com.chandalala.model.Speaker;

import java.util.List;

public interface SpeakerRepository {

    public List<Speaker> findAll();
}
