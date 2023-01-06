package com.example.IQNextAssignment.controller;

import com.example.IQNextAssignment.entity.PlayerDefence;
import com.example.IQNextAssignment.service.PlayerDefenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/fifa/api/v1/defense")
@RestController
public class PlayerDefenseController {
    @Autowired
    private PlayerDefenseService playerDefenseService;

    @GetMapping("{id}")
    public PlayerDefence findPlayerDefenseById(@PathVariable int id) {
        return playerDefenseService.getPlayerDefenseById(id);
    }

    @GetMapping("/get-all-details")
    public List<PlayerDefence> getAllPlayersDefenseDatas() {
        return playerDefenseService.getAllPlayersDefenseDatas();
    }

    @PostMapping("/apply-filter")
    public List<PlayerDefence> getFilteredPlayerDefenseData(@RequestBody PlayerDefence playerDefence) {
        return playerDefenseService.getFilteredPlayerDefenseData(playerDefence);
    }
}
