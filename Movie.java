import java.util.Date;

public class Movie extends Item {
    private final  String director;
    private final String cast;
    public Movie (String title,String genre,String cast, String director,Date releaseDate,int ID, int rentalFee){
        super(title, genre, releaseDate, ID, rentalFee);
        this.cast = cast;
        this.director = director;
    }

    public String getCast() {
        return cast;
    }

    public String getDirector() {
        return director;
    }

    public void rentItem(Customer customer) {
        this.setAvailable(false);
        Rental rental = new Rental(this, customer, Integer.parseInt(customer.getID() + String.valueOf(this.getID())));
        customer.getRental().add(rental);
        System.out.println("Movie Rented");
    }

    public void returnItem(Customer customer) {
        this.setAvailable(false);


    }
}
