package com.repsol.repsol.model;


import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Builder
@Table("PARTICIPANT")
public class Participant
{
    @Id
    private String id;

    private String name_participant;
    private int age;
    private String description;
}

