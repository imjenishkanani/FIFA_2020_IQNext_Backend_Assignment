package com.example.IQNextAssignment.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "player_playing_time")
public class PlayerPlayingTime {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "player")
    private String player;

    @Column(name = "position")
    private String position;

    @Column(name = "team")
    private String team;

    @Column(name = "age")
    private String age;

    @Column(name = "birth_year")
    private Integer birthYear;

    @Column(name = "games")
    private Integer games;

    @Column(name = "minutes")
    private Integer minutes;

    @Column(name = "minutes_per_game")
    private Integer minutesPerGame;

    @Column(name = "minutes_pct")
    private Double minutesPct;

    @Column(name = "minutes_90s")
    private Double minutes90S;

    @Column(name = "games_starts")
    private Integer gamesStarts;

    @Column(name = "minutes_per_start")
    private Integer minutesPerStart;

    @Column(name = "games_complete")
    private Integer gamesComplete;

    @Column(name = "games_subs")
    private Integer gamesSubs;

    @Column(name = "minutes_per_sub")
    private Integer minutesPerSub;

    @Column(name = "unused_subs")
    private Integer unusedSubs;

    @Column(name = "points_per_game")
    private Double pointsPerGame;

    @Column(name = "on_goals_for")
    private Integer onGoalsFor;

    @Column(name = "on_goals_against")
    private Integer onGoalsAgainst;

    @Column(name = "plus_minus")
    private Integer plusMinus;

    @Column(name = "plus_minus_per90")
    private Double plusMinusPer90;

    @Column(name = "plus_minus_wowy")
    private Double plusMinusWowy;

    @Column(name = "on_xg_for")
    private Double onXgFor;

    @Column(name = "on_xg_against")
    private Double onXgAgainst;

    @Column(name = "xg_plus_minus")
    private Double xgPlusMinus;

    @Column(name = "xg_plus_minus_per90")
    private Double xgPlusMinusPer90;

    @Column(name = "xg_plus_minus_wowy")
    private Double xgPlusMinusWowy;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlayer() {
        return this.player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTeam() {
        return this.team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getAge() {
        return this.age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Integer getBirthYear() {
        return this.birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public Integer getGames() {
        return this.games;
    }

    public void setGames(Integer games) {
        this.games = games;
    }

    public Integer getMinutes() {
        return this.minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public Integer getMinutesPerGame() {
        return this.minutesPerGame;
    }

    public void setMinutesPerGame(Integer minutesPerGame) {
        this.minutesPerGame = minutesPerGame;
    }

    public Double getMinutesPct() {
        return this.minutesPct;
    }

    public void setMinutesPct(Double minutesPct) {
        this.minutesPct = minutesPct;
    }

    public Double getMinutes90S() {
        return this.minutes90S;
    }

    public void setMinutes90S(Double minutes90S) {
        this.minutes90S = minutes90S;
    }

    public Integer getGamesStarts() {
        return this.gamesStarts;
    }

    public void setGamesStarts(Integer gamesStarts) {
        this.gamesStarts = gamesStarts;
    }

    public Integer getMinutesPerStart() {
        return this.minutesPerStart;
    }

    public void setMinutesPerStart(Integer minutesPerStart) {
        this.minutesPerStart = minutesPerStart;
    }

    public Integer getGamesComplete() {
        return this.gamesComplete;
    }

    public void setGamesComplete(Integer gamesComplete) {
        this.gamesComplete = gamesComplete;
    }

    public Integer getGamesSubs() {
        return this.gamesSubs;
    }

    public void setGamesSubs(Integer gamesSubs) {
        this.gamesSubs = gamesSubs;
    }

    public Integer getMinutesPerSub() {
        return this.minutesPerSub;
    }

    public void setMinutesPerSub(Integer minutesPerSub) {
        this.minutesPerSub = minutesPerSub;
    }

    public Integer getUnusedSubs() {
        return this.unusedSubs;
    }

    public void setUnusedSubs(Integer unusedSubs) {
        this.unusedSubs = unusedSubs;
    }

    public Double getPointsPerGame() {
        return this.pointsPerGame;
    }

    public void setPointsPerGame(Double pointsPerGame) {
        this.pointsPerGame = pointsPerGame;
    }

    public Integer getOnGoalsFor() {
        return this.onGoalsFor;
    }

    public void setOnGoalsFor(Integer onGoalsFor) {
        this.onGoalsFor = onGoalsFor;
    }

    public Integer getOnGoalsAgainst() {
        return this.onGoalsAgainst;
    }

    public void setOnGoalsAgainst(Integer onGoalsAgainst) {
        this.onGoalsAgainst = onGoalsAgainst;
    }

    public Integer getPlusMinus() {
        return this.plusMinus;
    }

    public void setPlusMinus(Integer plusMinus) {
        this.plusMinus = plusMinus;
    }

    public Double getPlusMinusPer90() {
        return this.plusMinusPer90;
    }

    public void setPlusMinusPer90(Double plusMinusPer90) {
        this.plusMinusPer90 = plusMinusPer90;
    }

    public Double getPlusMinusWowy() {
        return this.plusMinusWowy;
    }

    public void setPlusMinusWowy(Double plusMinusWowy) {
        this.plusMinusWowy = plusMinusWowy;
    }

    public Double getOnXgFor() {
        return this.onXgFor;
    }

    public void setOnXgFor(Double onXgFor) {
        this.onXgFor = onXgFor;
    }

    public Double getOnXgAgainst() {
        return this.onXgAgainst;
    }

    public void setOnXgAgainst(Double onXgAgainst) {
        this.onXgAgainst = onXgAgainst;
    }

    public Double getXgPlusMinus() {
        return this.xgPlusMinus;
    }

    public void setXgPlusMinus(Double xgPlusMinus) {
        this.xgPlusMinus = xgPlusMinus;
    }

    public Double getXgPlusMinusPer90() {
        return this.xgPlusMinusPer90;
    }

    public void setXgPlusMinusPer90(Double xgPlusMinusPer90) {
        this.xgPlusMinusPer90 = xgPlusMinusPer90;
    }

    public Double getXgPlusMinusWowy() {
        return this.xgPlusMinusWowy;
    }

    public void setXgPlusMinusWowy(Double xgPlusMinusWowy) {
        this.xgPlusMinusWowy = xgPlusMinusWowy;
    }
}
