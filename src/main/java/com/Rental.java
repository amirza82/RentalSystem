package com;


import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Rental {
    private Item item;
    private Integer customerID;
    private Date rentalDate;
    private Date returnDate;
    private Integer rentalID;

    public Rental(Item item, Customer customer) {

        this.item = item;
        this.customerID = customer.getCustomerID();
        this.rentalID =Integer.parseInt(item.getID().toString() + customer.getCustomerID().toString());
        this.rentalDate = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(rentalDate);
        c.add(Calendar.DATE, 14);
        this.returnDate = c.getTime();
        item.setAvailable(false);
    }

    public Integer getRentalID() {
        return rentalID;
    }

    public Item getItem() {
        return item;
    }

    public Integer getCustomerID() {
        return customerID;
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
