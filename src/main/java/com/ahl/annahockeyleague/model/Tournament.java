package com.ahl.annahockeyleague.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Tournament {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private long year;
    private String isActive;
    private String tagLine;

    @OneToMany(mappedBy = "tournament")
    private List<Team> teams;

    @JsonManagedReference
    public List<Team> getTeams(){
        return this.teams;
    }

    @OneToMany(mappedBy = "tournament")
    private List<Match> matches;

    @JsonManagedReference
    public List<Match> getMatches(){
        return this.matches;
    }
}
