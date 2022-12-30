package com.ahl.annahockeyleague.service;

import com.ahl.annahockeyleague.model.Team;
import com.ahl.annahockeyleague.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public Team saveTeam(Team team){
        return teamRepository.save(team);
    }

    public Team getTeam(Integer id){
        return teamRepository.findById(id).get();
    }

    public List<Team> getAllTeams(){
        return teamRepository.findAll();
    }
}
