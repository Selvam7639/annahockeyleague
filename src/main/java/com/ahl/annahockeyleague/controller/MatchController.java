package com.ahl.annahockeyleague.controller;

import com.ahl.annahockeyleague.model.Match;
import com.ahl.annahockeyleague.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MatchController {

    @Autowired
    private MatchService matchService;

    @PostMapping("/match")
    public ResponseEntity<Match> createMatch(@RequestBody Match match){
        return new ResponseEntity<>(matchService.saveMatch(match), HttpStatus.CREATED);
    }

    @GetMapping("/match/{id}")
    public ResponseEntity<Match> getMatch(@PathVariable Integer id){
        return new ResponseEntity<>(matchService.getMatch(id), HttpStatus.OK);
    }

    @GetMapping("/matches")
    public ResponseEntity<List<Match>> getAllMatches(){
        return new ResponseEntity<>(matchService.getAllMatches(), HttpStatus.OK);
    }
}
