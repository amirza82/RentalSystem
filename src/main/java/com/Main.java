package com;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Main{
    public static void main(String[] args) throws IOException {

        RentalStore store = new RentalStore();

       Gson gson = new Gson();
       Reader reader = new FileReader("C:\\Users\\zahab\\Desktop\\nit-2\\RentalSystem\\RentalProject\\TestYourFork.json");

       All all = gson.fromJson(reader, new TypeToken<All>() {}.getType());
       reader.close();

       store.setAvailableBooksList(all.Books);
       store.setAvailableGamesList(all.Games);
       store.setAvailableMoviesList(all.Movies);
       store.setCustomerList(all.Customers);

       //Joshn Smith
        store.rentBook(store.getBookByID(3), store.getCustomerByID(1));
        store.rentBook(store.getBookByID(2), store.getCustomerByID(1));

        //Emily
        store.rentBook(store.getBookByID(1), store.getCustomerByID(2));
        store.rentBook(store.getBookByID(7), store.getCustomerByID(2));
        
        //Michael Brown
        store.rentBook(store.getBookByID(9), store.getCustomerByID(3));
        store.rentGame(store.getGameByID(6), store.getCustomerByID(3));

        all.Books = (ArrayList<Book>) store.getAvailableBooksList();
        all.Games = (ArrayList<Game>) store.getAvailableGamesList();
        all.Movies = (ArrayList<Movie>) store.getavailableMovies();
        all.Customers = (ArrayList<Customer>) store.getCustomerList();

        
        
        gson = new Gson();

        String json = gson.toJson(all);

        try {
           
            FileWriter writer = new FileWriter("C:\\Users\\zahab\\Desktop\\nit-2\\RentalSystem\\RentalProject\\output.json");
        
            writer.write(json);

            writer.close();

            System.out.println("JSON data has been written to the file successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}