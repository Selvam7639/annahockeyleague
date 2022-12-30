package com.ahl.annahockeyleague.service;

import com.ahl.annahockeyleague.model.Tournament;
import com.ahl.annahockeyleague.repository.TournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TournamentService {

    @Autowired
    private TournamentRepository tournamentRepository;

    public Tournament saveTournament(Tournament tournament){
        return tournamentRepository.save(tournament);
    }

    public Tournament getTournament(Integer id){
        return tournamentRepository.findById(id).get();
    }

    public List<Tournament> getAllTournaments(){
        return tournamentRepository.findAll();
    }
}
