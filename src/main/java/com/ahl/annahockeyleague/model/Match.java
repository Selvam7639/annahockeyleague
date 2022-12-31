package com.ahl.annahockeyleague.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "matches")
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

    @ManyToOne
    @JoinColumn(name = "tournament_id",referencedColumnName = "id", nullable = false)
    private Tournament tournament;

    @JsonBackReference
    public Tournament getTournament(){
        return this.tournament;
    }
}
