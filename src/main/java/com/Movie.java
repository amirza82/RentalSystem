package com;

import java.util.Date;

public class Movie extends Item{

    private String director;
    private String[] cast;

    public Movie(String title, String genre, String director, String[] cast, Integer id, Date releaseDate, boolean isAvailable){
        super(title, genre, id, releaseDate, isAvailable);
        this.director = director;
        this.cast = cast;
    }

    public String getDirector() {
        return director;
    }

    public String[] getCast() {
        return cast;
    }

}
