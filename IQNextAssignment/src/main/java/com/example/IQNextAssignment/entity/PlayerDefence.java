package com.example.IQNextAssignment.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "player_defence")
public class PlayerDefence {
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

    @Column(name = "minutes_90s")
    private Double minutes90S;

    @Column(name = "tackles")
    private Integer tackles;

    @Column(name = "tackles_won")
    private Integer tacklesWon;

    @Column(name = "tackles_def_3rd")
    private Integer tacklesDef3Rd;

    @Column(name = "tackles_mid_3rd")
    private Integer tacklesMid3Rd;

    @Column(name = "tackles_att_3rd")
    private Integer tacklesAtt3Rd;

    @Column(name = "dribble_tackles")
    private Integer dribbleTackles;

    @Column(name = "dribbles_vs")
    private Integer dribblesVs;

    @Column(name = "dribble_tackles_pct")
    private Double dribbleTacklesPct;

    @Column(name = "dribbled_past")
    private Integer dribbledPast;

    @Column(name = "blocks")
    private Integer blocks;

    @Column(name = "blocked_shots")
    private Integer blockedShots;

    @Column(name = "blocked_passes")
    private Integer blockedPasses;

    @Column(name = "interceptions")
    private Integer interceptions;

    @Column(name = "tackles_interceptions")
    private Integer tacklesInterceptions;

    @Column(name = "clearances")
    private Integer clearances;

    @Column(name = "errors")
    private Integer errors;

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

    public Double getMinutes90S() {
        return this.minutes90S;
    }

    public void setMinutes90S(Double minutes90S) {
        this.minutes90S = minutes90S;
    }

    public Integer getTackles() {
        return this.tackles;
    }

    public void setTackles(Integer tackles) {
        this.tackles = tackles;
    }

    public Integer getTacklesWon() {
        return this.tacklesWon;
    }

    public void setTacklesWon(Integer tacklesWon) {
        this.tacklesWon = tacklesWon;
    }

    public Integer getTacklesDef3Rd() {
        return this.tacklesDef3Rd;
    }

    public void setTacklesDef3Rd(Integer tacklesDef3Rd) {
        this.tacklesDef3Rd = tacklesDef3Rd;
    }

    public Integer getTacklesMid3Rd() {
        return this.tacklesMid3Rd;
    }

    public void setTacklesMid3Rd(Integer tacklesMid3Rd) {
        this.tacklesMid3Rd = tacklesMid3Rd;
    }

    public Integer getTacklesAtt3Rd() {
        return this.tacklesAtt3Rd;
    }

    public void setTacklesAtt3Rd(Integer tacklesAtt3Rd) {
        this.tacklesAtt3Rd = tacklesAtt3Rd;
    }

    public Integer getDribbleTackles() {
        return this.dribbleTackles;
    }

    public void setDribbleTackles(Integer dribbleTackles) {
        this.dribbleTackles = dribbleTackles;
    }

    public Integer getDribblesVs() {
        return this.dribblesVs;
    }

    public void setDribblesVs(Integer dribblesVs) {
        this.dribblesVs = dribblesVs;
    }

    public Double getDribbleTacklesPct() {
        return this.dribbleTacklesPct;
    }

    public void setDribbleTacklesPct(Double dribbleTacklesPct) {
        this.dribbleTacklesPct = dribbleTacklesPct;
    }

    public Integer getDribbledPast() {
        return this.dribbledPast;
    }

    public void setDribbledPast(Integer dribbledPast) {
        this.dribbledPast = dribbledPast;
    }

    public Integer getBlocks() {
        return this.blocks;
    }

    public void setBlocks(Integer blocks) {
        this.blocks = blocks;
    }

    public Integer getBlockedShots() {
        return this.blockedShots;
    }

    public void setBlockedShots(Integer blockedShots) {
        this.blockedShots = blockedShots;
    }

    public Integer getBlockedPasses() {
        return this.blockedPasses;
    }

    public void setBlockedPasses(Integer blockedPasses) {
        this.blockedPasses = blockedPasses;
    }

    public Integer getInterceptions() {
        return this.interceptions;
    }

    public void setInterceptions(Integer interceptions) {
        this.interceptions = interceptions;
    }

    public Integer getTacklesInterceptions() {
        return this.tacklesInterceptions;
    }

    public void setTacklesInterceptions(Integer tacklesInterceptions) {
        this.tacklesInterceptions = tacklesInterceptions;
    }

    public Integer getClearances() {
        return this.clearances;
    }

    public void setClearances(Integer clearances) {
        this.clearances = clearances;
    }

    public Integer getErrors() {
        return this.errors;
    }

    public void setErrors(Integer errors) {
        this.errors = errors;
    }
}
