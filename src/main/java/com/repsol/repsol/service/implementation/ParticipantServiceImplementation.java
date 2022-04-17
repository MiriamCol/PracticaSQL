package com.repsol.repsol.service.implementation;

import com.repsol.repsol.model.Participant;
import com.repsol.repsol.repository.ParticipantRepository;
import com.repsol.repsol.service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParticipantServiceImplementation implements ParticipantService {
    @Autowired
    private ParticipantRepository participantRepository;
    public Iterable<Participant> getParticipants(String age)
    {
        if(age==null)
            return participantRepository.findAll();
        else
        {
            int ageInt=Integer.parseInt(age);
            return participantRepository.getParticipantByAge(ageInt);

        }
    }

    @Override
    public Participant updateParticipant(String id, Participant participant){
        if(participantRepository.existsById(id))
        {
            return participantRepository.save(participant);
        }
        else
        {
            return null;
        }
    }
    @Override
    public void deleteParticipant(String id)
    {
        participantRepository.deleteById(id);
    }



}
