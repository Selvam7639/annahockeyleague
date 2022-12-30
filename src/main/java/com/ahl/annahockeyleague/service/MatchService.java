package com.ahl.annahockeyleague.service;

import com.ahl.annahockeyleague.model.Match;
import com.ahl.annahockeyleague.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchService {

    @Autowired
    private MatchRepository matchRepository;

    public Match saveMatch(Match match){
        return matchRepository.save(match);
    }

    public Match getMatch(Integer id){
        return matchRepository.findById(id).get();
    }

    public List<Match> getAllMatches(){
        return matchRepository.findAll();
    }
}
