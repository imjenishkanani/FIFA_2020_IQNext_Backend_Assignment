package com.example.IQNextAssignment.controller;

import com.example.IQNextAssignment.entity.PlayerStats;
import com.example.IQNextAssignment.service.PlayerStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/fifa/api/v1/statistics")
@RestController
public class PlayerStatisticsController {
    @Autowired
    private PlayerStatisticsService service;

    @GetMapping("{id}")
    public PlayerStats findPlayerById(@PathVariable int id) {
        return service.getPlayerById(id);
    }

    @GetMapping("/get-all-details")
    public List<PlayerStats> getAllPlayer() {
        return service.getAllPlayer();
    }

    @PostMapping("/apply-filter")
    public List<PlayerStats> getFilteredPlayersStatistics(@RequestBody PlayerStats playerStats) {
        return service.getFilteredPlayersStatistics(playerStats);
    }
}
