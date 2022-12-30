package com.ahl.annahockeyleague.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Getter
@Setter
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int team1Id;
    private int team2Id;
    private int team1GoalCount;
    private int team2GoalCount;
    private int winningTeamId;
    private int losingTeamId;
    private Date date;
    private Timestamp timestamp;
    private Date createdDate;
}
