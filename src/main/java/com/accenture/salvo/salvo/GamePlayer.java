package com.accenture.salvo.salvo;

import com.accenture.salvo.salvo.Game;
import com.accenture.salvo.salvo.Player;
import javax.persistence.ManyToOne;
import javax.persistence.*;
import java.util.Date;

@Entity
public class GamePlayer {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)//
    private long id;
    private Date date;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="player_id")
    private Player player;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="game_id")
    private Game game;


    public GamePlayer() { }

 public GamePlayer (Date date, Game game, Player player) {
        this.date = date;
        this.game = game;
        this.player = player;
    }

    public void setPlayer (Player player){
        this.player = player;
    }

    public Player getPlayer(){
        return player;
    }

    public void setGame(Game game){
        this.game = game;
    }

    public Game getGame() {
        return game;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public Date getDate(){
        return date;
    }

}


