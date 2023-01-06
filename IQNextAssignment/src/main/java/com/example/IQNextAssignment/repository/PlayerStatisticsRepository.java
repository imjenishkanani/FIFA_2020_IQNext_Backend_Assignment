package com.example.IQNextAssignment.repository;

import com.example.IQNextAssignment.entity.PlayerStats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlayerStatisticsRepository extends JpaRepository<PlayerStats, Integer> {
    // Native query to filter Player's statistics
    @Query(nativeQuery = true, value = "SELECT * FROM player_stats WHERE birth_year = ?1 AND games = ?2 AND minutes = ?3 AND goals = ?4")
    public List<PlayerStats> getFilteredStatistics(@Param("birth_year") Integer birthYear, @Param("games") Integer games,
                                                   @Param("minutes") Integer minutes, @Param("goals") Integer goals);
}
