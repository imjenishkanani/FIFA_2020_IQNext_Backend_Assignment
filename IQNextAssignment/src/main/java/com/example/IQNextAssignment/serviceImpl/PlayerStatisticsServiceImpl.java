package com.example.IQNextAssignment.serviceImpl;

import com.example.IQNextAssignment.entity.PlayerStats;
import com.example.IQNextAssignment.repository.PlayerStatisticsRepository;
import com.example.IQNextAssignment.service.PlayerStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerStatisticsServiceImpl implements PlayerStatisticsService {
    @Autowired
    private PlayerStatisticsRepository playerStatisticsRepository;

    // Implementation method to get player's statistics by id
    @Override
    public PlayerStats getPlayerById(int id) {
        return playerStatisticsRepository.findById(id).orElse(null);
    }

    // Implementation method to get all player's statistics
    @Override
    public List<PlayerStats> getAllPlayer() {
        return playerStatisticsRepository.findAll();
    }

    // Implementation method to get player's filtered statistics based on filter request
    @Override
    public List<PlayerStats> getFilteredPlayersStatistics(PlayerStats playerStats) {
        List<PlayerStats> filteredPlayerStatistics = playerStatisticsRepository.getFilteredStatistics(playerStats.getBirthYear(), playerStats.getGames(), playerStats.getMinutes(),playerStats.getGoals());
        return filteredPlayerStatistics;
    }
}
