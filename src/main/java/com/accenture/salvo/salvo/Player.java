package com.accenture.salvo.salvo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
    public class Player {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;
        private String firstName;
        private String lastName;
        private String userName;

        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "game_id")
        private Game game;


        @OneToMany(mappedBy="player", fetch=FetchType.EAGER)
        Set<Game> games = new HashSet<>();


        public Player() {
        }

        public Player(String first, String last, String userName) {
                this.firstName = first;
                this.lastName = last;
                this.userName = userName;
            }

            public String getFirstName () {
                return firstName;
            }

            public void setFirstName (String firstName){
                this.firstName = firstName;
            }

            public String getLastName () {
                return lastName;
            }

            public void setLastName (String lastName){
                this.lastName = lastName;
            }

            public String getUserName () {
                return userName;
            }

            public void setUserName (String userName){
                this.userName = userName;
            }

             public Set<Game> getGames() {
             return games;
             }


            public String toString () {
                return firstName + " " + lastName + userName;
            }
        }



