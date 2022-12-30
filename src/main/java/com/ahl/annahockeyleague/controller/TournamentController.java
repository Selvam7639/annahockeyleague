package com.ahl.annahockeyleague.controller;

import com.ahl.annahockeyleague.model.Tournament;
import com.ahl.annahockeyleague.service.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TournamentController {

    @Autowired
    private TournamentService tournamentService;

    @PostMapping("/tournament")
    public ResponseEntity<Tournament> saveTournament(@RequestBody Tournament tournament){
        return new ResponseEntity<>(tournamentService.saveTournament(tournament), HttpStatus.CREATED);
    }

    @GetMapping("/tournament/{id}")
    public ResponseEntity<Tournament> getTournament(@PathVariable Integer id){
        return new ResponseEntity<>(tournamentService.getTournament(id), HttpStatus.OK);
    }

    @GetMapping("/tournaments")
    public ResponseEntity<List<Tournament>> getAllTournaments(){
        return new ResponseEntity<>(tournamentService.getAllTournaments(), HttpStatus.OK);
    }

}
