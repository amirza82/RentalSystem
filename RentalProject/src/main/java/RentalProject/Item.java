package RentalProject;

import java.util.Date;

public class Item {

    private String title;
    private String genre;
    private Integer ID;
    private Date releaseDate;
    private boolean isAvailable = true;


    public Item(String title, String genre, Integer ID, Date releaseDate){
        this.title = title;
        this.genre = genre;
        this.ID = ID;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public Integer getID() {
        return ID;
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
