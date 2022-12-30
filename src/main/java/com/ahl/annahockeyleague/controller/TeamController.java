package com.ahl.annahockeyleague.controller;

import com.ahl.annahockeyleague.model.Team;
import com.ahl.annahockeyleague.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @PostMapping("/team")
    public ResponseEntity<Team> createTeam(@RequestBody Team team){
        return new ResponseEntity<>(teamService.saveTeam(team), HttpStatus.CREATED);
    }

    @GetMapping("/team/{id}")
    public ResponseEntity<Team> getTeam(@PathVariable Integer id){
        return new ResponseEntity<>(teamService.getTeam(id), HttpStatus.OK);
    }

    @GetMapping("/teams")
    public ResponseEntity<List<Team>> getAllTeams(){
        return new ResponseEntity<>(teamService.getAllTeams(), HttpStatus.OK);
    }
}
