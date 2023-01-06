package com.example.IQNextAssignment.repository;

import com.example.IQNextAssignment.entity.PlayerDefence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlayerDefenseRepository extends JpaRepository<PlayerDefence, Integer> {
    // Native query to filter Player's defense details
    @Query(nativeQuery = true, value = "select * from player_defence where position = ?1 AND team = ?2 AND tackles = ?3 AND tackles_won = ?4")
    public List<PlayerDefence> getFilteredData(@Param("position") String position, @Param("team") String team, @Param("tackles") Integer tackles, @Param("tackles_won") Integer tackles_won);
}
