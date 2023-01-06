package com.example.IQNextAssignment.serviceImpl;

import com.example.IQNextAssignment.entity.PlayerDefence;
import com.example.IQNextAssignment.repository.PlayerDefenseRepository;
import com.example.IQNextAssignment.service.PlayerDefenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerDefenseServiceImpl implements PlayerDefenseService {
    @Autowired
    private PlayerDefenseRepository playerDefenseRepository;

    // Implementation method to get player's defense data by id
    @Override
    public PlayerDefence getPlayerDefenseById(int id) {
        return playerDefenseRepository.findById(id).orElse(null);
    }

    // Implementation method to get all player's defense data
    @Override
    public List<PlayerDefence> getAllPlayersDefenseDatas() {
        return playerDefenseRepository.findAll();
    }

    // Implementation method to get player's filtered defense data based on filter request
    @Override
    public List<PlayerDefence> getFilteredPlayerDefenseData(PlayerDefence playerDefence) {
        List<PlayerDefence> filteredPlayerDefenseDetails = playerDefenseRepository.getFilteredData(playerDefence.getPosition(), playerDefence.getTeam(),
                playerDefence.getTackles(), playerDefence.getTacklesWon());
        return filteredPlayerDefenseDetails;
    }
}
