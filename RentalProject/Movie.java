package RentalProject;

import java.util.Date;

public class Movie {
    private String title;
    private String genre;
    private String director;
    private String[] cast;
    private Date releaseDate;
    private Integer movieID;
    private boolean isAvailable;
    
    
    

    public Movie(String title, String genre, String director, String[] cast, Date releaseDate, Integer movieID){
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.cast = cast;
        this.releaseDate = releaseDate;
        this.movieID = movieID;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getDirector() {
        return director;
    }

    public String[] getCast() {
        return cast;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public Integer getMovieID() {
        return movieID;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

}
