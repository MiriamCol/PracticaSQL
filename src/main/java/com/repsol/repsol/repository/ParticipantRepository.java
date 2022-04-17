package com.repsol.repsol.repository;

import com.repsol.repsol.model.Participant;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;


public interface ParticipantRepository extends CrudRepository<Participant, String>
{
    @Query("SELECT * FROM PARTICIPANT WHERE PARTICIPANT.AGE= :age")
    public Iterable<Participant> getParticipantByAge(int age);

    /*
    @Query("INSERT INTO PARTICIPANT VALUES(:participant.id, :participant.name_participant, :participant.age, :participant.description")
    public Participant createParticipant(String id, String name_participant, int age, String description);
    */
}

