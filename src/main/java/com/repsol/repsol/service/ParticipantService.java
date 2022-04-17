package com.repsol.repsol.service;

import com.repsol.repsol.model.Participant;

public interface ParticipantService
{
    Iterable<Participant> retrieveParticipants(String age);
    Participant retrieveParticipant(String id);
    Participant updateParticipant(String id, Participant participant);
    void deleteParticipant(String id);
}