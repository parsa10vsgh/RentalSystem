import java.util.Date;

public class Movie {
    private final String title;
    private final  String genre;
    private final Date release;
    private final int rentalFee;
    private final int ID;
    private Boolean available;
    public Movie(String title,String genre,Date release,int rentalFee,int ID){
        this.ID = ID;
        this.release = release;
        this.rentalFee = rentalFee;
        this.genre = genre;
        this.title = title;
        this.available = true;
    }

    public int getID() {
        return ID;
    }

    public Date getRelease() {
        return release;
    }

    public int getRentalFee() {
        return rentalFee;
    }

    public String getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public void rentMovie(Customer customer) {
        this.setAvailable(false);
        Rental rental = new Rental(this, customer, Integer.parseInt(customer.getID() + String.valueOf(this.getID())));
        customer.getRental().add(rental);
        System.out.println("Movie Rented");    }
    public void returnMovie(Rental rental) {
        this.setAvailable(true);
        rental.getCustomer().getRental().remove(rental);
    }
}
