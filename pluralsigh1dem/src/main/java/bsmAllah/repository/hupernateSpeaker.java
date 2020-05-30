package bsmAllah.repository;

import bsmAllah.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class hupernateSpeaker implements hupernateSpeakerInterface {


    @Override
    public List<Speaker> findAll() {

        List<Speaker> speakers= new ArrayList<>();

        Speaker speaker= new Speaker();

        speaker.setId(111);
        speaker.setName("AllahuAkbar");

        speakers.add(speaker);

        return speakers;
    }







}
