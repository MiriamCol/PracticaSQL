package com.repsol.repsol.controller;

import com.repsol.repsol.model.Participant;
import com.repsol.repsol.service.ParticipantService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/api/v1")

public class ParticipantController
{
    @Autowired
    private ParticipantService participantService;

    @GetMapping("/participants")
    public ResponseEntity<Iterable<Participant>> retrieveParticipants(@RequestParam(required = false) String age)
    {
        Iterable<Participant> response= participantService.retrieveParticipants(age);
        return ResponseEntity.ok().body(response);
    }

    /*
    @PostMapping("/participants")

    public ResponseEntity<Participant> createParticipant(@RequestBody Participant participant)
    {
        Participant newParticipant= participantService.createParticipant(participant);
        return ResponseEntity.ok().body(newParticipant);

    }
     */

    @GetMapping("/participants/{id}/")
    public ResponseEntity<Participant> retrieveParticipant(@PathVariable String id)
    {
        Participant response= participantService.retrieveParticipant(id);
        return ResponseEntity.ok().body(response);
    }

    @PutMapping("/participants/{id}/")
    public ResponseEntity<Participant> updateParticipant(@PathVariable String id, @RequestBody Participant participant)
    {
        Participant newParticipant= participantService.updateParticipant(id,participant);
        if(newParticipant==null)
        {
            return ResponseEntity.badRequest().body(null);
        }

        return ResponseEntity.ok().body(newParticipant);

    }
    @DeleteMapping("/participants/{id}/")
    public ResponseEntity<Participant> deleteParticipant(@PathVariable String id)
    {
        participantService.deleteParticipant(id);
        return ResponseEntity.noContent().build();
    }







}