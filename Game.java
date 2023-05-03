import java.util.Date;

public class Game extends Item{
    private final String publisher;
    private final String platform;

    public Game(String title, String genre, String platform, String publisher, Date releaseDate, int ID, int rentalFee) {
        super(title, genre, releaseDate, ID, rentalFee);
        this.platform = platform;
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getPlatform() {
        return platform;
    }

    public void rentItem(Customer customer) {
        this.setAvailable(false);
        Rental rental = new Rental(this, customer, Integer.parseInt(customer.getID() + String.valueOf(this.getID())));
        customer.getRental().add(rental);
        System.out.println("Game Rented");
    }

    public void returnItem(Customer customer) {
        this.setAvailable(false);


    }
}
