package com.example.IQNextAssignment.service;

import com.example.IQNextAssignment.entity.PlayerStats;

import java.util.List;


public interface PlayerStatisticsService {

    public PlayerStats getPlayerById(int id);

    public List<PlayerStats> getAllPlayer();

    public List<PlayerStats> getFilteredPlayersStatistics(PlayerStats playerStats);
}
