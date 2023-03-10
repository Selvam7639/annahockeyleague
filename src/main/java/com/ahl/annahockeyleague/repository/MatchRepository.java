package com.ahl.annahockeyleague.repository;

import com.ahl.annahockeyleague.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRepository extends JpaRepository<Match, Integer> {

}
