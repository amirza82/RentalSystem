package RentalProject;

import java.sql.Date;

public class Book extends Item {
    private String[] writers;
    
    public Book (String title, String genre, Date releasDate, Integer ID, String[] writers){
        super(title, genre, ID, releasDate);
        this.writers = writers;
    }

    public String[] getWriters() {
        return writers;
    }
}
