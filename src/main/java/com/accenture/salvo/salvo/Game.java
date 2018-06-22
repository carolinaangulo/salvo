package com.accenture.salvo.salvo;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Date date;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "player_id")
    private Player player;


    @OneToMany(mappedBy="game", fetch=FetchType.EAGER)
    Set<Player> players = new HashSet<>();


    public Game() {
    }

    public Game(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate (Date date){
        this.date = date;
    }


    public Set<Player> getPlayers() {
        return players;

    }
}
