package RentalProject;

import java.util.Date;

public class Movie extends Item{

    private String director;
    private String[] cast;

    public Movie(String title, String genre, String director, String[] cast, Integer ID, Date releaseDate){
        super(title, genre, ID, releaseDate);
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
