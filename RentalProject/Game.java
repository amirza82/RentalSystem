package RentalProject;

import java.sql.Date;

public class Game extends Item{
    
    private String studio;

    public Game(String studio, String title, String genre, Date releaseDate, Integer ID){
        super(title, genre, ID, releaseDate);
        this.studio = studio;
    }
    
    public String getStudio() {
        return studio;
    }
}
