package com;


import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerID;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private List <Rental> rentals;

    public Customer(String name, String email, String phoneNumber, String address, Integer customerID) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.customerID = customerID;
        this.rentals = new ArrayList<Rental>();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public void addRental(Rental rental){
        this.rentals.add(rental);
    }
    
    public void removeRental(Rental rental){
        this.rentals.remove(rental);
    }
        
    



}
