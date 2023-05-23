import java.util.ArrayList;
import java.util.List;

public class RentalStore {
    private final List<Customer> customers;
    private final List<Movie> movies;
    private final List<Movie> availableMovies;

    public RentalStore() {
        this.availableMovies = new ArrayList<>();
        this.customers = new ArrayList<>();
        this.movies = new ArrayList<>();
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Movie> getAvailableItems() {
        return availableMovies;
    }

    public List<Movie> getItems() {
        return movies;
    }

    public void addItem(Movie movie) {
        this.movies.add(movie);
        this.availableMovies.add(movie);
    }

    public void removeItem(Movie movie) {
        this.availableMovies.remove(movie);
        this.movies.remove(movie);
    }
    public void register(Customer customer) {
        this.customers.add(customer);
    }
    public Movie getMovieBiID(int ID) {
        for(Movie movie:movies) {
            if(movie.getID() == ID) {
                return movie;
            }
        }
        return null;
    }

    public Customer getCustomByID(int ID) {
        for(Customer customer:customers) {
            if (customer.getID() == ID) {
                return customer;
            }
        }
        return null;
    }

    public void rentItem(Movie movie, Customer customer) {
        if (this.availableMovies.contains(movie) && this.customers.contains(customer)) {
            movie.rentMovie(customer);
            this.availableMovies.remove(movie);
        }
    }

    public void returnItem(Rental rental) {
        rental.getMovie().returnMovie(rental);
        this.availableMovies.add(rental.getMovie());
    }
}
