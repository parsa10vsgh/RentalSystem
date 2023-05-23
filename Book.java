import java.util.Date;

public class Book extends Item {

    private final String publisher;
    private final String author;

    public Book(String title, String genre, String author, String publisher, Date releaseDate, int ID, int rentalFee) {
        super(title, genre, releaseDate, ID, rentalFee);
        this.author = author;
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void rentItem(Customer customer) {
        this.setAvailable(false);
        Rental rental = new Rental(this, customer, Integer.parseInt(customer.getID() + String.valueOf(this.getID())));
        customer.getRental().add(rental);
        System.out.println("Book Rented");
    }

    public void returnItem(Rental rental) {
        this.setAvailable(false);
        rental.getCustomer().getRental().remove(rental);


    }
}
