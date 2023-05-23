package com;


import java.sql.Date;

public class Game extends Item{
    
    private String director;
    private float gameRate;
    private String aboutGame;
    private String manufacturer;

    

    public Game(String title, String genre, Integer id, Date releaseDate, boolean isAvailable,
            String director, float gameRate, String aboutGame, String manufacturer) {
        super(title, genre, id, releaseDate, isAvailable);
        this.director = director;
        this.gameRate = gameRate;
        this.aboutGame = aboutGame;
        this.manufacturer = manufacturer;
    }

    public String getDirector() {
        return director;
    }

    public float getGameRate() {
        return gameRate;
    }


    public String getAboutGame() {
        return aboutGame;
    }


    public String getManufacturer() {
        return manufacturer;
    }

}
