package RentalProject;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Rental {
    private Movie movie;
    private Customer customer;
    private Date rentalDate;
    private Date returnDate;
    private Integer rentalID;

    public Rental(Movie movie, Customer customer, Integer rentalID) {
        this.movie = movie;
        this.customer = customer;
        this.rentalID = rentalID;
        this.rentalDate = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(rentalDate);
        c.add(Calendar.DATE, 14);
        this.returnDate = c.getTime();
        movie.setAvailable(false);
        
    }

    public Integer getRentalID() {
        return rentalID;
    }

    public Movie getMovie() {
        return movie;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate){
        this.rentalDate = returnDate;
    }

    public double calculateLateFee(){
        double dalyLateFee = 1.5;
        Date Now = new Date();
        long daysLate = TimeUnit.DAYS.convert(returnDate.getTime() - Now.getTime(), TimeUnit.MILLISECONDS);
        if (daysLate <= 0) {
            return 0.0;
        }else{
            return dalyLateFee * daysLate;
        }
    }
}
