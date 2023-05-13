package com;

import java.util.Date;

public class Item {

    private String title;
    private String genre;
    private Integer id;
    private Date releaseDate;
    private boolean isAvailable;


    public Item(String title, String genre, Integer id, Date releaseDate, boolean isAvailable){
        this.title = title;
        this.genre = genre;
        this.id = id;
        this.releaseDate = releaseDate;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public Integer getID() {
        return id;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

}
