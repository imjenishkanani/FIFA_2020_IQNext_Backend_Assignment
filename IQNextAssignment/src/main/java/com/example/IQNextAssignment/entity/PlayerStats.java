package com.example.IQNextAssignment.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "player_stats")
public class PlayerStats {
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

    @Column(name = "club")
    private String club;

    @Column(name = "birth_year")
    private Integer birthYear;

    @Column(name = "games")
    private Integer games;

    @Column(name = "games_starts")
    private Integer gamesStarts;

    @Column(name = "minutes")
    private Integer minutes;

    @Column(name = "minutes_90s")
    private Double minutes90S;

    @Column(name = "goals")
    private Integer goals;

    @Column(name = "assists")
    private Integer assists;

    @Column(name = "goals_pens")
    private Integer goalsPens;

    @Column(name = "pens_made")
    private Integer pensMade;

    @Column(name = "pens_att")
    private Integer pensAtt;

    @Column(name = "cards_yellow")
    private Integer cardsYellow;

    @Column(name = "cards_red")
    private Integer cardsRed;

    @Column(name = "goals_per90")
    private Double goalsPer90;

    @Column(name = "assists_per90")
    private Double assistsPer90;

    @Column(name = "goals_assists_per90")
    private Double goalsAssistsPer90;

    @Column(name = "goals_pens_per90")
    private Double goalsPensPer90;

    @Column(name = "goals_assists_pens_per90")
    private Double goalsAssistsPensPer90;

    @Column(name = "xg")
    private Double xg;

    @Column(name = "npxg")
    private Double npxg;

    @Column(name = "xg_assist")
    private Double xgAssist;

    @Column(name = "npxg_xg_assist")
    private Double npxgXgAssist;

    @Column(name = "xg_per90")
    private Double xgPer90;

    @Column(name = "xg_assist_per90")
    private Double xgAssistPer90;

    @Column(name = "xg_xg_assist_per90")
    private Double xgXgAssistPer90;

    @Column(name = "npxg_per90")
    private Double npxgPer90;

    @Column(name = "npxg_xg_assist_per90")
    private Double npxgXgAssistPer90;

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

    public String getClub() {
        return this.club;
    }

    public void setClub(String club) {
        this.club = club;
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

    public Integer getGamesStarts() {
        return this.gamesStarts;
    }

    public void setGamesStarts(Integer gamesStarts) {
        this.gamesStarts = gamesStarts;
    }

    public Integer getMinutes() {
        return this.minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public Double getMinutes90S() {
        return this.minutes90S;
    }

    public void setMinutes90S(Double minutes90S) {
        this.minutes90S = minutes90S;
    }

    public Integer getGoals() {
        return this.goals;
    }

    public void setGoals(Integer goals) {
        this.goals = goals;
    }

    public Integer getAssists() {
        return this.assists;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    public Integer getGoalsPens() {
        return this.goalsPens;
    }

    public void setGoalsPens(Integer goalsPens) {
        this.goalsPens = goalsPens;
    }

    public Integer getPensMade() {
        return this.pensMade;
    }

    public void setPensMade(Integer pensMade) {
        this.pensMade = pensMade;
    }

    public Integer getPensAtt() {
        return this.pensAtt;
    }

    public void setPensAtt(Integer pensAtt) {
        this.pensAtt = pensAtt;
    }

    public Integer getCardsYellow() {
        return this.cardsYellow;
    }

    public void setCardsYellow(Integer cardsYellow) {
        this.cardsYellow = cardsYellow;
    }

    public Integer getCardsRed() {
        return this.cardsRed;
    }

    public void setCardsRed(Integer cardsRed) {
        this.cardsRed = cardsRed;
    }

    public Double getGoalsPer90() {
        return this.goalsPer90;
    }

    public void setGoalsPer90(Double goalsPer90) {
        this.goalsPer90 = goalsPer90;
    }

    public Double getAssistsPer90() {
        return this.assistsPer90;
    }

    public void setAssistsPer90(Double assistsPer90) {
        this.assistsPer90 = assistsPer90;
    }

    public Double getGoalsAssistsPer90() {
        return this.goalsAssistsPer90;
    }

    public void setGoalsAssistsPer90(Double goalsAssistsPer90) {
        this.goalsAssistsPer90 = goalsAssistsPer90;
    }

    public Double getGoalsPensPer90() {
        return this.goalsPensPer90;
    }

    public void setGoalsPensPer90(Double goalsPensPer90) {
        this.goalsPensPer90 = goalsPensPer90;
    }

    public Double getGoalsAssistsPensPer90() {
        return this.goalsAssistsPensPer90;
    }

    public void setGoalsAssistsPensPer90(Double goalsAssistsPensPer90) {
        this.goalsAssistsPensPer90 = goalsAssistsPensPer90;
    }

    public Double getXg() {
        return this.xg;
    }

    public void setXg(Double xg) {
        this.xg = xg;
    }

    public Double getNpxg() {
        return this.npxg;
    }

    public void setNpxg(Double npxg) {
        this.npxg = npxg;
    }

    public Double getXgAssist() {
        return this.xgAssist;
    }

    public void setXgAssist(Double xgAssist) {
        this.xgAssist = xgAssist;
    }

    public Double getNpxgXgAssist() {
        return this.npxgXgAssist;
    }

    public void setNpxgXgAssist(Double npxgXgAssist) {
        this.npxgXgAssist = npxgXgAssist;
    }

    public Double getXgPer90() {
        return this.xgPer90;
    }

    public void setXgPer90(Double xgPer90) {
        this.xgPer90 = xgPer90;
    }

    public Double getXgAssistPer90() {
        return this.xgAssistPer90;
    }

    public void setXgAssistPer90(Double xgAssistPer90) {
        this.xgAssistPer90 = xgAssistPer90;
    }

    public Double getXgXgAssistPer90() {
        return this.xgXgAssistPer90;
    }

    public void setXgXgAssistPer90(Double xgXgAssistPer90) {
        this.xgXgAssistPer90 = xgXgAssistPer90;
    }

    public Double getNpxgPer90() {
        return this.npxgPer90;
    }

    public void setNpxgPer90(Double npxgPer90) {
        this.npxgPer90 = npxgPer90;
    }

    public Double getNpxgXgAssistPer90() {
        return this.npxgXgAssistPer90;
    }

    public void setNpxgXgAssistPer90(Double npxgXgAssistPer90) {
        this.npxgXgAssistPer90 = npxgXgAssistPer90;
    }
}
