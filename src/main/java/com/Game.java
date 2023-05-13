package com;


import java.sql.Date;

public class Game extends Item{
    
    private String director;
    private int gameRate;
    private String aboutGame;
    private String manufacturer;

    

    public Game(String title, String genre, Integer id, Date releaseDate, boolean isAvailable,
            String director, int gameRate, String aboutGame, String manufacturer) {
        super(title, genre, id, releaseDate, isAvailable);
        this.director = director;
        this.gameRate = gameRate;
        this.aboutGame = aboutGame;
        this.manufacturer = manufacturer;
    }

    public String getDirector() {
        return director;
    }

    public int getGameRate() {
        return gameRate;
    }


    public String getAboutGame() {
        return aboutGame;
    }


    public String getManufacturer() {
        return manufacturer;
    }

}
