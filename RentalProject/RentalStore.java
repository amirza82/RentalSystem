package RentalProject;

import java.util.List;

public class RentalStore {

    private List <Movie> availableMoviesList;
    private List <Customer> customerList;

    public void register(Customer customer){
        customerList.add(customer);
    }

    public void addMovie(Movie movie){
        availableMoviesList.add(movie);
    }

    public void removeMovie(Movie movie){
        availableMoviesList.remove(movie);
    }

    public List<Movie> getavailableMovies(){
        return availableMoviesList;
    }
    
    public void rentMovie(Movie movie, Customer customer){
        if (availableMoviesList.contains(movie) && customerList.contains(customer)) {

            customer.addRental(new Rental(movie, customer));
            availableMoviesList.remove(movie);

        }else if(availableMoviesList.contains(movie)){
            
            System.out.println("you are not registered");
        
        }else{

            System.out.println("the movie is not available");

        }
    }

    public void returnMovie(Rental rental){
        rental.getMovie().setAvailable(true);
        availableMoviesList.add(rental.getMovie());
        rental.getCustomer().removeRental(rental);
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

    public Movie getMovieByID(Integer MovieID){
        for (Movie movie : availableMoviesList) {
            if (movie.getMovieID().equals(MovieID)) {
                return movie;
            }
        }
        System.out.println("No movie found with this ID.");
        return null;
    }

}
