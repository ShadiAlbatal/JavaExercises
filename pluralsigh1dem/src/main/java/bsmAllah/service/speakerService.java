package bsmAllah.service;

import bsmAllah.model.Speaker;
import bsmAllah.repository.hupernateSpeakerInterface;

import java.util.List;

public class speakerService {

    private hupernateSpeakerInterface hupernateSpeakerInterface= new hupernateSpeakerInterface();

        public List<Speaker> findAll() {
            return hupernateSpeakerInterface.findAll();
        }






}
