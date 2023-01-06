package com.example.IQNextAssignment.service;

import com.example.IQNextAssignment.entity.PlayerDefence;
import com.example.IQNextAssignment.entity.PlayerStats;

import java.util.List;

public interface PlayerDefenseService {
    public PlayerDefence getPlayerDefenseById(int id);

    public List<PlayerDefence> getAllPlayersDefenseDatas();

    public List<PlayerDefence> getFilteredPlayerDefenseData(PlayerDefence playerDefence);
}
