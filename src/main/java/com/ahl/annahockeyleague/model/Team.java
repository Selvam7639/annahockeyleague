package com.ahl.annahockeyleague.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String slogan;

    @ManyToOne
    @JoinColumn(name = "tournament_id",referencedColumnName = "id", nullable = false)
    private Tournament tournament;

    @JsonBackReference
    public Tournament getTournament(){
        return this.tournament;
    }

}
