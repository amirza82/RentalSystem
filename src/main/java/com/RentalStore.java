package com;


import java.util.List;

public class RentalStore {

    private List <Game> availableGamesList;
    private List <Book> availableBooksList;
    private List <Movie> availableMoviesList;
    private List <Customer> customerList;

    public void setAvailableGamesList(List<Game> availableGamesList) {
        this.availableGamesList = availableGamesList;
    }

    public void setAvailableBooksList(List<Book> availableBooksList) {
        this.availableBooksList = availableBooksList;
    }

    public void setAvailableMoviesList(List<Movie> availableMoviesList) {
        this.availableMoviesList = availableMoviesList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public void register(Customer customer){
        customerList.add(customer);
    }

    //------------------- MOVIE STUFF -------------------------------------------

    public void addMovie(Movie movie){
        availableMoviesList.add(movie);
    }

    public void removeMovie(Movie movie){
        availableMoviesList.remove(movie);
    }

    public List<Movie> getavailableMovies(){
        return availableMoviesList;
    }
    
    public void rentMovie(Movie movie, Customer customer) {
        if (availableMoviesList.contains(movie) && customerList.contains(customer)) {

            customer.addRental(new Rental(movie, customer));
            availableMoviesList.remove(movie);

        }else if(availableMoviesList.contains(movie)){
            
            System.out.println("you are not registered.");
        
        }else{

            System.out.println("the movie is not available.");

        }
    }

    public void returnMovie(Rental rental) {
        Item item = rental.getItem();
        if (item instanceof Movie) {
            item.setAvailable(true);
            availableMoviesList.add((Movie) item);
            this.getCustomerByID(rental.getCustomerID()).removeRental(rental);
        } else {
            throw new IllegalArgumentException("The rental item must be a movie.");
        }
    }
    
    public Movie getMovieByID(Integer MovieID) {
            for (Movie movie : availableMoviesList) {
                if (movie.getID().equals(MovieID)) {
                    return movie;
                }
            }
            System.out.println("No movie found with this ID.");
            return null;
        }

    //----------------- GAME STUFF -----------------------------------------

    public void addGame(Game game) {
        availableGamesList.add(game);
    }

    public void removeGame(Game game){
        availableGamesList.remove(game);
    }

    public List<Game> getAvailableGamesList(){
        return availableGamesList;
    }

    public void rentGame(Game game, Customer customer){
        if (availableGamesList.contains(game) && customerList.contains(customer)) {

            customer.addRental(new Rental(game, customer));
            availableGamesList.remove(game);

        }else if (availableGamesList.contains(game)){

            System.out.println("you are not registered.");

        }else{

            System.out.println("the game is not available.");
        }
    }

    public void returnGame(Rental rental) {
        Item item = rental.getItem();
        if (item instanceof Game) {
            item.setAvailable(true);
            availableGamesList.add((Game) item);
            this.getCustomerByID(rental.getCustomerID()).removeRental(rental);
        } else {
            throw new IllegalArgumentException("The rental item most be game.");
        }
    }

    public Game getGameByID(Integer GameID){
        for (Game game : availableGamesList) {
            if (game.getID().equals(GameID)) {

                return game;
            }
        }
        return null;
    }

    //----------------- BOOK STUFF --------------------------------

    public void addBook(Book book) {
        availableBooksList.add(book);
    }

    public void remiveBook(Book book){
        availableBooksList.remove(book);
    }

    public List<Book> getAvailableBooksList(){
        return availableBooksList;
    }

    public void rentBook(Book book, Customer customer){
        if (availableBooksList.contains(book) && customerList.contains(customer)) {
            customer.addRental(new Rental(book, customer));
            availableBooksList.remove(book);
        }else if (availableBooksList.contains(book)) {
            System.out.println("You are not registerd.");
        }else{
            System.out.println("The game is not available.");
        }
    }

    public void returnBook(Rental rental){
        Item item = rental.getItem();
        if (item instanceof Book) {
            item.setAvailable(true);
            this.getCustomerByID(rental.getCustomerID()).removeRental(rental);
            availableBooksList.add((Book)rental.getItem());
        }else{
            throw new IllegalArgumentException("The rental item must be book.");
        }
    }
    
    public Book getBookByID(Integer BookID){
        for (Book book : availableBooksList) {
            if (book.getID().equals(BookID)) {

                return book;
            }
        }
        return null;
    }


    public Customer getCustomerByID(Integer customerID) {
        for (Customer customer : customerList) {
            if (customer.getCustomerID().equals(customerID)) {
                return customer;
            }
        }
        System.out.println("No customer found with this ID.");
        return null;
    }

    public List<Customer> getCustomerList(){
        return customerList;
    }



}
